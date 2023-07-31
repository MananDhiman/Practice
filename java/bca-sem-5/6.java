import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number of Minutes");
        int minutes = sc.nextInt();

        //1 day = 24hrs * 60min
        int days = (int) minutes /(24*60);
        //1 y = 365 d
        int years = days / 365;
        
        System.out.printf("%d minutes are %d years, and %d days",minutes,years,days);
        
        sc.close();
    }
}
// Write a program to convert minutes into a number of years and days.