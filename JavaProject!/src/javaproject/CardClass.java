/*
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

/**
 *
 * @author Abedo016
 *
 */

/**
   CardClass Creates a Card Object given a Integer or an Integer 
   with a String or another Card Object.
 */
public class CardClass {
    
//    private int[] face = {2,3,4,5,6,7,8,9,10,11,12};
//    private String[] suit = {"\u2663,\u2666,\u2660,\u2665"};

    private int face;
    private String suit;
    
   
    /**
      Creates a Default Constructor for CardClass when no values are provided
     */
     public CardClass(){
        
      this.face = 0;
      this.suit = null;
        
    }// default
    
     /**
      Creates a CardClass Object with a passed Integer value 
      @param number Integer value passed 
     */
    public CardClass(int number){
       
        if(number <= 14 && number >= 2){
            
             this.suit = "\u2663";
             this.face = number;

            } else if ( (number >= 14 ) && (number <= 27) ){
                
             this.suit = "\u2666";
             this.face = number - 13;

                
            } else if ( (number >= 27 ) && (number <= 40) ){
                 
                 this.suit = "\u2660";
                 this.face = number - 26;

            } else if ( (number >= 40 ) && (number <= 53) ){
                
                 this.suit = "\u2665";
                 this.face = number - 39;
         
            } // end if/if-else
        
    }// end Constructor 

     /**
      Creates a CardClass Object with a passed Integer value and String value 
      @param face Integer value passed 
      @param suit Integer value passed  
     */    
    public CardClass(int face, String suit){
         
         this.face = face;
         this.suit = suit;
        
    }
    
    /**
      Creates a CardClass Object with a Object of Card  
      @param cardObject contains Integer and String 
     */ 
    public CardClass(CardClass cardObject){
        this.face = cardObject.face;
        this.suit = cardObject.suit;
        
    }

    // startGetters
    
    /**
      Gets the Rank of the Card Object.
      @return the Rank of the Card
   */
    public int getFace() {
        return face;
    }
    
    /**
      Gets the suit of the Card Object.
      @return the suit of the Card
    */
    public String getSuit() {
        return suit;
    }
    
    
   // end getters

    /**
      A toString method that returns a String representation of the CardClass Object
      @return  CardObject to String
    */
    @Override
    public String toString() {
        if(face == 11){
            return "J" + suit ;
        }
        if(face == 12){
            return "Q" + suit ;
        }
        if(face == 13){
            return "K" + suit ;
        }
        if(face == 14){
            return "A" + suit ;
        }
        return face + "" + suit ;
    }// end toString
    
}// end CardClass
