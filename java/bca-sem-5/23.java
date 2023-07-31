import java.util.Scanner;

class Main {

    static int getVowels(String str){
        int count = 0;
        String s = str.toLowerCase();
        
        for(char c: s.toCharArray())
            if(c == 'a' || c=='e' || c=='i'|| c=='o'|| c=='u') count++;

        return count;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String to count vowels: ");
        String str = sc.nextLine();

        System.out.println("The number of vowels in "+str+" are "+getVowels(str));
        
        sc.close();
        
    }
}

//Write a Program & design a method to count all vowels in a string.