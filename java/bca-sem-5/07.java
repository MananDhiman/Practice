import java.util.Date;
import java.util.TimeZone;

class Main {
    public static void main(String[] args){

        TimeZone.setDefault( TimeZone.getTimeZone("GMT"));
        Date time = new Date();

        System.out.println("Current time as per GMT is: "+time);
        
    }
}
// Write a Java program that prints current time in GMT.