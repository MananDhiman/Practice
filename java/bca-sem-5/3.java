import java.util.Scanner;

class Main {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Radius of Circle");
        double radius = sc.nextDouble();

        System.out.println("Enter Length and Breadth of Rectangle");
        double length = sc.nextDouble();
        double breadth = sc.nextDouble();

        System.out.println("Enter Base and Height of Right Angled Triangle");
        double base = sc.nextDouble();
        double height = sc.nextDouble();

        System.out.println("Enter Side of Square");
        double side = sc.nextDouble();

        System.out.println("Area of Circle is: "+(Math.PI * radius * radius));
        System.out.println("Area of Rectangle is: "+(length * breadth));
        System.out.println("Area of Triangle is: "+(base * height * 1/2));
        System.out.println("Area of Square is: "+(side * side));
        
        sc.close();
        
    }
}

// Write a Java program to compute area of:
// 1) Circle2) rectangle 3) triangle 4) square