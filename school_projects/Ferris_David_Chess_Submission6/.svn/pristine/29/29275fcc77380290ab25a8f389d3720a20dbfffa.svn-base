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
public class Queen extends Piece {

    int x, y;
    boolean isWhite;
    BufferedImage pieceImage;
    Chessboard myChessboard;

    Queen(int newX, int newY, boolean color) throws IOException {
        //varibale which define the object
        x = newX;
        y = newY;
        isWhite = color;
        URL imageURL;

        //image reading
        if (isWhite) {
            imageURL = getClass().getResource("Chess_Icons/White_Queen.PNG");
        } else {
            imageURL = getClass().getResource("Chess_Icons/Black_Queen.PNG");
        }
        pieceImage = ImageIO.read(imageURL);
    }

    public int getX() { //returns X
        return x;
    }

    public int getY() { //returns Y
        return y;
    }

    public void setLocation(int newX, int newY) { //Setting current cell
        x = newX;
        y = newY;
    }

    BufferedImage getImage() { //returns image
        return pieceImage;
    }

    public boolean isLegalMove(Piece piece, int newX, int newY) { //check if move is legal
        try {
            myChessboard = Chessboard.getInstance(); //gets the current chessboard version
        } catch (IOException ex) {
            Logger.getLogger(Pawn.class.getName()).log(Level.SEVERE, null, ex);
        }

        boolean isLegal = false;
        int curX = piece.getX();
        int curY = piece.getY();

        //movement logic
        if ((curX == newX) || (curY == newY)) { //rows/columns
            isLegal = true;
        }
        if (Math.abs(curX - newX) == Math.abs(curY - newY)) { //diagonals
            isLegal = true;
        }
        //false checks done at end
        //Check that a similiarly colored piece is not there
        if (myChessboard.getPiece(newX, newY) != null) {
            if (myChessboard.getPiece(newX, newY).getColor() == isWhite) {
                isLegal = false;
            }
        }

        //Modified bishop code for future testing
        /*
         //Check for pieces in the way
         if (curY == newY) {
         if (newX > curX) {
         for (int x = curX + 1; x < newX; x++) {
         if (myChessboard.getPiece(x, curY) != null) {
         isLegal = false;
         }
         }
         } else if (newX < curX) {
         for (int x = curX - 1; x > newX; x--) {
         if (myChessboard.getPiece(x, curY) != null) {
         isLegal = false;
         }
         }
         }
         } else if (curX == newX) {

         if (newY > curY) {
         for (int y = curY + 1; y < newY; y++) {
         if (myChessboard.getPiece(curY, y) != null) {
         isLegal = false;
         }
         }
         } else if (newY < curY) {
         for (int y = curY - 1; y > newY; y--) {
         if (myChessboard.getPiece(curY, y) != null) {
         isLegal = false;
         }
         }
         }
         }
         */
        return isLegal;
    }

    public boolean getColor() { //returns the color (white/black)
        return isWhite;
    }

    public String getKind() { //returns what kind of piece it is
        return "Queen";
    }
}
