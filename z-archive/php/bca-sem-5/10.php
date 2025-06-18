<?php

    $marksSum = 0;

    echo "Enter Marks in 5 subjects: \n";
    for($i = 0; $i<5;$i++)
        $marksSum += readline();

    $avg = $marksSum / 5;
    echo "Average Marks are: ".$avg."\n";

    if($avg > 80) echo "Excellent";
    else if($avg > 60) echo "Good";
    else if($avg > 40) echo "Pass";
    else echo "Fail";
    
?>