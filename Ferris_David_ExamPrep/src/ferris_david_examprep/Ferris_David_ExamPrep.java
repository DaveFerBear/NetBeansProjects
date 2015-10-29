/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ferris_david_examprep;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author davidferris
 */
public class Ferris_David_ExamPrep {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        ArrayList<Character> list = new ArrayList<Character>();
        for(int i = 0; i<input.length();i++){
            list.add(input.charAt(i));
        }
        Collections.sort(list);
        find(list,"");
        
        int myarray[] = new int[6];
        int e = myarray.length;
    }
    public static void find(ArrayList<Character> list, String prev){
        if(list.size()==1){
            System.out.println(prev+list.get(0));
        }
        else {
            for(int i = 0; i<list.size();i++){
                ArrayList<Character> newList = (ArrayList<Character>)list.clone();
                String newString = prev + newList.remove(i);
                find(newList,newString);
            }
        }
    }
   
}

