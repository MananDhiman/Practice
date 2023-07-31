import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter Number of Elements in array: ");
        int n = sc.nextInt();
        
        int[] nums = new int[n];
        
        System.out.printf("Enter "+n+" Elements to add in first array: ");
        for(int i=0;i<n;i++) nums[i] = sc.nextInt();

        int[] newArr = new int[n];

        for(int i=0; i<n; i++) newArr[i] = nums[i];

        System.out.println("Iterating new array");
        for(int i: newArr) System.out.printf("%d ",i);

        sc.close();
    }
}

// Design a program to copy an array by iterating the array.