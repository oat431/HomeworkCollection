<?php
    try{
        $con = new PDO("mysql:host=localhost;dbname=lab07",'root');
        $con->setAttribute(PDO::ATTR_ERRMODE,PDO::ERRMODE_EXCEPTION);
    } catch(PDOException $e){
        echo $e;
    }
    