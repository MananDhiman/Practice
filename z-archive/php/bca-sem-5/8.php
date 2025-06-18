<?php
  if(isset($_POST['submit'])) {
    $num = $_POST['num'];
    $factorial = 1;

    while($num > 0){
        $factorial *= $num;
        $num--;
    }

    echo "Factorial of '.$num.' is: ".$factorial;
    
  }

?>

<html>
<body>
  <form action="#" method="POST">
    Enter Number to find factorial of: <br>
    <input type="text" name="num"><br>
    <input type="submit" name="submit" value="Submit">
  </form>

</body>
</html>