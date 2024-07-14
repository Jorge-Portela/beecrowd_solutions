package bee_1008;

/**
 * Write a program that reads an employee's number, his/her worked hours number in a month and the amount he received
 * per hour. Print the employee's number and salary that he/she will receive at end of the month, with two decimal
 * places.
 *
 * // Input
 * The input file contains 2 integer numbers and 1 value of floating point, representing the number, worked hours
 * amount and the amount the employee receives per worked hour.
 *
 * // Output
 * Print the number and the employee's salary, according to the given example, with a blank space before and after the
 * equal signal.
 * */

import java.util.Locale;
import java.util.Scanner;

public class Employeer1 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter employer number: ");
        int number = reader.nextInt();
        System.out.println("Enter employer month's worked hours: ");
        int workHours = reader.nextInt();

        


        reader.close();


    }
}
