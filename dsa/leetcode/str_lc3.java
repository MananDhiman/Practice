import java.util.HashSet;

class str_lc3 {
    public static boolean containsRepeating(String s) {
        HashSet<Character> set = new HashSet<>();
        for(char c: s.toCharArray()) {
            if(set.contains(c)) return true;

            set.add(c);
        }
        return false;
    }
    public static int lengthOfLongestSubstring(String s) {
        int len = s.length();
        if(len <= 1)
            return len;

        String longest = "", curr = "";
        for(int i=0; i<len; i++) {
            for(int j=i; j<=len; j++) {

                curr = s.substring(i,j);

                if(containsRepeating(curr))
                    continue;

                if(curr.length() > longest.length()) {
                    longest = curr;
                }
            }
        }

        return longest.length();
    }
    public static int lengthOfLongestSubstring2(String s) {

        int len = s.length();

        if(len <= 1)
            return len;

        HashSet<Character> set = new HashSet<>();
        int maxSize = 0;
        int r = 0;
        while(r < len) {
            while (r < len && !set.contains(s.charAt(r))) {
                set.add(s.charAt(r));
                r++;
            }
            maxSize = Math.max(set.size(), maxSize);
            set.clear();

        }
        return maxSize;
    }

    public static void main(String[] args) {
        String x = "dvdf";
//        String x = "\"abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\\\"#$%&'()*+,-./:;<=>?@[\\\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\\\"#$%&'()*+,-./:;<=>?@[\\\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\\\"#$%&'()*+,-./:;<=>?@[\\\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\\\"#$%&'()*+,-./:;<=>?@[\\\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\\\"#$%&'()*+,-./:;<=>?@[\\\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\\\"#$%&'()*+,-./:;<=>?@[\\\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\\\"#$%&'()*+,-./:;<=>?@[\\\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\\\"#$%&'()*+,-./:;<=>?@[\\\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\\\"#$%&'()*+,-./:;<=>?@[\\\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\\\"#$%&'()*+,-./:;<=>?@[\\\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFG";
//        lengthOfLongestSubstring(x);
        System.out.println(lengthOfLongestSubstring2(x));
    }
}
