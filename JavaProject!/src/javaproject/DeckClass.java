
/*
Section number: Cop3337 U11
Student ID: 5852258
I affirm that this program is enterely my own work and none of it is the work of any
other person. ______Andrew Bedon___________________________________________
*/

/**
package javaproject
*/
package javaproject;

import java.util.ArrayList;
import java.util.Random;
/**
 *
 * @author Abedo016
 */

/**
   DeckClass contains 52 CardClass Objects.  
 */
public class DeckClass {
    
    
    private ArrayList<CardClass> deckArray = new ArrayList<CardClass>();
    
    private int maxCards = 52;
    
    /**
      Creates a DeckClass Object containing 52 Card Objects 
     */
    public DeckClass(){
        
        int count = 2; // starting card number
        
        for(int index = 0; index < maxCards ; index++){
            
            CardClass card = new CardClass(count);
            count++;
            deckArray.add(card);
 
        }// end for loop
  
        deckArray = shuffleDeck();

        deals();

       
    } // end DeckClass
    
    /**
      A method that deals the top card.
      *@return deckArray returns the Card object on top of the Deck
     */
    public ArrayList<CardClass> deals(){
        
       return deckArray;
       
    }
    

        
    //Started Edit now
    /**
     * A method that shuffles the deck.
     * @return CardClass Object in random order
     */
    public ArrayList<CardClass> shuffleDeck(){
        
  
        ArrayList<CardClass> cards = new ArrayList<>(deckArray);
        ArrayList<CardClass> shuffleCards = new ArrayList<>();
        Random generator = new Random();
        int resize = cards.size();
       // System.out.println("size reSizee"+resize); Problem was - 1
        for(int index = 0; index < resize; index++){
            int randomNumber = generator.nextInt(cards.size());
            

            shuffleCards.add(cards.get(randomNumber));
            cards.remove(randomNumber);
   
        }// end For loop
        

        return shuffleCards;
    }

    /**
       A toString method that returns a String representation of the DeckClass Object 
       @return DeckClass contains all the Card Objects Stored inside
     */ 
    @Override
    public String toString() {
        return "" + deckArray + "" + maxCards ;
    }
    
}// end DeckClass






