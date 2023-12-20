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
import java.util.Scanner ;

/**
 *
 * @author Abedo016
 */

/*
   File: TestClass.java (interactive input version)
   
   A testClass Creates a DeckClass Object and HandClass oBject in order to 
   create 52 card objects to shuffle and then call fill to give the user 
    13 randomly selected cards.
*/
/**
   A test class Containing Main Method. 
*/
public class TestClass {
   
    public static void main( String[] args) {

         Scanner scanner = new Scanner(System.in);
         
       
         int showAnotherHand;
		
        do {
                DeckClass newdeckObject = new DeckClass();

                HandClass newhandObject = new HandClass();

                newhandObject.fill(newdeckObject.deals());

                System.out.println(newhandObject);
                System.out.println(" Would you like to see another hand of cards\n Enter 0 for Yes or 1 for No ");
               
            while (!scanner.hasNextInt()) {
                System.out.println("That's not a number!\n Please enter an 'acceptable' value '0' for yes and '1' for no ");

                scanner.next(); 
            }
            showAnotherHand = scanner.nextInt();
        } while (showAnotherHand <= 0);

    }// end main
}


//SAMPLE OUTPUT

/*
run:
[9♣, Q♦, 10♦, 7♦, 4♦, K♠, 10♠, 9♠, 8♠, 7♠, 6♠, 4♠, 4♥]
 Would you like to see another hand of cards
 Enter 0 for Yes or 1 for No 
0
[Q♣, J♣, 8♣, J♦, 5♦, 3♦, A♠, J♠, 10♠, 5♠, Q♥, J♥, 8♥]
 Would you like to see another hand of cards
 Enter 0 for Yes or 1 for No 
d
That's not a number!
 Please enter an 'acceptable' value '0' for yes and '1' for no 
0
[J♣, 9♣, 8♣, 6♣, 3♣, 10♦, 6♦, Q♠, 7♠, 3♠, Q♥, 7♥, 6♥]
 Would you like to see another hand of cards
 Enter 0 for Yes or 1 for No 
1
BUILD SUCCESSFUL (total time: 9 seconds)
*/