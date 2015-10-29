/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ferris_david_chess_submission6;

import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author davidferris
 */
public class Bishop extends Piece {

    int x, y;
    boolean isWhite;
    BufferedImage pieceImage;
    Chessboard myChessboard;

    Bishop(int newX, int newY, boolean color) throws IOException {
        //varibale which define the object
        x = newX;
        y = newY;
        isWhite = color;
        URL imageURL;

        //image reading
        if (isWhite) {
            imageURL = getClass().getResource("Chess_Icons/White_Bishop.PNG");

        } else {
            imageURL = getClass().getResource("Chess_Icons/Black_Bishop.PNG");
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
            myChessboard = Chessboard.getInstance();
        } catch (IOException ex) {
            Logger.getLogger(Pawn.class.getName()).log(Level.SEVERE, null, ex);
        }

        boolean isLegal = false;
        int curX = piece.getX();
        int curY = piece.getY();

        if (Math.abs(curX - newX) == Math.abs(curY - newY)) { //If deltaX == deltaY
            isLegal = true;
        }

        //Check that a similiarly colored piece is not there
        if (myChessboard.getPiece(newX, newY) != null) {
            if (myChessboard.getPiece(newX, newY).getColor() == isWhite) {
                isLegal = false;
            }

            //Check for pieces in the way
            if (curY < newY) { //down diagonals
                if (curX < newX) { //right diagonal
                    for (int x = 1; x < newX - curX; x++) {
                        if (myChessboard.getPiece(curX + x, curY + x) != null) {
                            isLegal = false;
                        }
                    }
                } else if (curX > newX) { //left diagonal
                    for (int x = 1; x < newX - curX; x++) {
                        if (myChessboard.getPiece(curX - x, curY + x) != null) {
                            isLegal = false;
                        }
                    }
                }
            } else if (curY > newY) { //up diagonals
                if (curX < newX) { //right diagonals
                    for (int x = 1; x < newX - curX; x++) {
                        if (myChessboard.getPiece(curX + x, curY - x) != null) {
                            isLegal = false;
                        }
                    }
                } else if (curX > newX) { //left diagonals
                    for (int x = 1; x < newX - curX; x++) {
                        if (myChessboard.getPiece(curX - x, curY - x) != null) {
                            isLegal = false;
                        }
                    }
                }
            }
        }

        return isLegal;
    }

    public boolean getColor() { //returns the color (black/white)
        return isWhite;
    }

    public String getKind() { //returns the kind of piece
        return "Bishop";
    }

}
