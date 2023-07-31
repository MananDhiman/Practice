import java.util.*; 

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter Number of Elements in array: ");
        int n = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>();

        System.out.printf("Enter "+n+" Elements to add in array: ");
        for(int i=0; i<n;i++) list.add(sc.nextInt());

        System.out.println("Enter index of num to remove from array");
        int numToRemove = sc.nextInt();

        list.remove(numToRemove);

        System.out.println("List After Removing index "+numToRemove);
        for(Integer i: list) System.out.printf("%d ",i);

        sc.close();
        
    }
}
