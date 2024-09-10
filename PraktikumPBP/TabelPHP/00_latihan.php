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
        th, td {
            border: 1px solid black;
            padding: 8px 12px;
        }
        th {
            background-color: #f2f2f2;
        }
    </style>
</head>
<body>

<?php
// Data mahasiswa dan nilai
$mahasiswa = [
    'Abdul' => [89, 90, 54],
    'Budi' => [78, 60, 64],
    'Nina' => [67, 56, 84]
];

// Hitung rata-rata
function rataRata($nilai) {
    return array_sum($nilai) / count($nilai);
}

// Tampilkan tabel
echo "<table><tr><th>Nama</th><th>Nilai 1</th><th>Nilai 2</th><th>Nilai 3</th><th>Rata-rata</th></tr>";

foreach ($mahasiswa as $nama => $nilai) {
    echo "<tr><td>$nama</td><td>{$nilai[0]}</td><td>{$nilai[1]}</td><td>{$nilai[2]}</td><td>" . number_format(rataRata($nilai), 2) . "</td></tr>";
}

echo "</table>";
?>

</body>
</html>
