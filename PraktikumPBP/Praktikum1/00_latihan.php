<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Data Mahasiswa</title>
    <style>
        table {
            width: 50%;
            border-collapse: collapse;
            margin: 20px 0;
            font-size: 18px;
            text-align: left;
        }
        table, th, td {
            border: 1px solid black;
        }
        th, td {
            padding: 8px 12px;
        }
        th {
            background-color: #f2f2f2;
        }
    </style>
</head>
<body>

<?php
// Array data mahasiswa
$array_mhs = array(
    'Abdul' => array(89, 90, 54),
    'Budi' => array(78, 60, 64),
    'Nina' => array(67, 56, 84)
);

// Fungsi untuk menghitung rata-rata nilai
function hitung_rata($array) {
    $total = array_sum($array); // Menjumlahkan semua nilai dalam array
    $count = count($array); // Menghitung jumlah elemen dalam array
    return $total / $count; // Mengembalikan nilai rata-rata
}

// Fungsi untuk menampilkan tabel data mahasiswa
function print_mhs($array_mhs) {
    echo "<table>";
    echo "<tr><th>Nama</th><th>Nilai 1</th><th>Nilai 2</th><th>Nilai 3</th><th>Rata-rata</th></tr>";

    // Loop melalui setiap mahasiswa dan tampilkan data mereka
    foreach ($array_mhs as $nama => $nilai) {
        $rata_rata = hitung_rata($nilai); // Hitung rata-rata untuk setiap mahasiswa

        // Tampilkan baris untuk setiap mahasiswa
        echo "<tr>";
        echo "<td>$nama</td>";
        echo "<td>{$nilai[0]}</td>";
        echo "<td>{$nilai[1]}</td>";
        echo "<td>{$nilai[2]}</td>";
        echo "<td>".number_format($rata_rata, 2)."</td>"; // Rata-rata dengan 2 desimal
        echo "</tr>";
    }

    echo "</table>";
}

// Panggil fungsi untuk menampilkan tabel
print_mhs($array_mhs);
?>

</body>
</html>
