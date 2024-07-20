package bee_1013;

/**
 * Make a program that reads 3 integer values and present the greatest one followed by the message "eh o maior".
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

       if(A < B && B > C){
           System.out.println(B + " eh o maior");
       } else if(C > A && C > B){
           System.out.println(C + " eh o maior");
       } else {
           System.out.println(A + " eh o maior");
       }
        reader.close();
    }
}
