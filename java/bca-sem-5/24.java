import java.util.Scanner;

class Main {

    static int getWords(String str){
        int count = 1;
        
        for(char c: str.toCharArray())
            if(c == ' ') count++;

        return count;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String to count words: ");
        String str = sc.nextLine();

        sc.close();
        if(str.length() == 0){
            System.out.println("Empty String Entered");
            return;
        } 

        System.out.println("The number of words in "+str+" are "+getWords(str));

    }
}
// Write a Java method to count all words in a string.