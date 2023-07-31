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
        
        System.out.println("The sum of numbers is "+sum);
        sc.close();
        
    }
}

// Write a program to sum values of an Single Dimensional array.