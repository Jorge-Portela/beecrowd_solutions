package bee_1020;

/**
 * Read an integer value corresponding to a person's age (in days) and print it in years, months and days, followed
 * by its respective message “ano(s)”, “mes(es)”, “dia(s)”.
 *
 * Note: only to facilitate the calculation, consider the whole year with 365 days and 30 days every month. In the
 * cases of test there will never be a situation that allows 12 months and some days, like 360, 363 or 364. This is
 * just an exercise for the purpose of testing simple mathematical reasoning.
 *
 *  //Input
 * The input file contains 1 integer value.
 *
 *  //Output
 * Print the output, like the following example.
 * */

import java.util.Scanner;
import java.util.Locale;

public class AgeInDays {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner reader = new Scanner(System.in);

        int age = reader.nextInt();



        reader.close();
    }
}
