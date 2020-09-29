<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Guestbook</title>
</head>
<body>
    <nav>
        <a href="ShowGuestBook.php">show guest book</a> 
        <a href="index.php">Home</a>
    </nav> 
    <h2>
        <table>
            <tr>
                <td>First name</td> 
                <td>Last name</td> 
            </tr> 
            <?php 
            foreach($output as $i){
                echo "<tr>";
                echo "<td>".$i['Fname']."</td>";
                echo "<td>".$i['Lname']."</td>";
                echo "</tr>";     
            } 
        ?> 
        </table>
        
    </h2>
</body>
</html>