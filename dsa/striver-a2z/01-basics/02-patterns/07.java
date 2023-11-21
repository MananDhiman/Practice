class Main {
  public static void main(String[] args) {
    int leadingSpace = 4, stars = 1;

    for(int i=1; i<=5; i++) {
      for(int j=0; j<leadingSpace; j++) {
        System.out.print("  ");
      }
      leadingSpace--;

      for(int j=0; j<stars; j++) {
        System.out.print("* ");
      }
      stars += 2;

      System.out.println();
    }
  }
}
