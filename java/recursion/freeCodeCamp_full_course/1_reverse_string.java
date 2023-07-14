class Main{
    static String reverseString(String s, int i){
        if(i == 0) return String.valueOf(s.charAt(0));

        return s.charAt(i) + reverseString(s, i-1);

    }

    public static void main(String[] args){
        String s = "The simple engineer";
        System.out.println(reverseString(s,s.length()-1));
    }

}
