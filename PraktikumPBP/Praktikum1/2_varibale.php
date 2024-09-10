<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <?php // Define a function
function diskon() {
    $harga = 1000;
    $harga = 0.2 * $harga;
}

$harga = 2000;
diskon();
echo 'harga = '.$harga.'<br />';
?>
</body>
</html>