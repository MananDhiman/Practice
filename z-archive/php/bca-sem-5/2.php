<html>
<body>
  <form action='#' method="POST">
    <input type="text" name="radius" placeholder="Enter Radius of Circle: "><br>
    <input type="text" name="rectangle_length" placeholder="Enter Length of Rectangle: "><br>
    <input type="text" name="rectangle_breadth" placeholder="Enter Breadth of Rectangle: "><br>
    <input type="text" name="triangle_base" placeholder="Enter base of triangle: "><br>
    <input type="text" name="triangle_height" placeholder="Enter height  of triangle: "><br>
    <input type="text" name="side" placeholder="Enter side of square: "><br>
    <input type="text" name="trap_base_1" placeholder="Enter base 1 of trapezium: "><br>
    <input type="text" name="trap_base_2" placeholder="Enter base 2 of trapezium: "><br>
    <input type="text" name="trap_height" placeholder="'Enter height of trapezium: "><br>
    <input type="text" name="par_length" placeholder="Enter length of parallelogram: "><br>
    <input type="text" name="par_breadth" placeholder="Enter breadth of parallelogram: "><br>
    
    <input type="submit" name="submit" value="Submit">
  </form>
</body>
</html>

<?php
  if(isset($_POST['submit'])) {
    $radius = $_POST['radius'];
    $rectangle_length =$_POST['rectangle_length'];
    $rectangle_breadth = $_POST['rectangle_breadth'];
    $triangle_base = $_POST['triangle_base'];
    $triangle_height = $_POST['triangle_height'];
    $side = $_POST['side'];
    $trap_base_1 = $_POST['trap_base_1'];
    $trap_base_2 = $_POST['trap_base_2'];
    $trap_height = $_POST['trap_height'];
    $par_length = $_POST['par_length'];
    $par_breadth = $_POST['par_breadth'];

    echo "Area of Circle is = ".(22/7) * $radius * $radius."<br>";
    echo "Area of Rectangle is = ".$rectangle_length * $rectangle_breadth."<br>";
    echo "Area of Triangle is = ". (1/2) * $triangle_base * $triangle_height."<br>";
    echo "Area of square is = ". $side * $side."<br>";
    echo "Area of trapezium is = ".(($trap_base_1+$trap_base_2)/2)*$trap_height."<br>";
    echo "Area of parallelogram is = ".$par_breadth * $par_length."<br>";
  }
?>