/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ferris_david_chess_submission6;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.ImageObserver;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

/**
 *
 * @author davidferris
 */
public class Chessboard extends JPanel implements KeyListener, MouseMotionListener, MouseListener {
    //UI variables
    int mouseX;
    int mouseY;
    public static Piece selectedPiece;
    public static boolean pieceSelected;
    
    
    public final int TILE_SIZE = 90;
    private static Chessboard instance; //instance for class getters

    Piece[][] board = new Piece[8][8]; //creates a new array of pieces

    Chessboard() throws IOException {
        //setting up the GUI
        setSize(500, 500);
        setVisible(true);
        setFocusable(true);
        requestFocus();
        repaint();
        addMouseMotionListener(this);
        addMouseListener(this);
        addKeyListener(this);

        //Spawn White Pawns
        for (int x = 0; x < 8; x++) {
            board[x][6] = new Pawn(x, 6, true);
        }

        board[4][7] = new King(4, 7, true); //Spawn White King
        board[3][7] = new Queen(3, 7, true); //Spawn White Queen

        //Spawn White Bishops
        board[2][7] = new Bishop(2, 7, true);
        board[5][7] = new Bishop(5, 7, true);

        //Spawn White Knights
        board[1][7] = new Knight(1, 7, true);
        board[6][7] = new Knight(6, 7, true);

        //Spawn White Rooks
        board[0][7] = new Rook(0, 7, true);
        board[7][7] = new Rook(7, 7, true);

        //Spawn Black Pawns
        for (int x = 0; x < 8; x++) {
            board[x][1] = new Pawn(x, 1, false);
        }

        //Spawn Black King
        board[4][0] = new King(4, 0, false);

        //Spawn Black Queen
        board[3][0] = new Queen(3, 0, false);

        //Spawn Black Bishops
        board[2][0] = new Bishop(2, 0, false);
        board[5][0] = new Bishop(5, 0, false);

        //Spawn Black Knights
        board[1][0] = new Knight(1, 0, false);
        board[6][0] = new Knight(6, 0, false);

        //Spawn Black Rooks
        board[0][0] = new Rook(0, 0, false);
        board[7][0] = new Rook(7, 0, false);
    }

    public static Chessboard getInstance() throws IOException { //allows the pieces classes to access the board
        if (instance == null) {
            instance = new Chessboard();
        }
        return instance;
    }

    public void paintComponent(Graphics g) {

        //Draw Board
        g.setColor(new Color(240, 217, 181));
        g.fillRect(0, 0, 8 * TILE_SIZE, 8 * TILE_SIZE);
        g.setColor(new Color(181, 136, 99));
        for (int rows = 0; rows < 8; rows++) {
            for (int columns = 0; columns < 8; columns++) {
                if ((rows + columns) % 2 == 1) {
                    g.fillRect(rows * TILE_SIZE, columns * TILE_SIZE, TILE_SIZE, TILE_SIZE);
                }
            }
        }

        //Draw Pieces
        for (int a = 0; a < 8; a++) {
            for (int b = 0; b < 8; b++) {
                if (board[a][b] != null) {
                    g.drawImage(board[a][b].getImage(), 10 + a * TILE_SIZE, 10 + b * TILE_SIZE, this);
                }
            }
        }

        //Draw Selected Box
        if (pieceSelected) {
            g.setColor(Color.red);
            g.drawRect(mouseX * TILE_SIZE, mouseY * TILE_SIZE, TILE_SIZE, TILE_SIZE);
        }
    }

    public Piece getPiece(int x, int y) { //returns a piece at a given location
        return board[x][y];
    }

    public void move(Piece piece, int newX, int newY) throws IOException {
        if (piece.isLegalMove(piece, newX, newY)) { //Check if move is legal
            if (piece != null) { //some piece exists in that place
                board[piece.getX()][piece.getY()].setLocation(newX, newY);
            }

            updateBoard();
            board[piece.getX()][piece.getY()] = null; //set the old square to be null
        }
    }

    public void move(int oldX, int oldY, int newX, int newY) throws IOException {
        if (board[oldX][oldY].isLegalMove(board[oldX][oldY], newX, newY)) { //Check if move is legal
            if (board[oldX][oldY] != null) { //prevents nullpointer exceptions
                board[oldX][oldY].setLocation(newX, newY); //adds the piece to the new location
            }
            updateBoard();
            board[oldX][oldY] = null; //sets the old location to be null
            updateBoard();
        }
    }

    public boolean isWhiteThere(int x, int y) { //equivalent to piece class getColor method
        return board[x][y].getColor();
    }

    public void checkPawns() throws IOException {
        //check for last rank pawns
        for (int x = 0; x < 8; x++) {
            if ((board[x][0] != null) && (board[x][0].getKind().equals("Pawn"))) {
                board[x][0] = new Queen(x, 0, true);
            } else if ((board[x][7] != null) && (board[x][7].getKind().equals("Pawn"))) {
                board[x][7] = new Queen(x, 7, false); //turn pawn into queen
            }
        }
    }

    public void updateBoard() throws IOException {
        //sets the board based on what the pieces have stored
        for (int a = 0; a < 8; a++) {
            for (int b = 0; b < 8; b++) { //loops through entire board
                if (board[a][b] != null) {
                    try {
                        board[board[a][b].getX()][board[a][b].getY()] = board[a][b]; //gets the locations from the piece and updates board
                    } catch (NullPointerException e) {

                    }
                }
            }
        }
        //check pawns
        checkPawns();
    }

    public void mouseClicked(MouseEvent e) {
        int newX;
        int newY;

        if (pieceSelected == false) { //if a piece has just been slected
            pieceSelected = true;
            //get the clicked cell
            mouseX = (int) (e.getX() / TILE_SIZE);
            mouseY = (int) (e.getY() / TILE_SIZE);
        } else { //if a piece has not been selected
            //new piece location
            newX = (int) (e.getX() / TILE_SIZE);
            newY = (int) (e.getY() / TILE_SIZE);

            if (board[mouseX][mouseY] != null) { //ensure that a piece has been selected (not empty cell)
                if (mouseX != newX || mouseY != newY) {
                    try {
                        //check that the same square has not been selected
                        move(mouseX, mouseY, newX, newY);
                    } catch (IOException ex) {
                        Logger.getLogger(Chessboard.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
            pieceSelected = false;
        }
    }

    //MOUSE EVENTS
    public void mouseReleased(MouseEvent e) {

    }

    public void keyTyped(KeyEvent e) {
    }

    public void keyPressed(KeyEvent e) {

    }

    public void keyReleased(KeyEvent e) {
    }

    public void mouseEntered(MouseEvent e) {

    }

    public void mouseExited(MouseEvent e) {

    }

    public void mouseMoved(MouseEvent e) {

    }

    public void mouseDragged(MouseEvent e) {

    }

    public void mousePressed(MouseEvent e) {

    }
}