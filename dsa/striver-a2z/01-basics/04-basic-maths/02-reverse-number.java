class Main {
  public static void main(String[] args) {
    
    int num = 1234;
    int n = num;
    int reversedNumber = 0;

    while(n != 0) {
      int lastDigit = n % 10;
      n /= 10; 
      reversedNumber = reversedNumber * 10 + lastDigit;
    }

    System.out.println(reversedNumber);
  }
}