package bee_1010;

/**
 * In this problem, the task is to read a code of a product 1, the number of units of product 1, the price for one
 * unit of product 1, the code of a product 2, the number of units of product 2 and the price for one unit of
 * product 2. After this, calculate and show the amount to be paid.
 *
 *  //Input
 * The input file contains two lines of data. In each line there will be 3 values: two integers and a floating value
 * with 2 digits after the decimal point.
 *
 *  //Output
 * The output file must be a message like the following example where "Valor a pagar" means Value to Pay. Remember
 * the space after ":" and after "R$" symbol. The value must be presented with 2 digits after the point.
 *
 * */

import java.util.Locale;
import java.util.Scanner;

public class SimpleCalculate {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner reader = new Scanner(System.in);

        int productCode1 = reader.nextInt();
        int productUnit1 = reader.nextInt();
        double productPrice1 = reader.nextDouble();

        int productCode2 = reader.nextInt();
        int productUnit2 = reader.nextInt();

        System.out.println(productCode1 + " " + productUnit1);
        reader.close();

    }
}
