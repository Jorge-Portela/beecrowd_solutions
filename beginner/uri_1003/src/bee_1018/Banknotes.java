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

        while (banknoteEntered < 0 || banknoteEntered >=  1000000) {
            banknoteEntered = reader.nextInt();
        }

        System.out.println(banknoteEntered);
        double oneHundredBanknotes = banknoteEntered / 100;
        if(oneHundredBanknotes <= 0){
          System.out.println("0 nota(s) de R$ 100,00");
        } else {
          System.out.printf("%.0f nota(s) de R$ 100,00\n", oneHundredBanknotes );
        }

        int restOfDivision = banknoteEntered % 100;

        double fiftyBanknotes = restOfDivision / 50 ;
        if(fiftyBanknotes <= 0){
            System.out.println( "0 nota(s) de R$ 50,00");
        } else {
            System.out.printf( "%.0f nota(s) de R$ 50,00\n", fiftyBanknotes);
        }

        restOfDivision = restOfDivision % 50;

        double twentyBanknotes = restOfDivision  / 20;
        if(twentyBanknotes <= 0){
            System.out.println("0 nota(s) de R$ 20,00");
        } else {
            System.out.printf("%.0f nota(s) de R$ 20,00\n",twentyBanknotes);
        }

        restOfDivision = restOfDivision % 20;

        double tenBanknotes = restOfDivision  / 10;
        if(tenBanknotes <= 0){
            System.out.println("0 nota(s) de R$ 10,00");
        } else {
            System.out.printf("%.0f nota(s) de R$ 10,00",tenBanknotes);
        }

        restOfDivision = restOfDivision % 10;

        double fiveBanknotes = restOfDivision / 5;
        if (fiveBanknotes <= 0){
            System.out.println("0 nota(s) de R$ 5,00");
        }else{
            System.out.printf("%.0f nota(s) de R$ 5,00\n",fiveBanknotes);
        }

        restOfDivision = restOfDivision % 5;

        double twoBanknotes = restOfDivision  / 2;
        if (twoBanknotes <= 0){
            System.out.println("0 nota(s) de R$ 2,00");
        }else{
            System.out.printf("%.0f nota(s) de R$ 2,00\n",twoBanknotes);
        }

        restOfDivision = restOfDivision % 2;

        int oneBanknotes = restOfDivision;
        if (oneBanknotes <= 0){
            System.out.println("0 nota(s) de R$ 1,00");
        }else{
            System.out.printf("%.0f nota(s) de R$ 1,00\n",oneBanknotes);
        }

        reader.close();

    }
}
