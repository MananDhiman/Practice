<?php
  if(isset($_POST['submit'])) {
    $low = $_POST['low'];
    $high = $_POST['high'];
    $num = $_POST['num'];

    check_if_num_in_range($num, $low, $high);
  }

  function check_if_num_in_range($num, $low, $high) {
    for($i = $low; $i<=$high; $i++) {
      if($num == $i) {
        echo "$num found in range between $low and $high";
        return;
      }
    }
    echo "$num not found in range between $low and $high";
  }

?>

<html>
<body>
  <form action="#" method="POST">
    Enter Lower Bound Number:<br>
    <input type="text" name="low"><br>
    Enter Upper Bound Number:<br>
    <input type="text" name="high"><br>
    Enter Number to find:<br>
    <input type="text" name="num"><br>
    <input type="submit" name="submit" value="Submit">
  </form>

</body>
</html>