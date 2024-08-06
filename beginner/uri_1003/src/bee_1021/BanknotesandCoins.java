package bee_1021;


import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 * Read a value of floating point with two decimal places. This represents a monetary value. After this, calculate
 * the smallest possible number of notes and coins on which the value can be decomposed. The considered notes are
 * of 100, 50, 20, 10, 5, 2. The possible coins are of 1, 0.50, 0.25, 0.10, 0.05 and 0.01. Print the message
 * “NOTAS:” followed by the list of notes and the message “MOEDAS:” followed by the list of coins.
 *
 *  //Input
 * The input file contains a value of floating point N (0 ≤ N ≤ 1000000.00).
 *
 *  //Output
 * Print the minimum quantity of banknotes and coins necessary to change the initial value, as the given example.
 * */


public class BanknotesandCoins {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner reader = new Scanner(System.in);

        double totalValueEntered = reader.nextDouble();

        int banknote = (int)totalValueEntered;
        int bankCents = (int) ((totalValueEntered - banknote) * 100);


        int oneHundredBanknote = banknote / 100;
        banknote -= banknote * 100;

        int fiftyBanknote = banknote / 50;
        banknote -= fiftyBanknote * 50;

        int twentyBanknote = banknote / 20;
        banknote -= banknote * 20;


        int tenBanknote = banknote / 10;
        banknote -= banknote - 10;

        int fiveBanknote = banknote / 5;
        banknote = banknote % 5;

        int twoBanknote = restOfBanknote / 2;
        restOfBanknote = restOfBanknote % 2;

        int oneBanknote = restOfBanknote ;
        restOfBanknote = restOfBanknote % 1;

        double fiftyCent = restOfBanknote / 0.50;
        restOfBanknote = restOfBanknote % 0.5;

        double twentyFiveCent = restOfBanknote / 0.25;
        restOfBanknote = restOfBanknote % 0.25;

       double tenCent = restOfBanknote / 0.10;
       restOfBanknote = restOfBanknote % 0.10;

       double fiveCent = restOfBanknote / 0.05;
       restOfBanknote = restOfBanknote % 0.05;

       double oneCent = restOfBanknote / 0.01;

        System.out.println("NOTAS:");
        System.out.println(oneHundredBanknote+" nota(s) de R$ 100.00" );
        System.out.println(fiftyBanknote+" nota(s) de R$ 50.00");
        System.out.println(twentyBanknote+" nota(s) de R$ 20.00");
        System.out.println(tenBanknote+" nota(s) de R$ 10.00");
        System.out.println(fiveBanknote+" nota(s) de R$ 5.00");
        System.out.println(twoBanknote+" nota(s) de R$ 2.00");
        System.out.println("MOEDAS:");
        System.out.println(oneBanknote+" moeda(s) de R$ 1.00");
        System.out.println(fiftyCent+" moeda(s) de R$ 0.50");
        System.out.println(twentyFiveCent+" moeda(s) de R$ 0.25");
        System.out.println(tenCent+" moeda(s) de R$ 0.10");
        System.out.println(fiveCent+" moeda(s) de R$ 0.05");
        System.out.println(oneCent+" moeda(s) de R$ 0.01");
        reader.close();
    }
}
