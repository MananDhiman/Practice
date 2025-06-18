import java.util.HashMap;

class map_lc290 {
    public static boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> map = new HashMap<>();
        String[] arr = s.split(" ");
        for(int i=0; i< arr.length; i++) {
            char sc = pattern.charAt(i);
            if(map.containsKey(sc)) {
                if(!arr[i].equals(map.get(sc)))
                    return false;
            }
            else {
                map.put(sc, arr[i]);
            }
        }
        return true;
    }
    public static void main(String[] args) {
        wordPattern("abba", "dog cat cat dog");
    }
}
