const vowel = ['a','e','i','o','u'];

const disemvowel = str => {
    // Your solution
    return .filter((i) => {
        return vowel.includes(i);
    });
};
  
console.log(disemvowel('This website is for losers LOL!')); // 'Ths wbst s fr lsrs LL!'