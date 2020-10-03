<?php 
    function totalBMIs($pdo){
        $sql = "SELECT * from bmi";

        $data = $pdo->query($sql)->fetchAll();

        return count($data);
    }

    function allBMIs($pdo){
        $sql = "SELECT * from bmi";

        $data = $pdo->query($sql)->fetchAll();

        return $data;
    }

    function insertBMI($pdo,$name,$height,$weight,$BMI){
        $sql = "INSERT INTO bmi(name,height,weight,BMI) VALUES('$name',$height,$weight,$BMI)";
        $pdo->exec($sql);
    }