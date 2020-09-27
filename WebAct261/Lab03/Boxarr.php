<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>BoxArray</title>
</head>
<body>
    <?php 
        $box = array(
            "Small box" => array(
                "Length" => 12,
                "Width" => 10,
                "Depth" => 2.5,
            ),"Medium box" => array(
                "Length" => 30,
                "Width" => 20,
                "Depth" => 4,
            ),"Large box" => array(
                "Length" => 60,
                "Width" => 40,
                "Depth" => 11.5,
            ),
        ); 
    ?> 
    <table>
        <tr>
            <td>Box</td>
            <td>Value</td> 
        </tr>
        <?php 
            foreach($box as $boxSize => $boxValue){
                echo "<tr>";
                echo "<td>".$boxSize." has volume of ".$boxValue["Length"]*$boxValue["Width"]*$boxValue["Depth"]." ";
                echo "(" ;
                foreach($boxValue as $i){
                    echo $i."*";
                } 
                echo ") ";
                echo "</tr>";
            } 
        ?>
    </table>
</body>
</html>