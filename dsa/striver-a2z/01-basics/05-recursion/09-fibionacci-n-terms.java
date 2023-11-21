import java.util.HashSet;

class Main {

  static HashSet<Integer> set = new HashSet<>();

  static int fib(int n) {
    
    if(n == 0 || n <= 2) {
      System.out.println(n);
      return n;
    } 

    int fib = fib(n - 1) + fib(n - 2);
    if(!set.contains(fib)) {
      System.out.println(fib);
      set.add(fib);
    }
     
    return fib;
  }
  public static void main(String[] args) {
    int n = 10;
    fib(n);
  }
}