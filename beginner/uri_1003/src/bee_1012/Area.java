package bee_1012;

/**
 *Make a program that reads three floating point values: A, B and C. Then, calculate and show:
 * a) the area of the rectangle triangle that has base A and height C.
 * b) the area of the radius's circle C. (pi = 3.14159)
 * c) the area of the trapezium which has A and B by base, and C by height.
 * d) the area of the square that has side B.
 * e) the area of the rectangle that has sides A and B.
 *
 *  //Input
 * The input file contains three double values with one digit after the decimal point.
 *
 *  //Output
 * The output file must contain 5 lines of data. Each line corresponds to one of the areas described above,
 * always with a corresponding message (in Portuguese) and one space between the two points and the value.
 * The value calculated must be presented with 3 digits after the decimal point.
 *
 * */

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner reader = new Scanner(System.in);

        final double PI = 3.14159;

        double A = reader.nextDouble();
        double B = reader.nextDouble();
        double C = reader.nextDouble();

        double rectangleTriangle = (A * C) / 2;
        double radiusCircle = PI * Math.pow(C,2);
        double trapeziumArea = ((A + B) * C) / 2;
        double squareArea = B * B;
        double rectangleArea = A * B;

        System.out.printf("TRIANGULO: %.3f\n",rectangleTriangle);
        System.out.printf("CIRCULO: %.3f\n",radiusCircle);
        System.out.printf("TRAPEZIO: %.3f\n",trapeziumArea);
        System.out.printf("QUADRADO: %.3f\n",squareArea);
        System.out.printf("RETANGULO: %.3f\n",rectangleArea);



        reader.close();

    }
}
