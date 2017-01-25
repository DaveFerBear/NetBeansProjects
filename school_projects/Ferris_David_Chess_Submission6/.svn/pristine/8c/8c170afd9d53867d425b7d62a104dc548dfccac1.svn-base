/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ferris_david_chess_submission6;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

/**
 *
 * @author davidferris
 */
public class King extends Piece {

    int x, y;
    boolean isWhite;
    private BufferedImage pieceImage;
    Chessboard myChessboard;

    King(int newX, int newY, boolean color) throws IOException {
        //varibale which define the object
        URL imageURL;
        x = newX;
        y = newY;
        isWhite = color;

        //image reading
        if (isWhite) {
            imageURL = getClass().getResource("Chess_Icons/White_King.PNG");
        } else {
            imageURL = getClass().getResource("Chess_Icons/Black_King.PNG");
        }
        pieceImage = ImageIO.read(imageURL);

    }

    public int getX() { //returns X
        return x;
    }

    public int getY() { //returns Y
        return y;
    }

    void setLocation(int newX, int newY) { //sets the piece cell
        x = newX;
        y = newY;
    }

    BufferedImage getImage() { //returns the piece image
        return pieceImage;
    }

    public boolean isLegalMove(Piece piece, int newX, int newY) { //check if the specified move is legal
        try {
            myChessboard = Chessboard.getInstance(); //gets the current chessboard
        } catch (IOException ex) {
            Logger.getLogger(Pawn.class.getName()).log(Level.SEVERE, null, ex);
        }

        boolean isLegal = false;
        int curX = piece.getX();
        int curY = piece.getY();

        if ((Math.abs(newX - curX) <= 1) && (Math.abs(newY - curY) <= 1)) { //only maximum 1 cell away
            isLegal = true;
        }
        //Check that a similiarly colored piece is not there
        if (myChessboard.getPiece(newX, newY) != null) {
            if (myChessboard.getPiece(newX, newY).getColor() == isWhite) {
                isLegal = false;
            }
        }
        return isLegal;
    }

    boolean getColor() { //returns the color (black/white)
        return isWhite;
    }

    public String getKind() { //returns the kind of piece
        return "King";
    }

}
