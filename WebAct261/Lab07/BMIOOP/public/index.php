<?php
    include __DIR__."/../include/DatabaseConnection.php";
    include __DIR__."/../controller/BMIcontroller.php";
    include __DIR__."/../templates/layout.html.php";
    try{
        $CBMI = new BMIcontrol();
        if(isset($_GET['add'])){
            $CBMI->add();
        } 
        if(isset($_GET['list'])){
            $CBMI->list();
        }
        include __DIR__."/../templates/home.html.php";
    }catch(PDOException $e){
        echo $e;
    }