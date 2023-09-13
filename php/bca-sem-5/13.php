<?php
  if(isset($_POST['submit'])) {
    $str = $_POST['str'];

    $l = 0; $r = strlen($str) - 1;

    $is_palindrome = true;

    while($l < $r) {
      if($str[$l] != $str[$r]) {
        $is_palindrome = false;
        break;
      }

      $l++;
      $r--;
    }

    if($is_palindrome) echo "$str is palindrome";
    else echo "$str is not palindrome";
  }

?>

<html>
<body>
  <form action="#" method="POST">
    Enter String to check palindrome or not:<br>
    <input type="text" name="str"><br>
    <input type="submit" name="submit" value="Submit">
  </form>

</body>
</html>