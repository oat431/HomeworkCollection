<?php 
    $title = "all song";
    include __DIR__."/../templates/layout.html.php";
    


    $url = "http://localhost/953261/Lab08/song/";
    $curl = curl_init();
    curl_setopt($curl,CURLOPT_URL,$url);
    curl_setopt($curl,CURLOPT_HTTPHEADER, ['Content-Type: application/json']);
    curl_setopt($curl, CURLOPT_RETURNTRANSFER, true);

    $response = curl_exec($curl);
    $result = json_decode($response,true);
    
    include __DIR__."/../templates/songs.html.php";