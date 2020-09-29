<?php 
    $value = 0;
    try{
        $pdo = new PDO('mysql:host=localhost;dbname=lab05','root');
        $sql = "select value from click";
        $value = exec($sql);
    }catch(PDOException $e){
        echo $e;
    } 
?>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h1>There have been <?php echo $value?></h1>
</body>
</html>