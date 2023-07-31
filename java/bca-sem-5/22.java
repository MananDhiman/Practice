import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three numbes to find average of: ");
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        double num3 = sc.nextDouble();

        double average = (num1+num2+num3) / 3;
        System.out.println("The average of the three numbers is: "+average);
        
        sc.close();
    }
}

// Compute the average of three numbers through a Java Program.