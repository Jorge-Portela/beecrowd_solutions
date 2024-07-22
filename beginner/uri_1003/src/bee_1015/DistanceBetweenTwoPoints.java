package bee_1015;

/**
 *
 * Read the four values corresponding to the x and y axes of two points in the plane, p1 (x1, y1) and p2 (x2, y2) and
 * calculate the distance between them, showing four decimal places, according to the formula:
 *
 *  //Input
 * The input file contains two lines of data. The first one contains two double values: x1 y1 and the second one also
 * contains two double values with one digit after the decimal point: x2 y2.
 *
 *  //Output
 * Calculate and print the distance value using the provided formula, with 4 decimal places.
 *
 * */

import java.util.Locale;
import java.util.Scanner;

public class DistanceBetweenTwoPoints {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner reader = new Scanner(System.in);

        double X1 = reader.nextDouble();
        double Y1 = reader.nextDouble();
        double X2 = reader.nextDouble();
        double Y2 = reader.nextDouble();

        double distance = Math.sqrt(Math.pow((X2 - X1), 2) + Math.pow((Y2 - Y1),2));

        System.out.printf("%.4f\n",distance);


        reader.close();
    }
}
