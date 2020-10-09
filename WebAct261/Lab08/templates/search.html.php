<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>
<body>
    <p>Find some song go ahead</p>
    <form action="searchSong.php" method='get'>
        <input type="text" name="search" placeholder="Find some song go ahead" />
        <input type="submit" value="Search" name='searchBTN'/> 
    </form> 
    <table>
        <thead>
            <tr>
                <th>#</th>
                <th>Song name</th>
            </tr>
        </thead> 
        <tbody>
            <?php
                if(@$res == NULL){
                    echo "Not found";
                } else {
                    foreach($res as $i){
                       echo "<tr>";
                       echo "<td>".$i['id']."</td>";
                       echo "<td>".$i['songname']."</td>";
                       echo "</tr>";
                    }
                }
            ?>
        </tbody>   
    </table>
</body>
</html>