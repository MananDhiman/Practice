import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Two Strings:");
        String s1 = sc.next();
        String s2 = sc.next();

        if(s1.equals(s2)) System.out.println("Strings are equal");
        else System.out.println("Strings are not equal");

        System.out.println("The length of first string is: "+s1.length()+ " and of second string is: "+s2.length());

        System.out.println("First string after converting to lowercase: "+s1.toLowerCase()+ " and second string is: "+s2.toLowerCase());
        System.out.println("First string after converting to uppercase: "+s1.toUpperCase()+ " and second string is: "+s2.toUpperCase());

        System.out.println("Result of concatenating strings: "+s1 + s2);

        System.out.println("Printing substring s1.substring(0,3): "+s1.substring(0,3));
        
        sc.close();
    }
}


//Write a program to perform following operations on strings:
// 1) Compare two strings.
// 2) Count string length.
// 3) Convert upper case to lower case & vice versa.
// 4) Concatenate two strings.
// 5) Print a substring.