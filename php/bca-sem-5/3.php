<?php
    echo 'Quadratic equation is ax2 + bx + c =0'."\n";
    $a = readline('Enter value of a: ');
    $b = readline('Enter value of b: ');
    $c = readline('Enter value of c: ');

    $d = pow(($b*$b) - (4*$a*$c),1/2);
    $root1 = (-$b + $d) / (2*$a);
    $root2 = (-$b - $d) / (2*$a);

    echo "The first root is: ".$root1."\n";
    echo "The second root is: ".$root2."\n";
?>