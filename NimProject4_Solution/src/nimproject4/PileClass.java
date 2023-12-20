/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nimproject4;

import java.util.Random;

/**
 *
 * @author Abedo016
 */
/**
 * PileClass Creates a PileClass Object that is used to create and maintain a
 * pile of marbles between 10 and 100 marbles, inclusive, where the size is set
 * randomly.
 */
public class PileClass {

    public static int numberOfMarbles = -1;

    private final int max = 101;
    private final int min = 11;

    //public static int removedAmount = 0;
    public PileClass() {

        numberOfMarbles = createPileOfMarbles();

    } // end end constructor 

    /**
     * A createPileOfMarbles() method that pile of marbles between 10 and 100
     * marbles, inclusive, where the size is set randomly.
     *
     * @return amount of marbles generated
     */
    public int createPileOfMarbles() {

        Random random = new Random();

        return random.nextInt((max - min) + 1) + min;
    }// end created pile

    /**
     * A setNumberOfMarbles() method that maintains the pile of marbles each
     * time a player takes marbles away
     *
     */
    public void setNumberOfMarbles(int numberOfMarbles) {
        this.numberOfMarbles = numberOfMarbles;
    }// end setMarbles

    /**
     * A getNumberOfMarbles() method that returns safely returns the current
     * value of marbles left inside the pile.
     *
     * @return number of marbles left in the pile
     */
    public static int getNumberOfMarbles() {
        return numberOfMarbles;
    }// end getNumberOfMables

}// end pile class
