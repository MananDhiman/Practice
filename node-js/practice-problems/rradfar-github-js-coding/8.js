const vowel = ['a','e','i','o','u'];

const getCount = str => {
    // Your solution
    let count = 0;
    for(i in str) {
        if(vowel.includes(str[i])) count++;
        // console.log(i);
    }

    return count;
};

console.log(getCount('my pyx')); // 0
console.log(getCount('pear tree')); // 4
console.log(getCount('abracadabra')); // 5
console.log(getCount('o a kak ushakov lil vo kashu kakao')); // 13