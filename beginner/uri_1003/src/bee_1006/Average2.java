package bee_1006;

/**
 * Read three values (variables A, B and C), which are the three student's grades. Then, calculate the average,
 * considering that grade A has weight 2, grade B has weight 3 and the grade C has weight 5. Consider that each
 * grade can go from 0 to 10.0, always with one decimal place.
 *
 * Input
 * The input file contains 3 values of floating points (double) with one digit after the decimal point.
 *
 * Output
 * Print the message "MEDIA"(average in Portuguese) and the student's average according to the following example,
 * with a blank space before and after the equal signal.
 *
 *   Input Samples                   Output Samples
 *     5.0                              MEDIA = 6.3
 *     6.0
 *     7.0
 * */


import java.util.Locale;
import java.util.Scanner;
public class Average2 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner reader = new Scanner(System.in);

        double A = reader.nextDouble();
        double B = reader.nextDouble();
        double C = reader.nextDouble();

        double average = ((A * 2) + (B * 3) + (C + 5)) /  (2+3+5);


        System.out.printf("MEDIA = %.1F\n");
        
         reader.close();
    }
}
