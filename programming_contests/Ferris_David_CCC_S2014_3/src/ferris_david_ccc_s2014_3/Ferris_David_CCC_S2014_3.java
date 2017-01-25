/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ferris_david_ccc_s2014_3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author davidferris
 */
public class Ferris_David_CCC_S2014_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        String num = myScanner.nextLine();
        int cars = Integer.parseInt(num);

        ArrayList<Integer> mount = new ArrayList<>();
        ArrayList<Integer> branch = new ArrayList<>();
        ArrayList<Integer> lake = new ArrayList<>();

        for (int x = 0; x < cars; x++) {
            mount.add(Integer.parseInt(myScanner.nextLine()));
        }

        boolean solved = false;
        boolean check;
        
         //MOUNT TO BRANCH
        branch.add(mount.get(mount.size() - 1)); //add to the branch
        mount.remove(mount.size() - 1); //remove from the
        
        while (!solved) {

            //PRINT THE STATIONS
            System.out.println("MOUNT: ");
            for (int a = 0; a < mount.size(); a++) {

                System.out.println(mount.get(a));
            }
            System.out.println("BRANCH: ");
            for (int a = 0; a < branch.size(); a++) {

                System.out.println(branch.get(a));
            }
            System.out.println("LAKE: ");
            for (int a = 0; a < lake.size(); a++) {

                System.out.println(lake.get(a));
            }
            
        if (mount.size() == 0 && branch.size() > 0) {
            //BRANCH TO LAKE
        lake.add(branch.get(branch.size()) - 1); //add to the branch
        branch.remove(branch.size() - 1); //remove from the
        }
        
        
        if (mount.size() > 0 && branch.size() > 0) {
            if (mount.get(mount.size() - 1) > branch.get(branch.size() - 1)) {
                //BRANCH TO LAKE
        lake.add(branch.get(branch.size()) - 1); //add to the branch
        branch.remove(branch.size() - 1); //remove from the
            }
            else {
                //MOUNT TO BRANCH
        branch.add(mount.get(mount.size() - 1)); //add to the branch
        mount.remove(mount.size() - 1); //remove from the
            }
        }     
            
            //CHECK IF SOLVED
        if (mount.size() == 0 && branch.size() == 0) {
            check = true;
            for (int x = 0; x < cars; x++) {
                if (lake.size() == cars) {
                    if (lake.get(x) != x + 1) {
                        check = false;
                    }
                }
            }
            
            if (check) {
                solved = true;
            }
            }
            System.out.println("------------------");
        }  
        
        /*
        //BRANCH TO LAKE
        lake.add(branch.get(branch.size()) - 1); //add to the branch
        branch.remove(branch.size() - 1); //remove from the

        //MOUNT TO LAKE
        lake.add(mount.get(mount.size() - 1)); //add to the branch
        mount.remove(mount.size() - 1); //remove from the

        //MOUNT TO BRANCH
        branch.add(mount.get(mount.size() - 1)); //add to the branch
        mount.remove(mount.size() - 1); //remove from the
                */
    }


}
