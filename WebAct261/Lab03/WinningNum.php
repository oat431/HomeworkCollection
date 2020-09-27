<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Winning</title>
</head>
<body>
    <h1>The Winning numbers</h1>
    <?php 
        $arrNum = [];
        for($i = 1;$i<=100;$i++){
            array_push($arrNum,$i);
        } 
        shuffle($arrNum);
        
        for($i = 0;$i<5;$i++){
            echo $arrNum[$i]."<br>";
        }
    ?> 
</body>
</html>