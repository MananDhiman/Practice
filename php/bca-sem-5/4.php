<?php
    $side1 = readline('Enter First side of triangle: ');
    $side2 = readline('Enter second side of triangle: ');
    $side3 = readline('Enter third side of triangle: ');

    if($side1 != $side2 && $side1 != $side3 && $side2 != $side3) echo "Triangle is isoceles\n";
    else echo "Triangle is not isoceles\n";

?>