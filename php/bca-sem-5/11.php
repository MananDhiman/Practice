<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    
</body>
</html>

<?php
$matrix1 =[[2 ,4 ,5],
          [7 ,1, 9 ],
          [5 ,6, 8] ];

$matrix2 =[[2 ,4 ,5],
          [7 ,1, 9 ],
          [5 ,6, 8]];

$matrix3 = [[0 ,0, 0],
            [0 ,0, 0],
            [0 ,0, 0]];

$matrix[0] = $matrix1;
$matrix[1] = $matrix2;
$matrix[2] = $matrix3;

function print_matrix($num){
    global $matrix;
    for($i = 0 ; $i < 3 ; $i ++){
        for($j = 0 ; $j < 3 ; $j++){

            echo $matrix[$num-1][$i][$j]  ," ";
        }
        echo "<br>";
    }
}

print_matrix(1);
