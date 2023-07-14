class Main {

    static String decToBinary(int dec){
        if(dec == 0) return "";

        return decToBinary(dec / 2) + (dec % 2) ;
        
    }

    public static void main(String[] args) {
        // int dec = 1024;
        // StringBuilder sb = new StringBuilder();

        // while (dec > 0){
        //     sb.append(String.valueOf(dec % 2));
        //     dec /= 2;
        // }

        // System.out.println(sb.reverse().toString());
     
        System.out.println(decToBinary(1024));
    }
    
}

//while num > 0
// get remainder 
// add remainder to ans
// divide number by 2