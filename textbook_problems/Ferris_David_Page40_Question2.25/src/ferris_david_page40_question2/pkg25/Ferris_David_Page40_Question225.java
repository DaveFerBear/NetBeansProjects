/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ferris_david_page40_question2.pkg25;

import javax.swing.JOptionPane;
/**
 *
 * @author davidferris
 */
public class Ferris_David_Page40_Question225 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String str_input;
        String firstName;
        String lastName;
        str_input = JOptionPane.showInputDialog("Enter First Name");
        firstName = ( str_input );
        
        str_input = JOptionPane.showInputDialog("Enter Last Name");
        lastName = ( str_input );
        
        JOptionPane.showMessageDialog(null, "Your name is: " + firstName + " " + lastName);
       
        
    }
}
