<?php
class DatabaseTable{
    private $pdo;
    private $table;
    private $primaryKey;

    public function __construct($pdo,$table,$primaryKey){
        $this->pdo = $pdo;
        $this->table = $table;
        $this->primaryKey = $primaryKey;
    }
    
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

    function resgistration($pdo,$name,$email,$password){
        $sql = "INSERT INTO bmiuser(name,email,password) values ('$name','$email','$password')";
        $pdo->exec($sql);
    }
}