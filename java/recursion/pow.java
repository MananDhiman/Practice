package recursion;

class pow {
    public static double myPow(double x, int n) {
        if(n == 0) return 1.00;

        if(n > 0) return myPow(x,--n)*x;
        else return myPow(x,++n)*(1/x);
    }

    public static void main(String[] args) {
        System.out.println(myPow(2.0, 10));
    }
    
}
