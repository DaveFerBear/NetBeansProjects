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
public class Knight extends Piece {

    int x, y;
    boolean isWhite;
    BufferedImage pieceImage;
    Chessboard myChessboard;

    Knight(int newX, int newY, boolean color) throws IOException {
        //varibale which define the object
        x = newX;
        y = newY;
        isWhite = color;

        //image reading
        URL imageURL;
        if (isWhite) {
            imageURL = getClass().getResource("Chess_Icons/White_Knight.PNG");
        } else {
            imageURL = getClass().getResource("Chess_Icons/Black_Knight.PNG");
        }
        pieceImage = ImageIO.read(imageURL);
    }

    public int getX() { //returns X
        return x;
    }

    public int getY() { //returns Y
        return y;
    }

    void setLocation(int newX, int newY) { //sets the current cell
        x = newX;
        y = newY;
    }

    @Override
    BufferedImage getImage() { //returns the piece image
        return pieceImage;
    }

    public boolean isLegalMove(Piece piece, int newX, int newY) { //checks if the specified move is legal
        try {
            myChessboard = Chessboard.getInstance(); //gets the current instance of the chessboard
        } catch (IOException ex) {
            Logger.getLogger(Pawn.class.getName()).log(Level.SEVERE, null, ex);
        }

        boolean isLegal = false;
        int curX = piece.getX();
        int curY = piece.getY();

        if ((Math.abs(newX - curX) == 2) && (Math.abs(newY - curY) == 1)) {
            isLegal = true;
        } else if ((Math.abs(newX - curX) == 1) && (Math.abs(newY - curY) == 2)) {
            isLegal = true;
        }
        try {
            myChessboard = Chessboard.getInstance();
        } catch (IOException ex) {
            Logger.getLogger(Pawn.class.getName()).log(Level.SEVERE, null, ex);
        }
        //Check that a similiarly colored piece is not there
        if (myChessboard.getPiece(newX, newY) != null) {
            if (myChessboard.getPiece(newX, newY).getColor() == isWhite) {
                isLegal = false;
            }
        }
        return isLegal;
    }

    public boolean getColor() { //returns the color (white/black)
        return isWhite;
    }
    public String getKind() { //returns the kind of piece
        return "Knight";
    }

}
