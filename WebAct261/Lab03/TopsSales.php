<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Top Sales</title>
</head>
<body>
    <h1>Gosseling Automotive</h1>
    <h2>Top Five Salespeople in January</h2> 
    <hr/>
    <?php 
        $Salespeople = array(
            "Hiroshi Morinaga" => 57,
            "Judith Stein" => 44,
            "Jose Martinea" => 26,
            "Tyrone Wnters" => 22,
            "Raja Singh" => 21
        ); 
    ?>
    <table>
        <tr>
            <td>name</td>
            <td>Car</td> 
        </tr>
        <?php 
            foreach($Salespeople as $name => $car){
                echo "<tr>";
                echo "<td>".$name."</td>";
                echo "<td>".$car."</td>";
                echo "</tr>";
            } 
        ?> 
    </table>
</body>
</html>