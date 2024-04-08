const century = year => {
    return Math.floor(year / 100) + 1;
  };
  
  console.log(century(1705)); // 18
  console.log(century(1900)); // 19
  console.log(century(1601)); // 17
  console.log(century(2000)); // 20
  console.log(century(89)); // 1