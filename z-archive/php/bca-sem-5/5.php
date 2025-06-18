<?php
  if(isset($_POST['submit'])) {
    $num = $_POST['num'];

    for ($i = 0; $i<=10; $i++)
        echo $num." * ".$i." = ".$num*$i."<br>";
  }

?>

<html>
<body>
  <form action="#" method="POST">
    Enter Number to Print Table Of:<br>
    <input type="text" name="num"><br>
    <input type="submit" name="submit" value="Submit">
  </form>

</body>
</html>
