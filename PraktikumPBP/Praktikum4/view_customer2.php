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

// Fitur pagination
$per_page = 10;
$page = isset($_GET['page']) ? (int)$_GET['page'] : 1; // Casting ke integer
$start = ($page - 1) * $per_page;

// Query dengan fitur pencarian, pengurutan, dan pagination
$query = "SELECT customerid AS ID, name AS Nama, address AS Alamat, city AS Kota FROM customers $where ORDER BY $order_by $order_dir LIMIT $start, $per_page";

$result = $conn->query($query);

if (!$result) {
    die("Query error: " . $conn->error);
}
?>

<!DOCTYPE html>
<html>
<head>
    <title>Data Pelanggan</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css">
</head>
<body>
<div class="container">
    <h1>Data Pelanggan</h1>

    <form method="GET">
        <div class="input-group mb-3">
            <input type="text" class="form-control" name="search" placeholder="Cari pelanggan">
            <button class="btn btn-primary" type="submit">Cari</button>
        </div>
    </form>

    <table class="table table-striped">
        <thead>
            <tr>
                <th>No</th>
                <th>
                    <a href="?order_by=name&order_dir=<?php echo $order_dir == 'ASC' ? 'DESC' : 'ASC'; ?>">Nama</a>
                </th>
                <th>Alamat</th>
                <th>Kota</th>
                <th>Aksi</th>
            </tr>
        </thead>
        <tbody>
            <?php
            $i = 1; // Inisialisasi nomor urut
            while ($row = $result->fetch_object()) {
                echo "<tr>";
                echo "<td>" . $i . "</td>";
                echo "<td>" . $row->Nama . "</td>";
                echo "<td>" . $row->Alamat . "</td>";
                echo "<td>" . $row->Kota . "</td>";
                echo "<td>
                        <a class='btn btn-warning btn-sm' href='edit_customer.php?id=" . $row->ID . "'>Edit</a>&nbsp;
                        <a class='btn btn-danger btn-sm' href='confirm_delete_customer.php?id=" . $row->ID . "'>Delete</a>
                      </td>";
                echo "</tr>";
                $i++;
            }
            ?>
        </tbody>
    </table>
    <br/>
    <?php
    echo 'Total Rows = ' . $result->num_rows; // Menampilkan jumlah total data
    $result->free();
    $conn->close(); // Menutup koneksi database
    ?>
</div>
</body>
</html>
