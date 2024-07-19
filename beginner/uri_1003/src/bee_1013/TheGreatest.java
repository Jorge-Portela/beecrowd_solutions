package bee_1013;

/**
 * Make a program that reads 3 integer values and present the greatest one followed by the message "eh o maior".
 * Use the following formula:
 *
 *
 * Input
 * The input file contains 3 integer values.
 *
 * Output
 * Print the greatest of these three values followed by a space and the message “eh o maior”.
 *
 * */

import java.util.Locale;
import java.util.Scanner;

public class TheGreatest {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner reader = new Scanner(System.in);

        int A = reader.nextInt();
        int B = reader.nextInt();
        int C = reader.nextInt();

        System.out.println(higherNUmber + " eh o maior");
        reader.close();
    }
}
