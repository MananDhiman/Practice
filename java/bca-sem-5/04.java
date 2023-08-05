import java.util.Scanner;

class Main {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter temperature in Fahrenheit: ");
        double tempFahrenheit = sc.nextDouble();

        double tempCelsius = (tempFahrenheit - 32) * 5 / 9;
        System.out.println("Temperature in Celsius is: " + tempCelsius);
        
        sc.close();
    }
}

// Write a program to convert temperature from Fahrenheit to Celsius degree using Java.

