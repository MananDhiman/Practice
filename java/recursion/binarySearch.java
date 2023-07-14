package recursion;
class BinarySearch{
    public static void main(String[] args) {
        
        int count = 0;
        for(int i=0; i<9;i++){
            System.out.println(count);
            count++;
        }
        int[] nArr = new int[count];
        int num = 1;
        for(int i=0; i<count;i++){    
            nArr[i] = num;
            num *= 2;
        }

        for(int n: nArr) search(nArr, 0, count, n);

 
        
    }
    static void search(int[] arr, int low, int high, int val){
        if(low == high){
            System.out.println("Not found");
            return;
        }
        int mid = (low + high)/2;
        if(val == arr[mid]) System.out.println("Val "+val+" found at "+mid);
        if(val < arr[mid]) search(arr, low, mid, val);
        else if(val > arr[mid]) search(arr, mid, high, val);
    }
}