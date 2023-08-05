import java.util.*;

class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Numbers: ");
        int firstNumber = sc.nextInt();
        int secondNumber = sc.nextInt();

        System.out.println("Sum of numbers "+firstNumber+", "+secondNumber+" is = "+(firstNumber+secondNumber));
        System.out.println("Difference of numbers "+firstNumber+", "+secondNumber+" is = "+(firstNumber-secondNumber));
        System.out.println("Product of numbers "+firstNumber+", "+secondNumber+" is = "+(firstNumber*secondNumber));
        System.out.println("Division of numbers "+firstNumber+", "+secondNumber+" is = "+(firstNumber/secondNumber));
        
        sc.close();
    }
}

//Write a program to perform following operations on two numbers input by the user:1) Addition 2) subtraction 3) multiplication 4) division