class Main {
  public static void main(String[] args) {
    char c = 'A';

    for(int i=1; i<=5; i++) {
      for(int j=1; j<=i; j++) {
        System.out.print(c + " ");
        c++;
      }
      c = 'A';
      System.out.println();
    }
  }
}
