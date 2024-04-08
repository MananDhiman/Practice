const HR_TO_MIN = 60;
const MIN_TO_SEC = 60;
const SEC_TO_MILLIS = 1000;

const past = (h, m, s) => {
    // Your solution
    let millis = 0;

    millis += h * HR_TO_MIN * MIN_TO_SEC * SEC_TO_MILLIS;
    millis += m * MIN_TO_SEC * SEC_TO_MILLIS;
    millis += s * SEC_TO_MILLIS;
    

    console.log("------");
    return millis;
};

console.log(past(0, 0, 0)); // 0
console.log(past(0, 1, 1)); // 61000
console.log(past(1, 0, 0)); // 3600000
console.log(past(1, 0, 1)); // 3601000
console.log(past(1, 1, 1)); // 3661000