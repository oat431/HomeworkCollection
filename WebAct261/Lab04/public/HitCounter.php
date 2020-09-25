<?php
if (file_exists("../includes/hitcount.txt")) {
    $i = file_get_contents("../includes/hitcount.txt");
    $i++;
    file_put_contents("../includes/hitcount.txt", $i);
}
include __DIR__ . "/../templates/HitCounter.html.php";
