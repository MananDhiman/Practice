import java.util.*;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number of Elements in array");
        int n = sc.nextInt();

        ArrayList<Integer> listIntegers = new ArrayList<>();
        ArrayList<String> listString = new ArrayList<>();

        System.out.println("Enter Numbers to add in array");
        for(int i=0; i<n; i++) listIntegers.add(sc.nextInt());

        System.out.println("Enter words to add in array");
        for(int i=0; i<n; i++) listString.add(sc.next());

        System.out.println("");

        Collections.sort(listIntegers);
        Collections.sort(listString);

        System.out.println("Sorted Numeric List is: ");
        for(Integer i: listIntegers) System.out.printf("%d ",i);
        System.out.println("");

        System.out.println("Sorted Word List is: ");
        for(String s: listString) System.out.printf("%s ",s);

        sc.close();
        
    }
}
// Design & execute a program in Java to sort a numeric array and a string array.   