<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>WhileLoop</title>
</head>
<body>
    <?php 
        /**
         * Sahachan Tippimwong 622115039
         * 18/06/2020  
        */
        $Count = 0;
        $Numbers = []; // move out the loop
        while($Count < 100) {  // change > To <
            ++$Count;
            $Numbers[$Count] = $Count;  // identify the key
        }
        foreach($Numbers as $i){ // move the foreach out
            echo $i.' '; 
        }
    ?> 
</body>
</html>