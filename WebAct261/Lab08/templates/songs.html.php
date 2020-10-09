<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>
<body>
    <table>
        <thead>
            <tr>
                <th>#</th>
                <th>Song name</th>
            </tr>
        </thead> 
        <tbody>
            <?php 
                 foreach($result as $i){
                    echo "<tr>";
                    echo "<td>".$i['id']."</td>";
                    echo "<td>".$i['songname']."</td>";
                    echo "</tr>";
                 }
            ?>
        </tbody>   
    </table>
</body>
</html>