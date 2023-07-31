<?php
    $maxNum = readline('Enter Max fibionacci number: ');

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
?>