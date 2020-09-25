<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>is Valid Triangle</title>
</head>
<body>
    <?php 
        $a = $_GET['a'];
        $b = $_GET['b'];
        $c = $_GET['c'];
    ?>
    <h1>
        <?php 
            echo $a + $b <= $c || $a + $c <= $b || $b + $c <= $a ? "This triangle is possible" : "This triangle is not possible";
        ?> 
    </h1>
</body>
</html>