/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ferris_david_page.pkg55_question5;

/**
 *
 * @author davidferris
 */
public class Ferris_David_Page55_Question5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int year = 2012;
        int month = 10;
        int day = 28;
        
        switch(month)
        {    
            case 1:
                System.out.print("January,");
                break;
            case 2:
                System.out.print("February");
                break;
            case 3:
                System.out.print("March");
                break;
            case 4:
                System.out.print("April");
                break;
            case 5:
                System.out.print("May");
                break;
            case 6:
                System.out.print("June");
                break;
            case 7:
                System.out.print("July");
                break;
            case 8:
                System.out.print("August");
                break;
            case 9:
                System.out.print("September");
                break;
            case 10:
                System.out.print("October");
                break;
            case 11:
                System.out.print("March");
                break;
            case 12:
                System.out.print("April");
                break;
            default:
                System.out.print("Invalid Month");
        }       
        
        System.out.print(" ");
        System.out.print(day);
        System.out.print(", ");
        System.out.println(year);
    }
}
