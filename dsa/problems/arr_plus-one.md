# Algo
Time Complexity - 0 (n)


iterate array starting from last element 
if any num < 9, add 1 to that num and return array
else set that num to 0 bcs 9 + 1 = (1)0

if reached outside loop meaning no num < 9,
so create new array of length+1, and set new array[0] = 1

and return new array
```java

public int[] plusOne(int[] digits) {
  int len = digits.length;
  
  for(int i=len-1; i>=0; i--) {
    if(digits[i] < 9){
      digits[i]++;
      return digits;
    }

    digits[i] = 0;
  }

  int[] ans = new int[len+1];
  ans[0] = 1;
  return ans;
}
```