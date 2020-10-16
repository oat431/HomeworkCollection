<?php
        session_start();
        session_destroy();
        include __DIR__."/../template/layout.php"; 
        include __DIR__."/../template/win.php";