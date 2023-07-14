import java.util.*;

class l451 {
    public static String frequencySort(String s) {
        char[] cA = s.toCharArray();

        HashMap<Character, Integer> map = new HashMap<>();

        for(char c: cA){
            if(map.containsKey(c)){
                int val = map.get(c);
                map.put(c,val+1);
            }else{
                map.put(c,1);
            }
        }

        String str = "";


        while(!map.isEmpty()){
            char maxChar = 'a';
            int maxFreq=0, freq=0;

            for(Map.Entry<Character, Integer> entry: map.entrySet()){
                freq = entry.getValue();
                if(freq > maxFreq){
                    maxFreq = freq;
                    maxChar = entry.getKey();

                }
            }

            for(int i=0;i<maxFreq;i++){
                str += maxChar;
            }

            map.remove(maxChar);

        }

        return str;
    }

    public static void main(String[] args) {
        System.out.println(frequencySort("raaeaedere"));
        
    }
    
}
