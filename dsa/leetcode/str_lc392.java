import java.util.ArrayList;
import java.util.Collections;

class Main {

    public static boolean isSubsequence(String t, String s) {
        if (t.length() == 0) return true;
        if (s.length() == 0 && t.length() != 0) return false;
        // int[] arr = new int[26];

        // for (int i = 0; i < s.length(); i++) arr[s.charAt(i) - 'a'] = i;

        // for (int i = 1; i < t.length(); i++) {
        //     if (arr[t.charAt(i) - 'a'] == 0) return false;
        //     if (
        //         arr[t.charAt(i) - 'a'] < arr[t.charAt(i - 1) - 'a']
        //     ) return false;
        // }
        // return true;
        ArrayList<Integer>[] arr;
        try {
            arr = new ArrayList[26];
        } catch (Exception e) {
            return false;
        }
        for (int i = 0; i < 26; i++) arr[i] = new ArrayList<Integer>();

        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a'].add(i);
        }

        for (int i = 1; i < t.length(); i++) {
            if (arr[t.charAt(i) - 'a'].isEmpty()) return false;
            if (
                Collections.min(arr[t.charAt(i) - 'a']) <
                Collections.min(arr[t.charAt(i - 1) - 'a'])
            ) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String t = "ahbgdc", s = "abc";

        isSubsequence(t, s);
    }
}
