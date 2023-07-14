class Main {
    static int sumNaturalNumbers(int num){
        if(num == 0) return 0;

        return num + sumNaturalNumbers(num-1);
    }
    public static void main(String[] args) {
        System.out.println(sumNaturalNumbers(1000));
    }
}
