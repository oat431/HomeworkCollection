<?php 
    if(!($_GET['weight'] >= 58 && $_GET['height'] <= 76)){
        echo " <script >alert('incorrect value');location.href = 'bmi.html';</script>";
    }
    if(!($_GET['heigth'] >= 100 && $_GET['height'] <= 200)){
        echo " <script >alert('incorrect value');location.href = 'bmi.html';</script>";
    }
    $data = array(
        "weight" => $_GET['weight'],
        "heigth" => $_GET['heigth']
    );
    print_r($data);
    echo "<br>";
    echo "Your BMI calcution is ".($data['weight'] / ($data['heigth'] * $data['heigth'])) * 703
?>