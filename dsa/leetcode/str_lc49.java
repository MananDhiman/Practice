import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class str_lc49 {
    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ls = new ArrayList<>();
        HashMap<String, ArrayList<String>> map = new HashMap<>();

        for(String x: strs) {
            var s = x.toCharArray();
            Arrays.sort(s);
            var k = String.valueOf(s);
            if (map.containsKey(k))
                map.get(k).add(x);
            else
                map.put(k, new ArrayList<>(List.of(x)));

        }
        map.forEach((_, v) -> ls.add(v));
        return ls;
    }

    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(strs));
    }
}
