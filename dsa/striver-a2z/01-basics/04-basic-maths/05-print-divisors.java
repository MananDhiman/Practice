class Main {
  public static void main(String[] args) {
    int num = 600_000_000;


    long startTime = System.currentTimeMillis();
    
    bruteForce(num);
    
    // optimised(num);
    long endTime = System.currentTimeMillis();
    System.out.println("Time Taken By Program is "+(endTime-startTime)+ " milliseconds");
  }

  static void bruteForce(int num) {
    for(int i=1; i<=num; i++) {
      if(num % i == 0) {
        // System.out.print(i + " ");
      }

        
    }
    System.out.println("\n");
  }

  static void optimised(int num) {
    for(int i=1; i<=Math.sqrt(num); i++) {

      // one method
      if(num % i == 0) {
        int d = num / i;
        // System.out.print(i + " " + d + " ");
      }

      // two method
      // int d = num / i;
      // if(d == 0) {
      //   System.out.print(i + " " + d);
      // }
    }
    System.out.println("\n");
  }
}