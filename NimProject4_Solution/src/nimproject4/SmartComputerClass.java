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
 * SmartComputerClass Creates a SmartComputerClass Object given a String that
 * contains players name. Implements PlayerInterface removes exactly enough
 * marbles to make the remaining pile size a power of two minus one (i.e. 1, 3,
 * 7, 15, 31, or 63).
 *
 */
public class SmartComputerClass implements PlayerInterface {

    String name = "";
    Random random = new Random();

     /**
     * Creates a Constructor for SmartComputerClass when a String value
     * is provided.
     *
     * @param name players name.
     */
    public SmartComputerClass(String name) {

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

        boolean checker = false;

        int n = 0;
        int findCorrectNumber = 0;

        while (!checker) {

            findCorrectNumber = (int) (Math.pow(2, n) - 1);

            if (findCorrectNumber > setStartingMarbles) {

                System.out.println("insidex" + n);
                System.out.println("insidex" + findCorrectNumber);
                n -= 1;
                checker = true;
            } else if (findCorrectNumber == setStartingMarbles) {

                n -= 1;
                checker = true;
            } else {
                n++;
            }

        }// end while

        System.out.println("what is n = " + n);
        findCorrectNumber = (int) (Math.pow(2, n) - 1);
        System.out.println("what is n = " + findCorrectNumber);

        // num
        int divideCheck = (int) Math.floor(setStartingMarbles / 2);
        System.out.println(divideCheck);

        int sum = setStartingMarbles - findCorrectNumber;

        System.out.println("what is nxs = " + sum);
        System.out.println("How many mables would you like to take away? Current Marbles " + setStartingMarbles);

        int takingMarblesAway = random.nextInt(setStartingMarbles);

        if (sum <= divideCheck || sum <= 0) {

            if (setStartingMarbles == 1) {
                return 1;
            }

            return sum;

        } else {
            System.out.println("in while");
            while (takingMarblesAway > divideCheck || takingMarblesAway <= 0) {
                System.out.println("Player: " + this.playersName());
                System.out.println("Please enter a value between 1 - " + divideCheck + " Current marbles are = " + setStartingMarbles);
                // System.out.println("Tried to take out "+ takingMarblesAway);
                takingMarblesAway = random.nextInt(setStartingMarbles);

                if (setStartingMarbles == 1) {

                    return 1;

                }
            }

        }
        return takingMarblesAway;
    }

    /**
     * Implemented method from PlayerInterface Gets the players name      *
     * @return string of players name.
     */
    @Override
    public String playersName() {

        return this.name;
    }

}
