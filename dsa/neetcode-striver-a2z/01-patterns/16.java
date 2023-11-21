class Main {
  public static void main(String[] args) {
    char c = 'A';

    for(int i=0; i<5; i++) {
      for(int j=0; j<=i; j++) {
        char ch = (ch) c + i;
        System.out.print(String.valueOf(c + i) + " ");

      }
      System.out.println();
    }
  }
}
