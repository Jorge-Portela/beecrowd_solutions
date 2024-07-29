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

        int timeSecondsEntered = reader.nextInt();

        int timeMinuteTransformation = timeSecondsEntered / 60;

        int timeHourTransformation = timeSecondsEntered / 3600 ;

        reader.close();
    }
}
