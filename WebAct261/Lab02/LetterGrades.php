<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>showGrade</title>
</head>
<body>
        <?php 
            function showGrade($grade){
                $grade = strtolower($_GET['grade']);
                switch($grade){
                    case 'a': return "Your Grade is excellent.";
                    case 'b' : return "Your Grade is good.";
                    case 'c' : return "Your Grade is fair.";
                    case 'd' : return "Your are barely passing.";
                    case 'f' : return "your are failed";
                    default : return "this is not a grade";
                } 
            }
        ?>
    <h1>
        <?php echo showGrade($_GET['grade'])?>
    </h1>
</body>
</html>