<?php
    $radius = readline('Enter Radius of Circle: ');
    $rectangle_length = readline('Enter Length of Rectangle: ');
    $rectangle_breadth = readline('Enter Breadth of Rectangle: ');
    $triangle_base = readline('Enter base of triangle: ');
    $triangle_height = readline('Enter height of triangle: ');
    $side = readline('Enter Side of square: ');
    $trap_base_1 = readline('Enter base 1 of trapezium: ');
    $trap_base_2 = readline('Enter base 2 of trapezium: ');
    $trap_height = readline('Enter height of trapezium: ');
    $par_length = readline('Enter length of parallelogram: ');
    $par_breadth = readline('Enter breadth of parallelogram: ');

    echo "Area of Circle is = ".(22/7) * $radius * $radius."\n";
    echo "Area of Rectangle is = ".$rectangle_length * $rectangle_breadth."\n";
    echo "Area of Triangle is = ". (1/2) * $triangle_base * $triangle_height."\n";
    echo "Area of square is = ". $side * $side."\n";
    echo "Area of trapezium is = ".(($trap_base_1+$trap_base_2)/2)*$trap_height."\n";
    echo "Area of parallelogram is = ".$par_breadth * $par_length."\n";
?>