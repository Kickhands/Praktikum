<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <?php
    define("PWI", "Pemrograman Web dan Internet");
    echo 'Hari ini sedang praktikum '.PWI.'<br />';
    
    $constant_name = "PWI";
    echo 'Hari ini sedang praktikum '.constant($constant_name).'<br />';
    
    // Konstanta bawaan PHP
    echo 'File yang sedang diproses "'. __FILE__ .'" pada baris "'. __LINE__ .'"<br />';
?>    
</body>
</html>