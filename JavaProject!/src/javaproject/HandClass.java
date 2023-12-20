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

/**
 *
 * @author Abedo016
 */
/**
   HandClass contains 13 CardClass Objects received from DeckClass.  
 */
public class HandClass {
    
    private ArrayList<CardClass> handCardsArray = new ArrayList<CardClass>();
    
    /**
      Constructs a hand with no Cards.
    */
    public HandClass(){
        
        
    }// end empty hand
    
    /**
     * A method to fill a Hand with 13 Cards dealt from a Deck, with each one being inserted in its proper place in the Hand 
     * @param cards fills hand with 13 sorted Card Objects
     */
    public void fill(ArrayList<CardClass> cards){
        
        ArrayList<CardClass> fullHand = new ArrayList<>(cards);
        ArrayList<CardClass> hand = new ArrayList<>();
        
        ArrayList<CardClass> a = new ArrayList<>(); // clubs array list
        ArrayList<CardClass> b = new ArrayList<>(); // diamond array list
        ArrayList<CardClass> c = new ArrayList<>(); // spades array list
        ArrayList<CardClass> d = new ArrayList<>(); // heart array list
        
        ArrayList<CardClass> sortedHand = new ArrayList<>();
        
     
        for(int index = 0; index <= 13; index++){
            
            hand.add(fullHand.get(index));
  
        }
        

        for(int index = 0; index < hand.size() -1  ; index++){

            if(hand.get(index).getSuit() == "\u2663"){
                
                a.add(new CardClass(hand.get(index).getFace(), hand.get(index).getSuit() ));
                
            
           }else if(hand.get(index).getSuit() == "\u2666"){
                
                b.add(new CardClass(hand.get(index).getFace(), hand.get(index).getSuit() ));
               
            }else if(hand.get(index).getSuit() == "\u2660"){
                
                c.add(new CardClass(hand.get(index).getFace(), hand.get(index).getSuit() ));
                
            }else if(hand.get(index).getSuit() == "\u2665"){
                
                d.add(new CardClass(hand.get(index).getFace(), hand.get(index).getSuit() ));
 
            }
        
        }// end for loop
        ArrayList<Integer> aa = new ArrayList<>();
        
        for(int i = 0; i < a.size() ; i ++){
            aa.add(a.get(i).getFace());
           // System.out.println("a is = " +a.get(i));
        }// end loop

         for(int i = 0; i < aa.size() ; i ++){
             
            for(int j = i+1; j<aa.size(); j++){
               
                 if(aa.get(j) > aa.get(i)){
                    
                     int tmp = aa.get(i);
                     aa.set(i,aa.get(j)) ;
                     aa.set(j,tmp);
                     
                 }// end if
             }// end inner loop

        }// end loop

         for(int i = 0; i < aa.size() ; i ++){
            sortedHand.add(new CardClass(aa.get(i), "\u2663"));
          
        }//            
        

        // begin B 
        ArrayList<Integer> bb = new ArrayList<>();
        
        for(int i = 0; i < b.size() ; i ++){
            bb.add(b.get(i).getFace());
           // System.out.println("b is = " +b.get(i));
        }// end loop

         for(int i = 0; i < bb.size() ; i ++){
             
            for(int j = i+1; j<bb.size(); j++){
               
                 if(bb.get(j) > bb.get(i)){
                    
                     int tmp = bb.get(i);
                     bb.set(i,bb.get(j)) ;
                     bb.set(j,tmp);
                     
                 }// end if
             }// end inner loop

        }// end loip

         for(int i = 0; i < bb.size() ; i ++){
            
             sortedHand.add(new CardClass(bb.get(i), "\u2666"));
            
        }
         
    // begin C
    ArrayList<Integer> cc = new ArrayList<>();
  
        for(int i = 0; i < c.size() ; i ++){
            cc.add(c.get(i).getFace());
          
        }// end loop

         for(int i = 0; i < cc.size() ; i ++){
             
             for(int j = i+1; j<cc.size(); j++){
               
                 if(cc.get(j) > cc.get(i)){
                    
                     int tmp = cc.get(i);
                     cc.set(i,cc.get(j)) ;
                     cc.set(j,tmp);
                     
                 }// end if
             }// end inner loop
         }// end loop

         for(int i = 0; i < cc.size() ; i ++){
            sortedHand.add(new CardClass(cc.get(i), "\u2660"));
           // System.out.println("numb is = " + cc.get(i));
        }
         
         
         // begin D
         ArrayList<Integer> dd = new ArrayList<>();

        for(int i = 0; i < d.size() ; i ++){
            dd.add(d.get(i).getFace());
           // System.out.println("a is = " +d.get(i));
        }// end loop

         for(int i = 0; i < dd.size() ; i ++){
             
             for(int j = i+1; j<dd.size(); j++){
               
                 if(dd.get(j) > dd.get(i)){
                    
                     int tmp = dd.get(i);
                     dd.set(i,dd.get(j)) ;
                     dd.set(j,tmp);
                     
                 }// end if
             }// end inner loop
        }// end loop

         for(int i = 0; i < dd.size() ; i ++){
            sortedHand.add(new CardClass(dd.get(i), "\u2665"));
         
        }// end loop

         //print sort
         for(int i = 0; i < sortedHand.size() ; i ++){
             handCardsArray.add(sortedHand.get(i));

        }// end loop
        
    }// end fill

    /**
     * A toString method that returns a String representation of the Hand Object
     * @return representation of the Hand Object
     */
    @Override
    public String toString() {
       
        return "" + handCardsArray ;
    }
    
}

            
         
        
         
