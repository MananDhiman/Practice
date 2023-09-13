<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>PHP</title>
</head>
<body>
    <form action="pendrive.php" method="post">
        Enter The Word To Be Sorted : <input type="text" name="num1" id="1"><br>
        
        <br><input type="submit" name = "submit" value="Submit">
    </form>

</body>
</html>

<?php
if(isset($_POST["submit"])){
    $var1 = $_POST["num1"];
    $sort = str_split($var1);
    sort($sort);
    echo "The Sorted Word Is : " , implode($sort);
}
    
?>