<html>
<body>
  <form action='#' method="POST">
	Enter First Number
    <input type="text" name="number1" placeholder="Enter First Number"><br>
	Enter First Number
    <input type="text" name="number2" placeholder="Enter Second Number"><br>
    <input type="submit" name="submit" value="Submit">
  </form>
  sasa
</body>
</html>

<?php
  if(isset($_POST['submit'])) {
    $num1 = $_POST['number1'];
    $num2 = $_POST['number2'];

    echo "Sum of numbers is: ".$num1+$num2."<br>";
    echo "subtraction of numbers is: ".$num1-$num2."<br>";
    echo "multiplication of numbers is: ".$num1*$num2."<br>";
    echo "division of numbers is: ".$num1/$num2."<br>";
    echo "exponent of numbers is: ".pow($num1,$num2)."<br>";
  }
?>
