/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nimproject4;

import java.util.Scanner;

/**
 *
 * @author Abedo016
 */
/**
 * HumanClass Creates a HumanClass Object given a String that contains players
 * name. Implements PlayerInterface The Human enters the number of marbles to be
 * removed interactively  *
 */
public class HumanClass implements PlayerInterface {

    String name = "";

     /**
     * Creates a Constructor for HumanClass when a String value
     * is provided.
     *
     * @param name players name.
     */
    public HumanClass(String name) {

        this.name = name;
    } // end constructor 

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
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many mables would you like to take away? Current Marbles: " + setStartingMarbles);

        int takingMarblesAway = scanner.nextInt();

        while (takingMarblesAway > setStartingMarbles / 2 || takingMarblesAway <= 0) {

            System.out.println("Player: " + this.playersName());
            System.out.println("Tried to take out " + takingMarblesAway);
            System.out.println("Please enter a value between 1 - " + setStartingMarbles / 2 + " Current marbles are = " + setStartingMarbles);
            
            takingMarblesAway = scanner.nextInt();

//            if(setStartingMarbles == 1){
//                System.out.println("inside if" + takingMarblesAway + " and "+ setStartingMarbles);
//                return 1;
//                
//            }

        }// end while

        return takingMarblesAway;
    }

    /**
     * Implemented method from PlayerInterface Gets the players name      *
     * @return string of players name.
     */
    @Override
    public String playersName() {

        return this.name;
    }// end playersName

}// end HumanClass
