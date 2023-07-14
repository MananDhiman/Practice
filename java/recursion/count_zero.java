class count_zero {
    public static void main(String[] args) {
        System.out.println(countZero(1010010110));
    }
    static int countZero(int num){
        int count = 0;
        if(num % 10 == 0) count = 1;
        if(num < 10) return count;
        return count + countZero(num / 10);
    }
}
