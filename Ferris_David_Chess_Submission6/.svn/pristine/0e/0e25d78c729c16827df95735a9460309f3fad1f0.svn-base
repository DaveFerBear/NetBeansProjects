/*
 * David Ferris
 * Chess
 * ICS3U1-1
 * 23 May 2014
 */
package ferris_david_chess_submission6;

import java.io.IOException;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 *
 * @author davidferris
 */
public class Ferris_David_Chess_Submission6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Chessboard chessPanel = Chessboard.getInstance(); //new Chessboard
        JFrame chessFrame = new JFrame(); //new JFrame   
        chessFrame.setContentPane(chessPanel); //sets the Chessboard within the JFrame

        //Aesthetics
        chessFrame.setUndecorated(true);
        chessFrame.setVisible(true);
        chessFrame.setSize(chessPanel.TILE_SIZE * 8, chessPanel.TILE_SIZE * 8);
        chessFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);

        while (true) { //runs until game is exited
            chessPanel.repaint(); //paints the board
            chessPanel.updateBoard(); //"refreshes" the board
        }
    }

}
