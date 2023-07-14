package recursion;

class is_sorted {
    public static void main(String[] args) {
        int[] arr = {1,7,8,90, 18,267,2887};
        System.out.println(isSorted(arr,0));
    }
    static boolean isSorted(int[] arr, int index){
        if(index == arr.length - 1) return true;

        return (arr[index] < arr[index + 1] &&
        isSorted(arr, index+1));
    }
}
