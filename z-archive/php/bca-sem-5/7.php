<?php
    
?>

<?php
  if(isset($_POST['submit'])) {
    $maxNum = $_POST['maxNum'];

    $prev = 1;
    $curr = 1;
    $fibb = $prev + $curr;

    echo $prev." ";
    echo $curr." ";


    while($fibb < $maxNum){
        echo $fibb." ";
        $curr = $fibb;
        
        $fibb = $curr + $prev;
        $prev = $curr;
        
    }
    
  }

?>

<html>
<body>
  <form action="#" method="POST">
    Enter Max fibionacci number: <br>
    <input type="text" name="maxNum"><br>
    <input type="submit" name="submit" value="Submit">
  </form>

</body>
</html>