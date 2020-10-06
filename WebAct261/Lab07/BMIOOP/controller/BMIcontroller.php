<?php
    class BMIcontrol{
        private $BMITable;
        private $con;
        public function __construct(){
            include __DIR__."/../include/DatabaseConnection.php";
            include __DIR__."/../classes/DatabaseTable.php";
            $this->con = $pdo;
            $this->BMITable = new DatabaseTable($this->con,"bmi","id");
        } 

        public function home(){
            $title = "Main Page";
            include __DIR__."/../templates/layout.html.php";
            include __DIR__."/../templates/home.html.php";
            include __DIR__."/../templates/footer.html.php";
        }

        public function list(){
            $title = "Add new BMI";
            $data = $this->BMITable->allBMIs($this->con);
            include __DIR__."/../templates/BMIs.html.php";
        }

        public function add(){
            if(isset($_POST['submit'])){
                $N = $_POST['Name'];
                $W = $_POST['wei'];
                $H = $_POST['hei'];
                $BMI = $W / ($H * $H);
                $this->BMITable->insertBMI($this->con,$N,$W,$H,$BMI);
            }
            
            $title = "Add new BMI";
            include __DIR__."/../templates/addBMI.html.php";
        }
    }