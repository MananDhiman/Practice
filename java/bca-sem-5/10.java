import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a number to get its corresponding day: ");
        int dayNum = sc.nextInt();

        sc.close();

        if(dayNum < 1 || dayNum > 7){
            System.out.println("Enter Number between 1 and 7 inclusive");
            return;
        } 

        String[] days = {null,"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};

        System.out.println("The day is: "+days[dayNum]);      
    }
}
// Write program that gets a number from the user and generates an integer between 1 and 7 subsequently should display the name of the weekday as per that number.