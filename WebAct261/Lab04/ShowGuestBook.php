<?php
$f = file("no2.txt");

if (file_exists("no2.txt")) {
    $i = 1;
    foreach ($f as $ff) {
        $fx = explode(",", $ff);
        echo ("No." . $i . "<br>Last name:" . $fx[1] . "<br>First name:" . $fx[0] . "<br><br>");
        $i++;
    }
}
