/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package main;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author davidferris
 */
public class Main {

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
        for (int x = 0; x < cars; x++) {
            if (Math.random() < 0.5) {
            System.out.println("Y");
            }
            else {
                System.out.println("N");
            }
        }


    
}
}
