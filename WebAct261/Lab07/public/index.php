<?php

include __DIR__."/../class/HitCounter.php";
$cout = new HitCounter();
$cout->setCnt();
$totalCount = $cout->getCnt();
include __DIR__."/../template/hitCounter.html.php";


