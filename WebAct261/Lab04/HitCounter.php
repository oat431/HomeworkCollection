<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Hit Counter</title>
</head>

<body>
    <?php
    if (file_exists("Hit.txt")) {
        $i = file_get_contents("Hit.txt");
        $i++;
        file_put_contents("Hit.txt", $i);
        echo ("<h1>There have been " . $i . " hits to this page!</h1>");
        echo ("<p>The counter file has been updated.");
    }
    ?>
</body>

</html>