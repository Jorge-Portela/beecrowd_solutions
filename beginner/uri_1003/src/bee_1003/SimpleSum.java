package bee_1003;
/*
* Read two integer values, in this case, the variables A and B. After this, calculate the sum between them
*  and assign it to the variable SOMA. Write the value of this variable.
*Input
*The input file contains 2 integer numbers.
*
*Output
*Print the message "SOMA" with all the capital letters, with a blank space before and after the equal signal
* followed by the corresponding value to the sum of A and B. Like all the problems, don't forget to print
*  the end of line, otherwise you will receive "Presentation Error"
* */

import java.util.Locale;
import java.util.Scanner;

public class SimpleSum {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner reader = new Scanner(System.in);

        int A = reader.nextInt();
        int B = reader.nextInt();

        int SOMA = A + B;

        System.out.println( "SOMA = "+SOMA);


        reader.close();

    }
}
