class cont_lc100660 {
    public static String resultingString(String s) {
        StringBuilder sb = new StringBuilder(s);
        int i = 1;
        while (i<sb.length()) {
            char c = sb.charAt(i);
            if (sb.length() <= 1) break;
            if (i == 0) i++;
            if (Math.abs(sb.charAt(i) - sb.charAt(i-1)) == 1) {
                sb.delete(i-1, i+1);
                i-=2;
            }
            else if ((sb.charAt(i) == 'a' && sb.charAt(i-1) == 'z') || (sb.charAt(i) == 'z' && sb.charAt(i-1) == 'a')) {
                sb.delete(i-1, i+1);
                i-=2;
            }
            i++;
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String z = "zadb";
        System.out.println(resultingString(z));
    }
}
