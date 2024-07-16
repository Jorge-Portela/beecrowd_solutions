package bee_1009;

/**
 * Make a program that reads a seller's name, the fixed salary and the sale's total made  in the month (in money).
 * Considering that this seller receives 15% over all products sold, write the final salary
 * (total) of this seller at the end of the month , with two decimal places.
 *
 * The input file contains a text (employee's first name), and two double precision values, that are the seller's
 * salary and the total value sold by him/her.
 * */

import java.util.Locale;
import java.util.Scanner;

public class SalaryWithBonus {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner reader = new Scanner(System.in);

        String sellerName = reader.nextLine();
        
        double fixedSalary = reader.nextDouble();
        double totalSales = reader.nextDouble();

        double finalSalary = (fixedSalary + (totalSales * 0.15));


        reader.close();
    }
}
