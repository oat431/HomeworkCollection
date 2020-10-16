<?php
    include __DIR__."/../controller/gamelogic.php";
    include __DIR__."/../template/layout.php";
     

    session_start();
    
    if(!isset($_SESSION['cnt'])) {
        $_SESSION['cnt'] = 0;
    }
    
    if(!isset($_SESSION['realNum'])) {
        $_SESSION['realNum'] = randNumber();
    }
    
    
    if(isset($_POST['submit'])){
        echo $_SESSION['realNum'];
        if($_POST['num'] == $_SESSION['realNum']){
            echo "yay you win";
            echo "<script>window.location.href='w.php'</script>";
        }else if($_POST['num'] > $_SESSION['realNum']){
            echo "need to be lesser";
        }else if($_POST['num'] < $_SESSION['realNum']){
            echo "need to be greater";
        }
        $_SESSION['cnt'] = $_SESSION['cnt'] + 1;
    }

    $cnt = $_SESSION['cnt'];
    include __DIR__."/../template/game.php";