package bee_1018;

/**
 * In this problem you have to read an integer value and calculate the smallest possible number of banknotes in which
 * the value may be decomposed. The possible banknotes are 100, 50, 20, 10, 5, 2 and 1. Print the read value and the
 * list of banknotes.
 *
 *  //Input
 * The input file contains an integer value N (0 < N < 1000000).
 *
 *  //Output
 * Print the read number and the minimum quantity of each necessary banknotes in Portuguese language, as the given
 * example. Do not forget to print the end of line after each line, otherwise you will receive “Presentation Error”.
 *
 * */

import java.util.Locale;
import java.util.Scanner;

public class Banknotes {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner reader = new Scanner(System.in);

        int banknoteEntered = reader.nextInt();

        int oneHundredBanknotes = banknoteEntered / 100;
        int restOfOneHundredBanknotes = banknoteEntered % 100;

        int fiftyBanknotes = restOfOneHundredBanknotes / 50 ;
        

        int twentyBanknotes = (banknoteEntered % (fiftyBanknotes * 50))  / 20;

        int tenBanknotes = ( banknoteEntered % ( twentyBanknotes  * 20 )) / 10;

        int fiveBanknotes = (banknoteEntered - (( oneHundredBanknotes * 100)  + 80 )) / 5;

        int twoBanknotes = (banknoteEntered - (( oneHundredBanknotes * 100)  + 95 )) / 2;

        int oneBanknotes = (banknoteEntered - (( oneHundredBanknotes * 100)  + 97 )) / 1;

        System.out.println( Math.abs(oneHundredBanknotes)+ " nota (s) de R$ 100,00");
        System.out.println( Math.abs(fiftyBanknotes)  + " nota (s) de R$ 50,00");
        System.out.println(Math.abs(twentyBanknotes)  + " nota (s) de R$ 20,00");
        System.out.println(tenBanknotes  + " nota (s) de R$ 10,00");
        System.out.println(fiveBanknotes  + " nota (s) de R$ 5,00");
        System.out.println(twoBanknotes  + " nota (s) de R$ 2,00");
        System.out.println(oneBanknotes  + " nota (s) de R$ 1,00");

        reader.close();

    }
}
