<?php
    try{
        include __DIR__."/../include/DatabaseConnection.php";
        include __DIR__."/../include/DatabaseFunction.php";
    } catch(PDOException $e){
        echo $e;
    }

    ob_start();
    $title = "Add new BMI";
    include __DIR__."/../templates/layout.html.php";
    include __DIR__."/../templates/addBMI.html.php";