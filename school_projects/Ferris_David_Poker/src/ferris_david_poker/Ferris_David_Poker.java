/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ferris_david_poker;

import javax.swing.JOptionPane;

/**
 *
 * @author davidferris
 */
public class Ferris_David_Poker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String Value1;
        String Suit1;
        String Value2;
        String Suit2;

        boolean boo1 = false;

        while (boo1 = false)
        {
            Value1 = JOptionPane.showInputDialog("Enter Card Value:");
            
            if (Value1.equalsIgnoreCase("ace")) {
                boolean Ace1 = true;
                boo1 = true;
            } else if (Value1.equalsIgnoreCase("two") || Value1.equalsIgnoreCase("2")) {
                boolean Two1 = true;
                boo1 = true;
            } else if (Value1.equalsIgnoreCase("three") || Value1.equalsIgnoreCase("3")) {
                boolean Three1 = true;
                boo1 = true;
            } else if (Value1.equalsIgnoreCase("four") || Value1.equalsIgnoreCase("4")) {
                boolean Four1 = true;
                boo1 = true;
            } else if (Value1.equalsIgnoreCase("five") || Value1.equalsIgnoreCase("5")) {
                boolean Five1 = true;
                boo1 = true;
            } else if (Value1.equalsIgnoreCase("six") || Value1.equalsIgnoreCase("6")) {
                boolean Six1 = true;
                boo1 = true;
            } else if (Value1.equalsIgnoreCase("seven") || Value1.equalsIgnoreCase("7")) {
                boolean Seven1 = true;
                boo1 = true;
            } else if (Value1.equalsIgnoreCase("eight") || Value1.equalsIgnoreCase("8")) {
                boolean Eight1 = true;
                boo1 = true;
            } else if (Value1.equalsIgnoreCase("nine") || Value1.equalsIgnoreCase("9")) {
                boolean Nine1 = true;
                boo1 = true;
            } else if (Value1.equalsIgnoreCase("ten") || Value1.equalsIgnoreCase("10")) {
                boolean Ten1 = true;
                boo1 = true;
            } else if (Value1.equalsIgnoreCase("jack")) {
                boolean Jack1 = true;
                boo1 = true;
            } else if (Value1.equalsIgnoreCase("queen")) {
                boolean Queen1 = true;
                boo1 = true;
            } else if (Value1.equalsIgnoreCase("king")) {
                boolean King1 = true;
                boo1 = true;
            } else {
                boo1 = false;
            }
        }

        Suit1 = JOptionPane.showInputDialog("Enter Card Suit:");

        if (Suit1.equalsIgnoreCase("spade") || Suit1.equalsIgnoreCase("spades")) {
            boolean Spade1 = true;
        } else if (Suit1.equalsIgnoreCase("heart") || Suit1.equalsIgnoreCase("hearts")) {
            boolean Heart1 = true;
        } else if (Suit1.equalsIgnoreCase("club") || Suit1.equalsIgnoreCase("clubs")) {
            boolean Club1 = true;
        } else if (Suit1.equalsIgnoreCase("diamond") || Suit1.equalsIgnoreCase("diamonds")) {
            boolean Diamond1 = true;
        }

        Value2 = JOptionPane.showInputDialog("Enter Card Value:");

        if (Value2.equalsIgnoreCase("ace")) {
            boolean Ace2 = true;
        } else if (Value2.equalsIgnoreCase("two") || Value2.equalsIgnoreCase("2")) {
            boolean Two2 = true;
        } else if (Value2.equalsIgnoreCase("three") || Value2.equalsIgnoreCase("3")) {
            boolean Three2 = true;
        } else if (Value2.equalsIgnoreCase("four") || Value2.equalsIgnoreCase("4")) {
            boolean Four2 = true;
        } else if (Value2.equalsIgnoreCase("five") || Value2.equalsIgnoreCase("5")) {
            boolean Five2 = true;
        } else if (Value2.equalsIgnoreCase("six") || Value2.equalsIgnoreCase("6")) {
            boolean Six2 = true;
        } else if (Value2.equalsIgnoreCase("seven") || Value2.equalsIgnoreCase("7")) {
            boolean Seven2 = true;
        } else if (Value2.equalsIgnoreCase("eight") || Value2.equalsIgnoreCase("8")) {
            boolean Eight2 = true;
        } else if (Value2.equalsIgnoreCase("nine") || Value2.equalsIgnoreCase("9")) {
            boolean Nine2 = true;
        } else if (Value2.equalsIgnoreCase("ten") || Value2.equalsIgnoreCase("20")) {
            boolean Ten2 = true;
        } else if (Value2.equalsIgnoreCase("jack")) {
            boolean Jack2 = true;
        } else if (Value2.equalsIgnoreCase("queen")) {
            boolean Queen2 = true;
        } else if (Value2.equalsIgnoreCase("king")) {
            boolean King2 = true;
        }

        Suit2 = JOptionPane.showInputDialog("Enter Card Suit:");

        if (Suit2.equalsIgnoreCase("spade") || Suit2.equalsIgnoreCase("spades")) {
            boolean Spade2 = true;
        } else if (Suit2.equalsIgnoreCase("heart") || Suit2.equalsIgnoreCase("hearts")) {
            boolean Heart2 = true;
        } else if (Suit2.equalsIgnoreCase("club") || Suit2.equalsIgnoreCase("clubs")) {
            boolean Club2 = true;
        } else if (Suit2.equalsIgnoreCase("diamond") || Suit2.equalsIgnoreCase("diamonds")) {
            boolean Diamond2 = true;
        }


        System.out.println(boo1);
        System.out.println();
    }
}