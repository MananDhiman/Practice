<?php
  if(isset($_POST['submit'])) {
    $str = $_POST['str'];

    $l = strlen($str);
    $count = 0;
    $l_vowels = ['a','e','i','o','u'];
    $u_vowels = ['A','E','I','O','U'];

    for($i = 0; $i<$l; $i++) 
      if(in_array($str[$i], $l_vowels) || in_array($str[$i], $u_vowels)) $count++;
    
    echo "The number of vowels is $count";  
  } 

?>

<html>
<body>
  <form action="#" method="POST">
    String is:<br>
    <input type="text" name="str" value="Develop & Empower Individuals"><br>
    <input type="submit" name="submit" value="Submit">
  </form>

</body>
</html>