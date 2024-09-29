<?php
// Koneksi ke database (ganti dengan koneksi Anda)
$servername = "localhost";
$username = "root";
$password = "";
$dbname = "bookorama";

$conn = new mysqli($servername, $username, $password, $dbname);
if ($conn->connect_error) {
    die("Koneksi gagal: " . $conn->connect_error);
}

// Fitur pencarian
$search = isset($_GET['search']) ? $_GET['search'] : '';
$where = $search ? "WHERE name LIKE '%$search%'" : '';

// Fitur pengurutan
$order_by = isset($_GET['order_by']) ? $_GET['order_by'] : 'customerid';
$order_dir = isset($_GET['order_dir']) ? $_GET['order_dir'] : 'ASC';

// Query dengan fitur pencarian dan pengurutan
$query = "SELECT * FROM customers $where ORDER BY $order_by $order_dir";

$result = $conn->query($query);

// Fitur pagination
$per_page = 10;
$page = isset($_GET['page']) ? $_GET['page'] : 1;
$start = ($page - 1) * $per_page;

$result = $conn->query($query . " LIMIT $start, $per_page");

if (!$result) {
    die("Query error: " . $conn->error);
}

?>

<!DOCTYPE html>
<html>
    <head>
        <title>Data Pelanggan</title>
        <link
            rel="stylesheet"
            href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css">
    </head>
    <body>
        <div class="container">
            <h1>Data Pelanggan</h1>

            <form method="GET">
                <div class="input-group mb-3">
                    <input
                        type="text"
                        class="form-control"
                        name="search"
                        placeholder="Cari pelanggan">
                    <button class="btn btn-primary" type="submit">Cari</button>
                </div>
            </form>

            <table class="table table-striped">
                <thead>
                    <tr>
                        <th>No</th>
                        <th>
                            <a
                                href="?order_by=name&order_dir=<?php echo $order_dir == 'ASC' ? 'DESC' : 'ASC'; ?>">Nama</a>
                        </th>
                        <th>Alamat</th>
                        <th>Kota</th>
                        <th>Aksi</th>
                    </tr>
                </thead>
                <tbody>
                    <?php
                $no = 1;
                while ($row = $result->fetch_assoc()) {
                    echo "<tr>";
                    echo "<td>" . $no++ . "</td>";
                    echo "<td>" . $row['name'] . "</td>";
                    echo "<td>" . $row['address'] . "</td>";
                    echo "<td>" . $row['city'] . "</td>";
                    echo "<td>
                        <a href='edit_customer.php?id=" . $row['customerid'] . "' class='btn btn-warning btn-sm'>Edit</a>
                        <a href='delete_customer.php?id=" . $row['customerid'] . "' class='btn btn-danger btn-sm' onclick=\"return confirm('Apakah Anda yakin ingin menghapus data ini?')\">Hapus</a>
                    </td>";
                    echo "</tr>";
                $i++;
             }
            echo '</table>';
            echo '<br/>';
            echo 'Total Rows =' .$result->num_rows;
            $result->free();
            $db->close();
            
            ?>
                </table>
            </div>
        </div>