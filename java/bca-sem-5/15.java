import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter Number of Elements in array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.printf("Enter "+n+" Elements to add in array: ");
        for(int i=0;i<n;i++) nums[i] = sc.nextInt(); 

        System.out.println("Enter num to find in array");
        int numToCheck = sc.nextInt();

        sc.close();
        for(int i=0; i<n; i++){
            if(nums[i] == numToCheck){
                System.out.println("Number "+nums[i]+ " found at index"+i);
                return;
            }
        }

        System.out.println("Number not found");
    }
}

// Write a Java program to test if an array contains a specific value.