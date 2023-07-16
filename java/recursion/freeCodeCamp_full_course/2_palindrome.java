class Main {
    static boolean isPalindrome(String s, int l, int r){
        if(l >= r) return true;

        boolean isSameChar;
        if(s.charAt(l) == s.charAt(r)) isSameChar = true;
        else isSameChar = false;

        l++; r--;
        if(isSameChar && isPalindrome(s, l, r)) return true;
        return false;
    }
    public static void main(String[] args) {
        String s = "nabm";
        int l = 0, r = s.length() - 1;
        System.out.println(isPalindrome(s,l,r));
        
    }
    
}
