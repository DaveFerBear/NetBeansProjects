package ferris_david_pwhite_1.pkg1;

import java.util.Scanner;

public class Ferris_David_PWhite_11 {

    public static void main(String[] args) {

        double realTemp = 0;
        Scanner input = new Scanner(System.in);
        double inputInt = input.nextInt();

        if (inputInt <= 100 && inputInt >= -100) {
            realTemp = ((inputInt - 30) / 2) * 9 / 5 + 32;
        }
        if (realTemp % 1 == 0) {
            System.out.println((int) realTemp);
        } else {
            System.out.println(realTemp);
        }
    }
}