<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>hit counting</title>
</head>

<body>
    <?php
    $cnt = 0;
    try {
        $pdo = new PDO('mysql:host=localhost;dbname=lab05', 'root');
        $sql = "INSERT into click (hit) values(1)";
        $pdo->exec($sql);

        $data = $pdo->query("SELECT hit FROM click")->fetchAll();
        $cnt = count($data);
    } catch (PDOException $e) {
        echo $e;
    }
    ?>
    <h1>There have been <?php echo $cnt; ?></h1>
</body>

</html>
