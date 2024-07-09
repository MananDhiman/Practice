import java.util.Arrays;

public class l1859 {
    public static String sortSentence(String s) {
        String[] sArray = new String[10];
        int startIndex = 0;
        char[] charArray = s.toCharArray();

        for(int i=0; i<charArray.length;i++){
            if(charArray[i] == ' '){
                String str = s.substring(startIndex,i-1);
                sArray[charArray[i-1] - 48] = str;
                startIndex = i+1;
            }
        }

         sArray[charArray[charArray.length - 1] - 48] = s.substring(startIndex,charArray.length - 1);

        System.out.println(Arrays.toString(sArray));
        StringBuilder sb = new StringBuilder();

        for(int i=1;i<sArray.length;i++){
            if(sArray[i] == null) break;
            sb.append(sArray[i]);
            sb.append(" ");
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }
    public static void main(String[] args) {
        sortSentence("Myself2 Me1 I4 and3");
    }
}
