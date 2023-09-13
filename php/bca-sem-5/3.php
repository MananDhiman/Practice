<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <form action='#' method="POST">
        <input type="text" name="a" placeholder="Enter value of a"><br>
        <input type="text" name="b" placeholder="Enter value of b"><br>
        <input type="text" name="c" placeholder="Enter value of c"><br>
        <input type="submit" name="submit" value="Submit">
    </form>
</body>
</html>
<?php

    if(isset($_POST['submit'])) {
        $a = $_POST['a'];
        $b = $_POST['b'];
        $c = $_POST['c'];

        $d = pow(($b*$b) - (4*$a*$c),1/2);
        $root1 = (-$b + $d) / (2*$a);
        $root2 = (-$b - $d) / (2*$a);

        echo "The first root is: ".$root1."\n";
        echo "The second root is: ".$root2."\n";
    }
    
    
?>