package bee_1022;
/**
 * Read 4 integer values A, B, C and D. Then if B is greater than C and D is greater than A
 * and if the sum of C and D is greater than the sum of A and B and if C and D were
 * positives values and if A is even, write the message “Valores aceitos” (Accepted values).
 * Otherwise, write the message “Valores nao aceitos” (Values not accepted).
 * <p>
 * //Input
 * Four integer numbers A, B, C and D.
 * <p>
 * //Output
 * Show the corresponding message after the validation of the values.
 */

import java.util.Scanner;
import java.util.Locale;

public class SelectionTest1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner reader = new Scanner(System.in);

        int A = reader.nextInt();
        int B = reader.nextInt();
        int C = reader.nextInt();
        int D = reader.nextInt();
        reader.close();
    }
}
