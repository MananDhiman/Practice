import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Three Numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        if(num1 > num2 && num1 > num3) System.out.println(num1 + " is the greatest");
        else if(num2 > num1 && num2 > num3) System.out.println(num2 + " is the greatest");
        else if(num3 > num1 && num3 > num2) System.out.println(num3 + " is the greatest");
        else System.out.println("Try Again with different Numbers");
        
        sc.close();
    }
}
//Write a Java program to determine greatest number of three numbers.