class Main {
    static int printFib(int n){
        if(n == 1) return 1;

        return printFib(n - 1) + printFib(n - 2);
    }

    public static void main(String[] args) {
        printFib(3);
    }
}
