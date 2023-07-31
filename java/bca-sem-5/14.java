import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter Number of Elements in array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.printf("Enter "+n+" Elements to add in array: ");
        for(int i=0;i<n;i++) nums[i] = sc.nextInt(); 

        int sum = 0;

        for(int i: nums) sum += i;
        
        double average = (double) sum / n;
        System.out.println("The average of numbers is "+average);
        sc.close();
        
    }
}

// Calculate the average value of array elements through Java Program.