package bee_1004;

/**
 *Read two integer values. After this, calculate the product between them and store the result in a variable named
 * PROD. Print the result like the example below. Do not forget to print the end of line after the result, otherwise
 * you will receive “Presentation Error”.
 *
 * Input
 * The input file contains 2 integer numbers.
 *
 * Output
 * Print the message "PROD" and PROD according to the following example, with a blank space before and after the equal
 * signal.
 *
 * Input Samples   Output Samples
 *    3                 PROD = 27
 *    9
 * */

import java.util.Locale;
import java.util.Scanner;

public class SimpleProduct {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner reader = new Scanner(System.in);

        int numberA = reader.nextInt();
        int numberB = reader.nextInt();

        int PROD = numberA * numberB;

        System.out.println("PROD = " + PROD);

        reader.close();
    }
}
