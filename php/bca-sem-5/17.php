<?php
  if(isset($_POST['submit'])) {
    $str = $_POST['str'];
    $str .= " ";
    $str_array = array();

    $word = "";
    $len = strlen($str);
    for($i =0; $i<$len; $i++) {
      $word .= $str[$i];

      if($str[$i] == ' ' || $i == $len - 1) {
        array_push($str_array, $word);
        $word = "";
      }
      // if($i == $len - 1) array_push($str_array," ", $word);
    }

    echo "The reversed string is: <br>";
    for($i = count($str_array) - 1; $i>=0; $i--) {
      echo $str_array[$i];
    }

  }

?>

<html>
<body>
  <br><br>
  <form action="#" method="POST">
    Enter String to Reverse:<br>
    <input type="text" name="str"><br>
    <input type="submit" name="submit" value="Submit">
  </form>

</body>
</html>

