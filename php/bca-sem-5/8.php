<?php
    $num = readline('Enter Number to find factorial of: ');
    $factorial = 1;

    while($num > 0){
        $factorial *= $num;
        $num--;
    }

    echo "Factorial is: ".$factorial;

?>