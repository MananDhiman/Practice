import java.util.ArrayList;
import java.util.List;

class dp_lc1641 {
    static List<String> al = new ArrayList<>();
//    public static void subs(int idx, StringBuilder curr, String s, ArrayList<String> res) {
//        if(idx == s.length()) {
//            res.add(curr.toString());
//            return;
//        }
//
//        subs(idx+1, curr.append(s.charAt(idx)), s, res);
//        subs(idx+1, curr, s, res);
//    }
//    public static int countVowelStrings(int n) {
//        String vowels = "aeiou";
//        ArrayList<String> ls = new ArrayList<>();
//        subs(0, new StringBuilder(""), vowels, ls);
//        int count = 0;
//        for(String s: ls) {
//            if(s.length() == n)
//                count++;
//        }
//        return count;
//    }

    public static void main(String[] args) {
        String vowels = "aeiou";
        findsubsequences(vowels, "");
        for (int i = 1; i <= 33; i++) {
            System.out.println();
        }
    }

    private static void findsubsequences(String vowels, String s) {
        return false;
    }
}
