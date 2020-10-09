<?php
    function search($pdo,$name){
        return json_encode($pdo->query("SELECT * FROM song WHERE songname='$name'")->fetchAll());    }

    function showlist($pdo){
        return json_encode($pdo->query("SELECT * FROM song")->fetchAll());
    }
    
    function add($pdo,$input){
        $song = $input['songname'];
        $sql = "INSERT into song(songname) values('$song')";
        $pdo->exec($sql);
    }