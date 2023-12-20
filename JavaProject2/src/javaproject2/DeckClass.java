/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author I-KingDrew-I
 */
/**
   DeckClass contains 52 CardClass Objects.  
 */
public class DeckClass {
    
    
    private ArrayList<CardClass> deckArray = new ArrayList<CardClass>();
    
    
    private int maxCards = 52;
    
    CardClass[] cardsArray = new CardClass[maxCards];
    /**
      Creates a DeckClass Object containing 52 Card Objects 
     */
    public DeckClass(){
        
        int count = 2; // starting card number
        
        for(int index = 0; index < maxCards ; index++){
            
            CardClass card = new CardClass(count);
            count++;
           // deckArray.add(card);
            cardsArray[index] = card;
 
        }// end for loop
  
        for(int index =0; index<maxCards; index++){
           // System.out.println("Array "+cardsArray[index].getFace() + cardsArray[index].getSuit() );
            
        }// works array
        
        //deckArray = shuffleDeck();
        cardsArray = shuffleDeck();

        //deals();

       
    } // end DeckClass
    
    /**
      A method that deals the top card.
      *@return deckArray returns the Card object on top of the Deck
     */
    public CardClass[] deals(){
        
       return cardsArray;
       
    }
    

        
    //Started Edit now
    /**
     * A method that shuffles the deck.
     * @return CardClass Object in random order
     */
    public CardClass[] shuffleDeck(){
        
        Random generator = new Random();
        
       // System.out.println(randomNumber);
        
        for(int index = 0; index < maxCards ; index++ ){
            int randomNumber = generator.nextInt(maxCards); 
            
            CardClass removedCard = cardsArray[randomNumber];
            CardClass cardIndex = cardsArray[index];
            
            cardsArray[index] = removedCard;
            cardsArray[randomNumber] = cardIndex;
         
        }
        
        System.out.println();
        
        for(int index =0; index < maxCards; index++){
            //System.out.println("Array "+cardsArray[index].getFace() + cardsArray[index].getSuit() + index );
            //System.out.println(cardsArray[index]+ "" +index);
        }// works array

    
    return cardsArray;
    }

    @Override
    public String toString() {
        return "DeckClass{" + "deckArray=" + deckArray + ", maxCards=" + maxCards + ", cardsArray=" + Arrays.toString(cardsArray) + '}';
    }

    /**
       A toString method that returns a String representation of the DeckClass Object 
       @return DeckClass contains all the Card Objects Stored inside
     */ 
    
//    @Override
//    public String toString() {
//        return "" + deckArray + "" + maxCards ;
//    }
    
}// end DeckClass


  
        //ArrayList<CardClass> cards = new ArrayList<>(deckArray);
        
        
        //ArrayList<CardClass> shuffleCards = new ArrayList<>();
        //Random generator = new Random();
       // int resize = cards.size();
       // System.out.println("size reSizee"+resize); Problem was - 1
       
//        for(int index = 0; index < resize; index++){
//            int randomNumber = generator.nextInt(cards.size());
//            
//
//            shuffleCards.add(cards.get(randomNumber));
//            cards.remove(randomNumber);
//   
//        }// end For loop
        

    //    return shuffleCards;