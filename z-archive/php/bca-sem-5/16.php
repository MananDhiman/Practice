<?php
  if(isset($_POST['submit'])) {
    $str = $_POST['str'];
    $lower_case = 0;
    $upper_case = 0;

    // 65 to 92, 97 122
    for($i = 0; $i<strlen($str); $i++) {
      $char = $str[$i];
      if($char == ' ') continue;

      $ascii = ord($char);
      if($ascii >= 65 && $ascii <= 92) $upper_case++;
      elseif($ascii >= 97 && $ascii <= 122) $lower_case++;
    }
  

    echo "The number of lowercase char is $lower_case and The number of uppercase char is $upper_case";
  }

?>

<html>
<body>
  <form action="#" method="POST">
    Enter string to get uppercase and lowercase:<br>
    <input type="text" name="str"><br>
    <input type="submit" name="submit" value="Submit">
  </form>

</body>
</html>