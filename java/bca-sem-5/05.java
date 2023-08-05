import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Length in Inches: ");
        double inches = sc.nextDouble();

        double metre = (inches * 2.54) / 100;
        
        System.out.println(inches+" Inches in Metre are: " + metre);

        sc.close();
        
    }
}

// Write a program through Java that reads a number in inches, converts it to meters.