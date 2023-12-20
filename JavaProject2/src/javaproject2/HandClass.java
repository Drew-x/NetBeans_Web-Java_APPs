/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author I-KingDrew-I
 */
/**
   HandClass contains 13 CardClass Objects received from DeckClass.  
 */
public class HandClass {
    
    //private ArrayList<CardClass> handCardsArray = new ArrayList<CardClass>();
   
    private CardClass[] cardsArray;
   
    /**
      Constructs a hand with no Cards.
    */
     public HandClass(){

         
         
        
    }// empty
    
    /**
     * A method to fill a Hand with 13 Cards dealt from a Deck, with each one being inserted in its proper place in the Hand 
     * @param cards fills hand with 13 sorted Card Objects
     */
    public void fill(CardClass[] cards, int size) { // ArrayList<CardClass> Changed 

        //ArrayList<CardClass> fullHand = new ArrayList<>(cards); orginal 
        CardClass[] fullHand = cards;
        //ArrayList<CardClass> hand = new ArrayList<>();
        CardClass[] hand = new CardClass[size];

        int clubsCount = 0;
        int diamondCount = 0;
        int spadesCount = 0;
        int heartCount = 0;

        // ArrayList<CardClass> sortedHand = new ArrayList<>();
      //  System.out.println("inside hand");

        for (int index = 0; index < size; index++) {

            hand[index] = fullHand[index];
            //hand.add(fullHand.get(index));

           // System.out.println(hand[index]);
        }

        for (int index = 0; index < size; index++) {

            if (hand[index].getSuit().contentEquals("\u2663")) {
                //a[clubsCount] = hand[index];
                clubsCount++;

            }
            if (hand[index].getSuit().contentEquals("\u2666")) {
                //b[diamondCount] = hand[index];
                diamondCount++;

            }

            if (hand[index].getSuit().contentEquals("\u2660")) {
                // c[spadesCount] = hand[index];
                spadesCount++;

            }
            if (hand[index].getSuit().contentEquals("\u2665")) {
                //d[heartCount] = hand[index];
                heartCount++;

            }

        }

        CardClass[] a = new CardClass[clubsCount];
        CardClass[] b = new CardClass[diamondCount];
        CardClass[] c = new CardClass[spadesCount];
        CardClass[] d = new CardClass[heartCount];

//        System.out.println("amounts");
//        System.out.println( " "+clubsCount +" "+ " "+ diamondCount +""+ " "+spadesCount+" " +" " +heartCount); 
        //============================A=======================================================      
        int start = 0;

        for (int index = 0; index < size; index++) {

            if (start < clubsCount) {

                if (hand[index].getSuit().contentEquals("\u2663")) {

                    a[start] = hand[index];
                    start++;
                }

            }

            //  System.out.println( "start" + start );       
        }

        for (int index = 0; index < clubsCount; index++) {
            int minPos = index;

            for (int j = index + 1; j < clubsCount; j++) {

                if (a[j].getFace() < a[minPos].getFace()) {
                    minPos = j;
                }

            }

            CardClass temp = a[index];
            a[index] = a[minPos];
            a[minPos] = temp;

        }
        //printing A
//        for(int i = 0; i < clubsCount; i++){
//            System.out.println(a[i]);
//           // hand[i] = a[i];
//        }

//           for(int i = 0; i < clubsCount; i++){
//            
//            
//            CardClass temp = a[i];
//            a[i] = hand[i];
//            hand[i] = temp;
//            }
        //============================A=======================================================  
        //============================B=======================================================  
        int startb = 0;

        for (int index = 0; index < size; index++) {

            if (startb < diamondCount) {

                if (hand[index].getSuit().contentEquals("\u2666")) {

                    b[startb] = hand[index];
                    startb++;
                }

            }

            //  System.out.println( "start" + startb );       
        }
        // sorting
        for (int index = 0; index < diamondCount; index++) {
            int minPos = index;

            for (int j = index + 1; j < diamondCount; j++) {

                if (b[j].getFace() < b[minPos].getFace()) {
                    minPos = j;
                }

            }

            CardClass temp = b[index];
            b[index] = b[minPos];
            b[minPos] = temp;

        }
        // printing B
//        for (int index = 0; index < diamondCount; index++) {
//
//            System.out.println(b[index]);
//
//        }

        //============================B=======================================================  
        //============================C======================================================= 
        int startc = 0;

        for (int index = 0; index < size; index++) {

            if (startc < spadesCount) {

                if (hand[index].getSuit().contentEquals("\u2660")) {

                    c[startc] = hand[index];
                    startc++;
                }

            }

            //  System.out.println( "start" + startc );       
        }
        //sorting
        for (int index = 0; index < spadesCount; index++) {
            int minPos = index;

            for (int j = index + 1; j < spadesCount; j++) {

                if (c[j].getFace() < c[minPos].getFace()) {
                    minPos = j;
                }

            }

            CardClass temp = c[index];
            c[index] = c[minPos];
            c[minPos] = temp;

        }
        //printing C
//        for (int index = 0; index < spadesCount; index++) {
//
//            System.out.println(c[index]);
//
//        }

        //============================C======================================================= 
        //============================D======================================================= 
        int startd = 0;

        for (int index = 0; index < size; index++) {

            if (startd < heartCount) {

                if (hand[index].getSuit().contentEquals("\u2665")) {

                    d[startd] = hand[index];
                    startd++;
                }

            }

        }
        //sorting
        for (int index = 0; index < heartCount; index++) {
            int minPos = index;

            for (int j = index + 1; j < heartCount; j++) {

                if (d[j].getFace() < d[minPos].getFace()) {
                    minPos = j;
                }

            }

            CardClass temp = d[index];
            d[index] = d[minPos];
            d[minPos] = temp;

        }
        //printing D
//        for (int index = 0; index < heartCount; index++) {
//
//            System.out.println(d[index]);
//
//        }

        //============================D======================================================= 
        int count = 0;
        int countc = 0;
        int countd = 0;
        for (int index = 0; index < size; index++) {

            if (index < clubsCount) {
                hand[index] = a[index];
            } else if (count < diamondCount) {
                hand[index] = b[count];
                count++;
            } else if (countc < spadesCount) {
                hand[index] = c[countc];
                countc++;
            } else if (countd < heartCount) {

                hand[index] = d[countd];
                countd++;
            }

        }

//        for(int index = 0; index < size; index++){
//            System.out.println(hand[index]);
//        }
        cardsArray = hand;

    }// end fill



