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
public class Pawn extends Piece {
    //variables which define the piece
    private int x;
    private int y;
    private BufferedImage pieceImage;
    private boolean isWhite;
    Chessboard myChessboard;

    public Pawn(int newX, int newY, boolean color) throws IOException {
        //varibale which define the object
        x = newX;
        y = newY;
        isWhite = color;

        //image reading
        URL imageURL;
        if (isWhite) {
            imageURL = getClass().getResource("Chess_Icons/White_Pawn.PNG");

        } else {
            imageURL = getClass().getResource("Chess_Icons/Black_Pawn.PNG");
        }
        pieceImage = ImageIO.read(imageURL);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    void setLocation(int newX, int newY) {
        x = newX;
        y = newY;
    }

    BufferedImage getImage() {
        return pieceImage;
    }

    boolean isLegalMove(Piece piece, int newX, int newY) {
        //Get the instance of chessboard to access other pieces
        try {
            myChessboard = Chessboard.getInstance();
        } catch (IOException ex) {
            Logger.getLogger(Pawn.class.getName()).log(Level.SEVERE, null, ex);
        }
        

        boolean isLegal = false;
        int curX = piece.getX();
        int curY = piece.getY();

        if (getColor() == true) { //For white pawns
            if (curX - newX == 0) { //cannot move sideways      
                if (piece.getY() == 6) { //on the first rank
                    if ((curY - newY == 2) || (curY - newY == 1)) { //can move 1 or 2
                        isLegal = true;
                    }
                } else { //is on some other rank
                    if (curY - newY == 1) {
                        isLegal = true;
                    }
                }
            }
            //For taking pawns
            if ((myChessboard.getPiece(newX, newY) != null) && (curY - newY == 1) && Math.abs(curX - newX) == 1) {
                isLegal = true;
            }
            

        } else { //For black pawns
            if (curX - newX == 0) { //cannot move sideways
                if (piece.getY() == 1) { //on the first rank
                    if ((curY - newY == -2) || (curY - newY == -1)) { //can move 1 or 2
                        isLegal = true;
                    }
                } else { //is on some other rank
                    if (curY - newY == -1) {
                        isLegal = true;
                    }
                }
            }
            //For taking pawns
            if ((myChessboard.getPiece(newX, newY) != null) && (curY - newY == -1) && Math.abs(curX - newX) == 1) {
                isLegal = true;
            }

        }
        //Run false checks at the end
        //Cannot pass through pawns
            if ((myChessboard.getPiece(newX, newY) != null) && (newX == curX)) {
                isLegal = false;
            }
        
        //Check that a similiarly colored piece is not there
        if (myChessboard.getPiece(newX, newY) != null) {
            if (myChessboard.getPiece(newX, newY).getColor() == isWhite) {
                isLegal = false;
            }
        }
        return isLegal;
    }

    public boolean getColor() { //returns the color (black/white)
        return isWhite;
    }
    public String getKind() { //returns the kind of piece
        return "Pawn";
    }
}
