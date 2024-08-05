package bee_1021;

import java.math.BigDecimal;
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

        DecimalFormat df = new DecimalFormat("0");
        df.setRoundingMode(RoundingMode.FLOOR);
        double banknoteEntered = reader.nextDouble();

        double oneHundredBanknote = banknoteEntered / 100;

        double restOfBanknote = banknoteEntered % 100;

        double fiftyBanknote = restOfBanknote / 50;

        restOfBanknote = restOfBanknote % 50;

        double twentyBanknote = restOfBanknote / 20;

        restOfBanknote = restOfBanknote % 20;


        double tenBanknote = restOfBanknote / 10;

        restOfBanknote = restOfBanknote % 10;

        double fiveBanknote = restOfBanknote / 5;

        restOfBanknote = restOfBanknote % 5;

        double twoBanknote = restOfBanknote / 2;

        restOfBanknote = restOfBanknote % 2;

        double oneBanknote = restOfBanknote ;

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
        System.out.println(df.format(oneHundredBanknote)+" nota(s) de R$ 100.00" );
        System.out.println(df.format(fiftyBanknote) + " nota(s) de R$ 50.00");
        System.out.println(df.format(twentyBanknote)+" nota(s) de R$ 20.00");
        System.out.println(df.format(tenBanknote)+" nota(s) de R$ 10.00");
        System.out.println(df.format(fiveBanknote)+" nota(s) de R$ 5.00");
        System.out.println(df.format(twoBanknote)+" nota(s) de R$ 2.00");
        System.out.println("MOEDAS:");
        System.out.println(df.format(oneBanknote)+" moeda(s) de R$ 1.00");
        System.out.println(df.format(fiftyCent)+" moeda(s) de R$ 0.50");
        System.out.println(df.format(twentyFiveCent)+" moeda(s) de R$ 0.25");
        System.out.println(df.format(tenCent)+" moeda(s) de R$ 0.10");
        System.out.println(df.format(fiveCent) +" moeda(s) de R$ 0.05");
        System.out.println(df.format(oneCent)+" moeda(s) de R$ 0.01");
        reader.close();
    }
}
