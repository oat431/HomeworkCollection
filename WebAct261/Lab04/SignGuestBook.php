<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Sign Guest Book</title>
</head>

<body>
    <?php
    function write($f, $l)
    {
        $file = fopen("no2.txt", 'a');
        if ($f == null || $l == null) {
            echo "You must enter your first and last name! Click your browser's Back button to return to the form.";
        } else {
            fwrite($file, $l);
            fwrite($file, ",");
            fwrite($file, $f);
            fwrite($file, "\n");
            echo ("<p>Add successfully!!</p><a href='GuestBook.html'>Back</a>");
        }
        fclose($file);
    }

    write($_POST['first_name'], $_POST['last_name']);

    ?>
</body>

</html>