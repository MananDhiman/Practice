class Main {
  public static void main(String[] args) {
    int num = 1234;

    int count = 0;

    int n = num;
    while(n !=0) {
      n /= 10;
      count++;
    }

    System.out.println(count);
  }
}