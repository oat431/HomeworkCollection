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

        public function registration(){
            $title = "Registration Page";
            include __DIR__."/../templates/registration.html.php";
            if(isset($_POST['submit'])){
                $valid = true;
                $error = [];
                $email = $_POST['useremail'];
                $name = $_POST['username'];
                $password = $_POST['userpassword'];
                
                if($email == ""){
                    $valid = false; 
                    array_push($error,"Missing email");
                }
                if($name == ""){
                    $valid = false;
                    array_push($error,"Missing name");
                }
                if($password == ""){
                    $valid = false;
                    array_push($error,"Missing Missing passowrd");
                }
                if(strlen($password) < 6){
                    $valid = false;
                    array_push($error,"Password less than 6 characterr");
                }
                
                if(!preg_match("/[a-zA-Z0-9]/",$password)){
                    $valid = false;
                    array_push($error,"invalid password");
                }
                
                if($valid) {
                    $password = password_hash($password,PASSWORD_BCRYPT);
                    $this->BMITable->resgistration($this->con,$name,$email,$password);
                    ob_clean();
                    include __DIR__."/../templates/layout.html.php";
                    include __DIR__."/../templates/regfinisht.html.php";
                } else {
                    ob_clean();
                    include __DIR__."/../templates/layout.html.php"; 
                    include __DIR__."/../templates/resunfinish.html.php";
                }              

            }
        }
    }