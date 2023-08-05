import java.util.Scanner;

class Main {
    public static void main(String[] args){
        //formula
        //root = (-b +- (b^2 - 4ac)^(1/2)) / 2a
        Scanner sc = new Scanner(System.in);

        System.out.println("For quadratic equation ax2+bx+c=0 enter value of a,b and c: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        sc.close();

        double d = Math.pow((b*b) - (4*a*c),1/2); // d= b^2 - 4ac
        double root1 = (-b + d) / (2*a);
        double root2 = (-b - d) / (2*a);

        System.out.printf("The roots for equation %dx2 + %dx + %d = 0 are: %.2f, %.2f\n",(int)a,(int)b,(int)c,root1,root2);
        
    }
}
// Design a program in Java to solve quadratic equations using if, if else