    @Override
    public String toString() {
        return " " + Arrays.toString(cardsArray) ;
    }

    
    
}

//        
//        for (int index = 0; index < size; index++) {
//            
//              int minPos = index;
//              
//              for(int j = index + 1; j < size; j++ ){
//              
//                if(hand[j].getFace() < hand[minPos].getFace() ){
//                    minPos = j;
//                }
//                
//                
//             }
//              
//              CardClass temp = hand[index];
//              hand[index] = hand[minPos];
//              hand[minPos] = temp;
//           
//
//        }
        

//        for(int index = 0; index < size; index++){
//            System.out.println(hand[index]);
//        }
        
//        for (int i = 0; i < list.length - 1; i++)
//        {
//            // ...find smallest value in elements i+1 through last...
//            int minPos = i;
//            for (int j = i + 1; j < list.length; j++)
//            {
//                if (list[j] < list[minPos])
//                {
//                    minPos = j;
//                }
//            }
//            // ...and swap it with element i
//            int temp = list[i];
//            list[i] = list[minPos];
//            list[minPos] = temp;
//        }
//    }
        
        
//        for(int index = 0; index < hand.size() -1  ; index++){
//
//            if(hand.get(index).getSuit() == "\u2663"){
//                
//                a.add(new CardClass(hand.get(index).getFace(), hand.get(index).getSuit() ));
//                
//            
//           }else if(hand.get(index).getSuit() == "\u2666"){
//                
//                b.add(new CardClass(hand.get(index).getFace(), hand.get(index).getSuit() ));
//               
//            }else if(hand.get(index).getSuit() == "\u2660"){
//                
//                c.add(new CardClass(hand.get(index).getFace(), hand.get(index).getSuit() ));
//                
//            }else if(hand.get(index).getSuit() == "\u2665"){
//                
//                d.add(new CardClass(hand.get(index).getFace(), hand.get(index).getSuit() ));
// 
//            }
//        
//        }// end for loop
//        ArrayList<Integer> aa = new ArrayList<>();
//        
//        for(int i = 0; i < a.size() ; i ++){
//            aa.add(a.get(i).getFace());
//           // System.out.println("a is = " +a.get(i));
//        }// end loop
//
//         for(int i = 0; i < aa.size() ; i ++){
//             
//            for(int j = i+1; j<aa.size(); j++){
//               
//                 if(aa.get(j) > aa.get(i)){
//                    
//                     int tmp = aa.get(i);
//                     aa.set(i,aa.get(j)) ;
//                     aa.set(j,tmp);
//                     
//                 }// end if
//             }// end inner loop
//
//        }// end loop
//
//         for(int i = 0; i < aa.size() ; i ++){
//            sortedHand.add(new CardClass(aa.get(i), "\u2663"));
//          
//        }//            
//        
//
//        // begin B 
//        ArrayList<Integer> bb = new ArrayList<>();
//        
//        for(int i = 0; i < b.size() ; i ++){
//            bb.add(b.get(i).getFace());
//           // System.out.println("b is = " +b.get(i));
//        }// end loop
//
//         for(int i = 0; i < bb.size() ; i ++){
//             
//            for(int j = i+1; j<bb.size(); j++){
//               
//                 if(bb.get(j) > bb.get(i)){
//                    
//                     int tmp = bb.get(i);
//                     bb.set(i,bb.get(j)) ;
//                     bb.set(j,tmp);
//                     
//                 }// end if
//             }// end inner loop
//
//        }// end loip
//
//         for(int i = 0; i < bb.size() ; i ++){
//            
//             sortedHand.add(new CardClass(bb.get(i), "\u2666"));
//            
//        }
//         
//    // begin C
//    ArrayList<Integer> cc = new ArrayList<>();
//  
//        for(int i = 0; i < c.size() ; i ++){
//            cc.add(c.get(i).getFace());
//          
//        }// end loop
//
//         for(int i = 0; i < cc.size() ; i ++){
//             
//             for(int j = i+1; j<cc.size(); j++){
//               
//                 if(cc.get(j) > cc.get(i)){
//                    
//                     int tmp = cc.get(i);
//                     cc.set(i,cc.get(j)) ;
//                     cc.set(j,tmp);
//                     
//                 }// end if
//             }// end inner loop
//         }// end loop
//
//         for(int i = 0; i < cc.size() ; i ++){
//            sortedHand.add(new CardClass(cc.get(i), "\u2660"));
//           // System.out.println("numb is = " + cc.get(i));
//        }
//         
//         
//         // begin D
//         ArrayList<Integer> dd = new ArrayList<>();
//
//        for(int i = 0; i < d.size() ; i ++){
//            dd.add(d.get(i).getFace());
//           // System.out.println("a is = " +d.get(i));
//        }// end loop
//
//         for(int i = 0; i < dd.size() ; i ++){
//             
//             for(int j = i+1; j<dd.size(); j++){
//               
//                 if(dd.get(j) > dd.get(i)){
//                    
//                     int tmp = dd.get(i);
//                     dd.set(i,dd.get(j)) ;
//                     dd.set(j,tmp);
//                     
//                 }// end if
//             }// end inner loop
//        }// end loop
//
//         for(int i = 0; i < dd.size() ; i ++){
//            sortedHand.add(new CardClass(dd.get(i), "\u2665"));
//         
//        }// end loop
//
//         //print sort
//         for(int i = 0; i < sortedHand.size() ; i ++){
//             handCardsArray.add(sortedHand.get(i));
//
//        }// end loop
   

    /**
     * A toString method that returns a String representation of the Hand Object
     * @return representation of the Hand Object
     */
//    @Override
//    public String toString() {
//       
//        return "" + handCardsArray ;
//    }
    

//        
//        for(int index = 0; index < b.length-1; index++){
//            
//            System.out.println(b[index]);
//            
//        }
//        for(int index = 0; index < c.length-1; index++){
//            
//            System.out.println(c[index]);
//            
//        }
//        for(int index = 0; index < d.length-1; index++){
//            
//            System.out.println(d[index]);
//            
//        }
//        

        
        //ArrayList<CardClass> a = new ArrayList<>(); // clubs array list
        //ArrayList<CardClass> b = new ArrayList<>(); // diamond array list
        //ArrayList<CardClass> c = new ArrayList<>(); // spades array list
        //ArrayList<CardClass> d = new ArrayList<>(); // heart array list

       
        //adding to hand
        
//         for(int i = 0; i < diamondCount; i++){
//            
//            hand[clubsCount + i + 1] = b[i];
//            
//            }
        
      
//        for (int index = clubsCount; index < clubsCount + diamondCount ; index++) {
//            int i = 0;
//            hand[index] = b[i];
//            i++;
//            System.out.println(b[index]);
//
//        }