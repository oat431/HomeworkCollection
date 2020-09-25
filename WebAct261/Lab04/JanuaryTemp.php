<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>January Temperature</title>
</head>

<body>
    <h2>The temperatures for the first week in January</h2>
    <hr />

    <?php
    $January = "48,42,68\n";
    $January .= "48,42,69\n";
    $January .= "49,42,69\n";
    $January .= "49,42,61\n";
    $January .= "49,42,65\n";
    $January .= "49,42,62\n";
    $January .= "49,42,62\n";

    file_put_contents("sfjanaverages.txt", $January);
    $file = file("sfjanaverages.txt");
    $i = 0;
    $j = 1;
    foreach ($file as $f) {
        $fileex = explode(",", $f);
        echo ("<p><b>Day" . ($j) . "</b></p>" . "<p>Mean:" . $fileex[$i] . "<p>Low:" . $fileex[$i + 1] . "<p>High:" . $fileex[$i + 2] . "<br><br>");
        $j = $j + 1;
    }
    ?>
</body>

</html>