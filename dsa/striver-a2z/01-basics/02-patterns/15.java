class Main {
  public static void main(String[] args) {
    char c = 'A';

    for(int i=5; i>=1; i--) {
      for(int j=i; j>=1; j--) {
        System.out.print(c + " ");
        c++;
      }
      c = 'A';
      System.out.println();
    }
  }
}
