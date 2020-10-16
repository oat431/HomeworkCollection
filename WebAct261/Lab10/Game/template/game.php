<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <p>You have tries<?=$cnt?> times</p>
    <h3>Guess a number from 1 - 100</h3>
    <form action="" method="post">
        <input type="number" name="num" />
        <input type="submit" value="Submit" name="submit" />
        <input type="reset" value="Reset" />
    </form> 
    <a href="up.php">Give up</a>
</body>
</html>