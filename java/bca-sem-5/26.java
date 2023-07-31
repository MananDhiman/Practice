import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number to Divide by zero: ");
        int num = sc.nextInt();

        try{
            int divideByZero = num / 0;
            System.out.println("Result = "+divideByZero);
        }catch(ArithmeticException e){
            System.out.println("You were trying to divide "+num+" by zero which is not possible");
        }

        int[] arr = new int[5];
        System.out.println("Enter 5 numbers to add to array: ");
        for(int i=0; i<5; i++) arr[i] = sc.nextInt();

        System.out.println("Enter an invalid index");
        int n = sc.nextInt();
        
        try{
            System.out.println(arr[n]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("You were trying to access index "+n+" in an array of max index 4");
        }

        sc.close();
        
    }
}

// Write a Java program to handle following exceptions:
// 1) Divide by Zero Exception.
// 2) Array Index Out Of B bound Exception.