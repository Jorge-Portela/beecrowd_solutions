package bee_1007;

/**
 * Read four integer values named A, B, C and D. Calculate and print the difference of product A and B by the
 * product of C and D (A * B - C * D).
 *
 *   Input
 *   The input file contains 4 integer values.
 * */

import java.util.Locale;
import java.util.Scanner;

public class Difference {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner reader = new Scanner(System.in);

        int A = reader.nextInt();
        int B = reader.nextInt();
        int C = reader.nextInt();
        int D = reader.nextInt();

        int diference = (A * B) - (C * D);

        System.out.println("DIFERENCA = "+ diference);

        reader.close();


    }
}
