<?php 
    $title = "add song";
    include __DIR__."/../templates/layout.html.php";
    include __DIR__."/../templates/newSong.html.php";
    
    if(isset($_POST['submit'])){
        $url = "http://localhost/953261/Lab08/song/";
        $Name_song = ["songname" => $_POST['song']];
        $Name_song = json_encode($Name_song);
        $ch = curl_init();
        curl_setopt($ch, CURLOPT_URL,$url);
        curl_setopt($ch, CURLOPT_POSTFIELDS,$Name_song);
        curl_setopt($ch, CURLOPT_POST, true);
        $res = curl_exec($ch);
        curl_close($ch); 
    }