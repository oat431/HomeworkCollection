<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=, initial-scale=1.0">
    <title>Is Even</title>
</head>
<body>
    <?php
        $number = array(
            0 => 14,
            1 => 17,
            2 => 39.9,
            4 => "91/"
        );
        foreach($number as $i){
            if(is_numeric($i)){
                echo round($i) % 2 == 0 ? "<h1>$i is even number</h1>" : "<h1>$i is not even number not a number</h1>";
            }else{
                echo "<h1>$i is not a number or not a even</h1>";
            }
        }
    ?> 
</body>
</html>