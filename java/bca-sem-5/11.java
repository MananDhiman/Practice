import java.util.Scanner;
import java.util.HashMap;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the month name: ");
        String monthName = sc.next().toLowerCase();

        HashMap<String, String> monthMap = new HashMap<>();
        monthMap.put("january", "31");
        monthMap.put("february", "29 if leap year, 28 otherwise");
        monthMap.put("march", "31");
        monthMap.put("april", "30");
        monthMap.put("may", "31");
        monthMap.put("june", "30");
        monthMap.put("july", "31");
        monthMap.put("august", "31");
        monthMap.put("september", "30");
        monthMap.put("october", "31");
        monthMap.put("november", "30");
        monthMap.put("december", "31");

        System.out.println("The number of days in "+monthName+" are: "+monthMap.get(monthName));

        sc.close();     
    }
}

// Construct a Java program to find the number of days in a month.