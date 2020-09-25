<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Minimum</title>
</head>
<body>
    <?php 
        function minimum(){
            $Num = func_get_args();
            $min = $Num[0]; 
            echo "Output of Minimum(";
            foreach($Num as $i){
                echo "$i,";
                if($min > $i){
                    $min = $i;
                }
            }
            echo ") is ";
            return $min;
        } 
    ?> 

    <h1><?php echo minimum(2,9,16) ?></h1>
    <h1><?php echo minimum(1,7,-3) ?></h1>
</body>
</html>