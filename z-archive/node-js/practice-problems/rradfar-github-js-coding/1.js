const solution = number => {
    // Your solution
    let sum = 0;
    for(let i=1; i<number; i++) {
        if(i % 3 == 0 || i % 5 == 0) 
            sum += i;
    }

    return sum;
};

console.log(solution(0)); // 0
console.log(solution(-15)); // 0
console.log(solution(10)); // 23
console.log(solution(20)); // 78
console.log(solution(200)); // 9168