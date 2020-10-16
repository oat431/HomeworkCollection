<?php 
    if(!isset($_COOKIE['visit'])){ 
        $_COOKIE['visit'] = 0;
    }

    if(!isset($_COOKIE['date'])){
        $_COOKIE['date'] = "";
    }

    date_default_timezone_set("UTC"); 
    $visit = $_COOKIE['visit'] + 1;
    $date = date('F,d,y H:i a'); 
    setcookie('visit',$visit,time() + 3600 * 24 * 365);
    setcookie('date',$date,time()+3600 * 24 * 365);
    if($visit > 1){
        $word = "you have been visit for $visit times";
        $showDate = "Your last visit was $date";
    }else{
        $word = "Welcome you must be new here";
        $showDate = "";
    }
?>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Try Cookies</title>
</head>
<body>
    <h1><?=$word?></h1>
    <p><?=$showDate?></p>
    <a href="resetCookies.php">reset</a>
</body>
</html>