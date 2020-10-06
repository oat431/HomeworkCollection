<?php
    class HitCounter{
        private $cnt;
        public function __construct(){}
        
        public function setCnt(){
            include __DIR__."/../include/DatabaseConnection.php";
            $sql = "INSERT INTO counter() values()";
            $con->exec($sql);

            $update = "SELECT * from counter";
            $data = $con->query($update)->fetchAll();
            $this->cnt = count($data);
        }
        
        public function getCnt(){
            return $this->cnt;
        }
    }