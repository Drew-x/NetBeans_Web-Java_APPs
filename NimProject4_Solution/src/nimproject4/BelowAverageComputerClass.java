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
 * BelowAverageComputerClass Creates a BelowAverageComputerClass Object given a
 * String that contains players name. Implements PlayerInterface removes a
 * random number of marbles between 1 and n/2 each turn.  *
 */
public class BelowAverageComputerClass implements PlayerInterface {

    String name = "";
    Random random = new Random();

    /**
     * Creates a Constructor for BelowAverageComputerClass when a String value
     * is provided.
     *
     * @param name players name.
     */
    public BelowAverageComputerClass(String name) {

        this.name = name;

    }// end

    /**
     *
     * A move method Implemented method from PlayerInterface that returns the
     * number of marbles taken.
     *
     * @param setStartingMarbles passes the current amount of marbles in the
     * game
     * @return amount of marbles
     */
    @Override
    public int move(int setStartingMarbles) {

        int takingMarblesAway = random.nextInt(setStartingMarbles);

        System.out.println("How many mables would you like to take away? Current Marbles " + setStartingMarbles);
        
        while (takingMarblesAway > setStartingMarbles / 2 || takingMarblesAway <= 0) {
            
            System.out.println("Player: " + this.playersName());
            System.out.println("Please enter a value between 1 - " + setStartingMarbles / 2 + " Current marbles are = " + setStartingMarbles);
            System.out.println("Tried to take out " + takingMarblesAway);
            takingMarblesAway = random.nextInt(setStartingMarbles);

            if (setStartingMarbles == 1) {
                return 1;
            }// end if
            
        }// end while

        return takingMarblesAway;
        
    }// end move

    /**
     * Implemented method from PlayerInterface Gets the players name      *
     * @return string of players name.
     */
    @Override
    public String playersName() {

        return this.name;
    }// end playerName

}// end belowAverageComputerClass
