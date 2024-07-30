package bee_1019;

/**
 * Read an integer value, which is the duration in seconds of a certain event in a factory, and inform it expressed
 * in hours:minutes:seconds.
 *
 *  //Input
 * The input file contains an integer N.
 *
 *  //Output
 * Print the read time in the input file (seconds) converted in hours:minutes:seconds like the following example.
 * */

import java.util.Scanner;
import java.util.Locale;

public class TimeConversion {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner reader = new Scanner(System.in);

        int N = reader.nextInt();

        int timeHourTransformation = N / 3600 ;

        int restOfTime = N  % 3600;

        int timeMinuteTransformation =  restOfTime / 60  ;

        restOfTime = restOfTime % 60;

        int timeSecondTransformation = restOfTime;
        
        System.out.println(timeHourTransformation+":"+timeMinuteTransformation+":"+timeSecondTransformation);

        reader.close();
    }
}
