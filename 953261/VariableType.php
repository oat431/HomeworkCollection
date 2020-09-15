<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=, initial-scale=1.0">
    <title>Variable Type</title>
</head>
<body>
    <?php
        $myhousenumber = 27;
        $myZipcode = 62000;
        $myaddress = "$myhousenumber 6 Tha khun ram , Kamphanephet, $myZipcode";
        echo "<p>myare is contain ".gettype($myhousenumber)." type as myhousenumber value $myhousenumber</p> <p>and ".gettype($myZipcode)." type as my zipcode value $myZipcode</p>";
        echo "<p>and I use ".gettype($myaddress)."type as my adress and my address is $myaddress</p>";
    ?> 
</body>
</html>