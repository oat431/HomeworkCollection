<?php
    session_start();

    $realNum = $_SESSION['realNum'];
    
    include __DIR__."/../template/layout.php"; 
    include __DIR__."/../template/giveUp.php";

    session_destroy();