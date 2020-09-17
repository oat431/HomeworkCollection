<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=, initial-scale=1.0">
    <title>Days Array</title>
</head>

<body>
    <?php
    $Days = array(
        "Sunday" => "Dimanche",
        "Monday" => "Lundi",
        "Tuesday" => "Mardi",
        "Wednesday" => "Mercredi",
        "Thursday" => "Jeudi",
        "Friday" => "Vendredi",
        "Saturday" => "Samedi"
    );
    echo "the days of the week in english are :";
    foreach($Days as $key => $i){
        echo $key." ";
    }
    echo "<br>";
    echo "the days of the week in french are :";
    foreach($Days as $i){
        echo $i." ";
    } 
    ?>
</body>

</html>