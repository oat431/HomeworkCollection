<?php
    $pdo = new PDO("mysql:host=localhost;dbname=lab08",'root');
    $pdo->setAttribute(PDO::ATTR_ERRMODE,PDO::ERRMODE_EXCEPTION);
?>    