/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nimproject4;

/**
 *
 * @author Abedo016
 */
/**
   Describes any class whose objects can move or have a player name.
*/
public interface PlayerInterface {
    
   /**
      Allows player to take marbles from the Pile.
      @return the amount or marbles in play
   */
    public int move(int setStartingMarbles);
    
    /**
      Computes the players name.
      @return the name
   */
    public String playersName();
}
