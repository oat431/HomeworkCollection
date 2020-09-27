<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>BeanCounting</title>
</head>
<body>
    <?php 
        function CountBs($word){
            $cnt = 0;
            echo "Output of the CountBs(\"$word\")";
            for($i=0;$i<strlen($word);$i++){
                if($word[$i] == 'B' or $word[$i] == 'b'){
                    $cnt++;
                }
            }
            echo "function is ";
            return $cnt;
        }
        function CountChar($word,$char){
            $cnt = 0;
            echo "Output of the CountChar(\"$word\",'$char')";
            $word = strtolower($word);
            $char = strtolower($char);
            for($i=0;$i<strlen($word);$i++){
                if($word[$i] == $char){
                    $cnt++;
                }
            }
            echo "function is ";
            return $cnt;
        }    
    ?>

    <p>
        <strong>
            <?php 
                echo CountBs("BBC");
            ?>
        </strong>
    </p>
    <p>
        <strong>
            <?php 
                echo CountChar("SahacHan",'h');
            ?>
        </strong>
    </p>
</body>
</html>