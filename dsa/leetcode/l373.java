import java.util.*;

class l373 {
    public static List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        ArrayList<List<Integer>> ans = new ArrayList<List<Integer>>();
   
        int n = nums1.length, m = nums2.length;
        int i = 0, j = 0;
        while(k > 0){
            List<Integer> list = new ArrayList<>();
            list.add(nums1[i]);
            list.add(nums2[j]);
            ans.add(list);

            if(i == n-1 && j == m-1) break;
            if(nums1[i+1] < nums2[j+1]) i++;
            else if(nums2[j+1] <= nums1[i+1]) j++;
            k--;
        }

        return ans;
    }

    public static void main(String[] args){
        int[] num1 = {1,7,11};
        int[] num2 = {2,4,6};

        System.out.println(kSmallestPairs(num1,num2,3));
    }
    
}
