<?php
    $title = "Main Page";
    ob_start();
    include __DIR__."/../templates/layout.html.php";
    include __DIR__."/../templates/home.html.php";
    include __DIR__."/../templates/footer.html.php";