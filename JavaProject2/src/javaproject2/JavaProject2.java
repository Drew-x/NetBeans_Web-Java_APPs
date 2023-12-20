/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject2;

import java.lang.reflect.Array;
import java.util.Scanner;

/**
 *
 * @author I-KingDrew-I
 */
public class JavaProject2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("How many cards would you like too hold?");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        
        DeckClass firstDeck = new DeckClass();
        HandClass firstHand = new HandClass();
        firstHand.fill(firstDeck.deals() , size);
      
        System.out.println(firstHand);
        
        //System.out.println(a);
        
        int showAnotherHand; 

        do {
            System.out.println("Would you like to see another hand of cards\n Enter 0 for Yes or 1 for No ");

            while (!scanner.hasNextInt()) {
                System.out.println("That's not a number!\n Please enter an 'acceptable' value '0' for yes and '1' for no ");

                scanner.next();

            }// end while

            showAnotherHand = scanner.nextInt();

            if (showAnotherHand == 1) {
                break;
            }// end if

            System.out.println("How many cards would you like too hold?");
            size = scanner.nextInt();
            DeckClass deckObject = new DeckClass();
            HandClass newHandObject = new HandClass();
            newHandObject.fill(deckObject.deals(), size);

            System.out.println(newHandObject);

        } while (showAnotherHand <= 0); // end do while


    }// end main
    
}
		
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.println("enter size of array");
//		int size = scanner.nextInt();
//		
//		//array[array.length -1] = 10;
//		
//		
////		ArrayList<Integer> a = new ArrayList<>();
////		a.add(5);
////		a.add(6);
////		a.add(7);
////		a.add(8);
////		a.add(9);
//		//System.out.println(array1[1]);
//		int[] array = {1,2,3,4,5};
//		
//		
//		CardObject[] array1 = new CardObject[size];
//		String sample = "text";
//		for(int index = 0; index < array1.length; index++) {
//			CardObject card = new CardObject(index +2,sample);
//			array1[index] = card;
//	
//		}
//		
//		for(int index = 0; index < array1.length   ; index++) {
//			
//			
//			System.out.println(array1[index].getFace() + array1[index].getSuit() );
//		}
//		
//		System.out.println();
//		System.out.println();
//		for(int index = 3 ; index < array1.length -1   ; index++) {
//			
//			array1[index] = array1[index +1];
//			
//			
//		}
//		
//		size --;
//		
//		for(int index = 0; index < size   ; index++) {
//			
//			
//			System.out.println(array1[index].getFace() + array1[index].getSuit() );
//		}




//
//Scanner scanner = new Scanner(System.in);
// 
//         int showAnotherHand;
//		
//        do {
//                DeckClass newdeckObject = new DeckClass();
//
//                HandClass newhandObject = new HandClass();
//
//                newhandObject.fill(a.deals(),13);
//
//                System.out.println(newhandObject);
//                System.out.println(" Would you like to see another hand of cards\n Enter 0 for Yes or 1 for No ");
//               
//            while (!scanner.hasNextInt()) {
//                System.out.println("That's not a number!\n Please enter an 'acceptable' value '0' for yes and '1' for no ");
//
//                scanner.next(); 
//            }
//            showAnotherHand = scanner.nextInt();
//        } while (showAnotherHand <= 0);