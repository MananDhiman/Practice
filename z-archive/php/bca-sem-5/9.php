<?php
  if(isset($_POST['submit'])) {
    $low = $_POST['low'];
    $high = $_POST['high'];

    echo "Prime Numbers in range are: <br>";
    for($i=$low; $i<$high; $i++) {
      $isPrime = true;

      for($j = 2; $j < $i; $j++) {
        if($i % $j == 0) {
          $isPrime = false;
          break;
        } 
      }

      if($isPrime) echo $i . "<br>";
    }
    
  }

?>

<html>
<body>
  <form action="#" method="POST">
    Enter Range of Numbers to Find Prime Numbers in:<br>
    <input type="text" name="low" placeholder="low"><br>
    <input type="text" name="high" placeholder="high"><br>
    <input type="submit" name="submit" value="Submit">
  </form>

</body>
</html>