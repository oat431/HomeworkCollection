<?php
    try{
        include __DIR__."/../include/DatabaseConnection.php";
        include __DIR__."/../include/DatabaseFunction.php";
        
    } catch(PDOException $e){
        echo $e;
    }

    ob_start();
    $title = "Show BMIs list";
    $rec = totalBMIs($pdo);
    $data = allBMIs($pdo); 
    include __DIR__."/../templates/layout.html.php";
    include __DIR__."/../templates/BMIs.html.php";