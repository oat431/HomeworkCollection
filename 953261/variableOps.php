<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Variable operation</title>
</head>

<body>
    <?php
    $w = 5;
    $x = 25;
    $y = 13;
    $z = 101;

    $a = number_format($w + $x,2);
    $b = number_format($z - $y,2);
    $c = number_format($z / $w,2);
    $d = number_format($y * $x,2);

    
    ?>

    <?php
    echo "<p>w = $w</p>";
    echo "<p>x = $x</p>";
    echo "<p>y = $y</p>";
    echo "<p>z = $z</p>";
    echo "<br>";
    echo "<p>$a = w + x</p>";
    echo "<p>$b = z - y</p>"; 
    echo "<p>$c = z / w</p>";
    echo "<p>$d = y * x</p>";
    echo "<br>";
    echo "<p>A = $a || B = $b || C = $c || D = $d</p>";
    $wxyz = ($a+=($b+=($c+=$d)));
    echo "<p>$wxyz</p>"; 
    ?>
</body>

</html>