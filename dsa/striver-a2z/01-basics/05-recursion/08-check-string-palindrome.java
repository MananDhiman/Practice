class Main {

  static boolean pal(String s) {
    return pal(s, 0);
  }

  static boolean pal(String s, int i) {
    int l = i, r = s.length() - 1 - i;

    if(l >= r) return true;
    
    return (s.charAt(l) == s.charAt(r)) 
      && pal(s, i+1);
  }
  public static void main(String[] args) {
    String s = "racecar";
    String t = "nitingg";

    System.out.println(pal(s));
    System.out.println(pal(t));
  }
}