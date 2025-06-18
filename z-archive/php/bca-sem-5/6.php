<?php
  if(isset($_POST['submit'])) {
    $num = $_POST['num'];

    $sum = $num*($num+1)/2;
    echo "The sum of first ".$num." natural numbers is: ".$sum;
    
  }

?>

<html>
<body>
  <form action="#" method="POST">
  Enter Number to Find Sum of n natural numbers: <br>
    <input type="text" name="num"><br>
    <input type="submit" name="submit" value="Submit">
  </form>

</body>
</html>