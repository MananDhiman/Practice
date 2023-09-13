<?php
  if(isset($_POST['submit'])) {

    $side1 = $_POST['first'];
    $side2 = $_POST['second'];
    $side3 = $_POST['third'];

    if($side1 != $side2 && $side1 != $side3 && $side2 != $side3) echo "Triangle is isoceles\n";
    else echo "Triangle is not isoceles\n";
  }
    
?>

<html>
<body>
  <form action='#' method="POST">
    Enter First side of triangle:<br>
    <input type="text" name="first" placeholder="Enter First side of triangle: "><br>
    Enter Second side of triangle:<br>
    <input type="text" name="second" placeholder="Enter second side of triangle: "><br>
    Enter Third side of triangle:<br>
    <input type="text" name="third" placeholder="Enter third side of triangle: "><br>

    <input type="submit" name="submit" value="Submit">
  </form>
</body>
</html>