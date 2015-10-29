/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ferris_david_ccc_s2014_2;

import java.util.Scanner;

/**
 *
 * @author davidferris
 */
public class Ferris_David_CCC_S2014_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        String num = myScanner.nextLine();
        int students = Integer.parseInt(num);
        
        //GETTING NAMES
        String names[] = new String[students];
        for (int x = 0; x < students; x++) {
            names[x] = myScanner.next();
        }
        for (int x = 0; x < students; x++) {
            System.out.println(x + ": " + names[x]);
        }
        //GETTING PARTNERS
        String partners[] = new String[students];
        for (int x = 0; x < students; x++) {
            partners[x] = myScanner.next();
        }
        for (int x = 0; x < students; x++) {
            System.out.println(x + ": " + partners[x]);
        }
        
        //ACTUAL MATH
        boolean error = false;
        boolean partnerFound = false;
        for (int g = 0; g < students; g++) {
            if (names[g].equals(partners[g])) {
                error = true;
        }
            String MAIN = names[g];
            String PART = partners[g];
            
            for (int x = 0; x < students; x++) {
                //System.out.println("x" + x + " g" + g);
                
                if (MAIN.equals(partners[x]) && g!=x) {
                    partnerFound = true;
                    if (!names[x].equals(PART)) {
                        error = true;
                    }
                }
                
            }
            if (!partnerFound) {
                    //System.out.println("error");
                    error = true;
                }
    }
        if (error) {
            System.out.println("bad");
        }
        else {
            System.out.println("good");
        }
}
}