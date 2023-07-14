class lc {
    public static int arraySign(int[] nums) {
        int product = 1;

        for(int num: nums)
            product *= num;

        if(product > 0) return 1;
        else if(product < 0) return -1;
        else return 0;
    }
    public static void main(String[] args) {
        int[] arr = {41,65,14,80,20,10,55,58,24,56,28,86,96,10,3,84,4,41,13,32,42,43,83,78,82,70,15,-41};
        System.out.println(arraySign(arr));
    }
    
}
