<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <?php
    // Define the function
function diskon2( ){
    // Define harga as a static variable
    static $harga = 1000;
    $harga = 0.8 * $harga;
   
    echo 'harga = '.$harga.'<br />';
   }
   // Set harga to 2000
   $harga = 30;
   // Call the function twice
   diskon2();
   diskon2();
   // Display the harga
   echo 'harga = '.$harga.'<br />';
?>   
</body>
</html>