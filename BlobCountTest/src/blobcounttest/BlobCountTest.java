/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blobcounttest;

/**
 *
 * @author I-KingDrew-I
 */




import javax.swing.JOptionPane;
import java.util.Random;

/**
 * Uses recursion to count all the "blobs" on a playing surface (board) which is
 * a square matrix. A "blob" is any number of non-empty squares that are either
 * vertically, horizontally, or diagonally adjacent to one another.
 */
class BlobCount
{
    // instance var

    private static Board board;

    /**
     * Creates a BlobCount object.
     *
     * @param size the number of rows and columns of the playing board
     * @param num the number of squares to be filled
     */
    public BlobCount(int size, int num)
    {
        board = new Board(size, num);   // call Board constructor
        board.print();			// print the board
    }

    /**
     * Counts the number of blobs on the board. Calls recursive "helper" method
     * countBlobs(row,col).
     */
    public void countBlobs()
    {
        // visit each square of the board...
        for (int row = 0; row < board.size; row++)
        {
            for (int col = 0; col < board.size; col++)
            {
                // get size of blob starting at a given square by calling the
                // recursive "helper" method		   	
                int count = countBlobs(row, col);
                // if blob was found, print its size
                if (count > 0)
                {
                    System.out.println("At [" + row + "][" + col + "] found blob "
                            + "of size " + count);
                }
            }
        }
    }

    public Board getBoard()
    {
        return board;
    }
    
    // Private recursive utility (i.e., "helper" method) called by countBlobs().
    // Returns the size (i.e., number of non-empty squares) of the blob
    // emanating from board[row][col].
    private int countBlobs(int row, int col)
    {
        // trivial cases
        if (row < 0 || row >= board.size)
        {
            return 0;		// row non-existent
        }
        if (col < 0 || col >= board.size)
        {
            return 0;		// col non-existent
        }
        if (board.getSquare(row, col) == ' ')
        {
            return 0;	// empty square
        }
        // here if we have found the first square of a blob

        // must make the square empty so it will not be counted again!
        board.setSquare(row, col, ' ');

        // the size of the blob is 1 plus the size of the blobs emanating 
        // from each of the 8 neighboring squares

        return 1 + countBlobs(row - 1, col - 1) + countBlobs(row - 1, col)
                + countBlobs(row - 1, col + 1) + countBlobs(row, col - 1)
                + countBlobs(row, col + 1) + countBlobs(row + 1, col - 1)
                + countBlobs(row + 1, col) + countBlobs(row + 1, col + 1);
    }
}

/**
 * A test class for the BlobCount class.
 */
public class BlobCountTest
{

    public static void main(String args[])
    {
        String input = JOptionPane.showInputDialog("Creating an \"N by N\" matrix."
                + "\nPlease enter a value for N");
        int size = Integer.parseInt(input);
        input = JOptionPane.showInputDialog("Enter number of squares to fill"
                + "\n(an int between 0 and N squared)");
        int num = Integer.parseInt(input);

        BlobCount b = new BlobCount(size, num);
        b.countBlobs();
        System.out.println();
    }
}

/*  sample output:

	----------------------
	|          *   *   * |
	|  *     *           |
	|*   *               |
	|          *     *   |
	|      * *   *       |
	|            *     * |
	|              *     |
	|    *         *     |
	|*   *     *         |
	|                *   |
	----------------------

At [0][5] found blob of size 2
At [0][7] found blob of size 1
At [0][9] found blob of size 1
At [1][1] found blob of size 3
At [3][5] found blob of size 7
At [3][8] found blob of size 1
At [5][9] found blob of size 1
At [7][2] found blob of size 2
At [8][0] found blob of size 1
At [8][5] found blob of size 1
At [9][8] found blob of size 1

 */

/**
 * An "N by N" board with each square either empty or filled with a star (i.e.,
 * an asterisk). Suitable for use by applications that need a maze-type playing
 * surface.
 */
class Board
{
    // instance var's

    public final int size;		// number of rows and columns (constant)
    private int stars;			// number of squares to fill initially
    private char[][] board;		// implemented as 2D array of char
    private static Random r = new Random();

    /**
     * Creates a board.
     *
     * @param size the number of rows and columns
     * @param stars the number of squares to be filled with an asterisk
     */
    public Board(int size, int stars)
    {
        board = new char[size][size];
        this.size = size;		// note initialization of constant
        this.stars = stars;
        this.initialize();
    }

    /**
     * Returns the character in a given square of the board.
     *
     * @param row the row of the square
     * @param col the column of the square
     * @return the char in board[row][col]
     */
    public char getSquare(int row, int col)
    {
        return board[row][col];
    }

    /**
     * Places a character in a given square of the board.
     *
     * @param row the row of the square
     * @param col the column of the square
     * @param setChar the char to be placed in board[row][col]
     */
    public void setSquare(int row, int col, char setChar)
    {
        board[row][col] = setChar;
    }

    // Initializes the board by putting a blank in each square and then placing 
    // exactly "stars" asterisks on it in random locations. 
    private void initialize()
    {
        // first place all blanks
        for (int i = 0; i < size; i++)
        {
            for (int j = 0; j < size; j++)
            {
                board[i][j] = ' ';
            }
        }

        // place "stars" number of asterisks in random squares
        int count = 0;
        while (count < stars) // while more '*'s needed...
        {
            int row = r.nextInt(size);      // get random row and column
            int col = r.nextInt(size);
            if (board[row][col] == ' ')     // if no '*' there already ...
            {
                board[row][col] = '*';      // ...place a '*' there
                count++;
            }
        }
    }

    /**
     * Prints the board to the console.
     */
    public void print()
    {
        // print top boarder
        System.out.print("\n\t-");
        for (int i = 1; i <= 2 * size + 1; i++)
        {
            System.out.print("-");
        }
        System.out.println();

        for (int i = 0; i < size; i++) // for each row...
        {
            System.out.print("\t|");	   // ...print left border
            for (int j = 0; j < size; j++) // ...for each col in row
            {
                System.out.print(board[i][j] + " ");	// ...print contents
            }
            System.out.println("|");			// ...print right border
        }

        // print bottom boarder
        System.out.print("\t-");
        for (int i = 1; i <= 2 * size + 1; i++)
        {
            System.out.print("-");
        }
        System.out.println("\n");
    }
}