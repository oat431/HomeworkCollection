<?php
if(isset($_COOKIE['visit'])){
    $_COOKIE['visit'] = 0;
}
$visit = 0;
setcookie('visit',$visit,time() + 3600 * 24 * 365);
?>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>reset</title>
</head>
<body>
    <p>Cookies have been reset.</p>
    <a href="LastVisit.php">Back</a> 
</body>
</html>