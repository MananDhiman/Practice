class c4 {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;

        int[] arr = new int[n + m];
        int itr1 = 0, itr2 = 0, itr = 0;

        while(itr1 < n && itr2 < m){
            if(nums1[itr1] < nums2[itr2]){
                arr[itr] = nums1[itr1];
                itr1++; 
                itr++;
            }
            else if(nums1[itr1] > nums2[itr2]){
                arr[itr] = nums2[itr2];
                itr2++;
                itr++;
            }
            else{
                arr[itr] = nums1[itr1];
                itr++;
                arr[itr] = nums2[itr2];
                itr++;
                itr2++;
                itr1++;
                
            }
        }

        if(itr1 < n){
            while(itr1 < n){
                arr[itr] = nums1[itr1];
                itr1++; 
                itr++;
            }
        }
        else if(itr2 < m){
            while(itr2 < m){
                arr[itr] = nums2[itr2];
                itr2++; 
                itr++;
            }
        }

        if((n+m) % 2 == 0){
            double a = arr[((n+m)/2)-1];
            double b = arr[(n+m)/2];

            return (a + b)/2;

        }else{
            return (double) arr[(n+m)/2];
        }

    }

    public static void main(String[] args) {
        int[] nums1 = {0,0,0,0,0};
        int[] nums2 = {-1,0,0,0,0,0,1};
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }
    
}
