<?php 
    $title = "search song";
    include __DIR__."/../templates/layout.html.php";
    
    if(isset($_GET['searchBTN'])) {
        $findSong = $_GET['search'];
        $url = "http://localhost/953261/Lab08/song/{$findSong}";
        echo $url;
        $curl = curl_init();
        curl_setopt($curl,CURLOPT_URL,$url);
        curl_setopt($curl,CURLOPT_HTTPHEADER, ['Content-Type: application/json']);
        curl_setopt($curl, CURLOPT_RETURNTRANSFER, true);
        $res = curl_exec($curl);
        $res = json_decode($res,true);
    }
    include __DIR__."/../templates/search.html.php";