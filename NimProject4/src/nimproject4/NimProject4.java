/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
Section number: Cop3337 U11
Student ID: 5852258
I affirm that this program is enterely my own work and none of it is the work of any
other person. ______Andrew Bedon___________________________________________
*/
package nimproject4;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Abedo016
 */
/*
   File: NimProject4.java (interactive input version)
   
    A NimProject4 Class Creates player Object's and Nim object in order to 
    to simulate the game of Nim, When each game ends the winner should be announced and 
    the user asked whether she wants to play another game.  
 */
/**
 * A NimProject4 class Containing Main Method.
 */
public class NimProject4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner scanner = new Scanner(System.in);

        PlayerInterface[] players = new PlayerInterface[2];

        int playAgain = 0;

        do {
            System.out.println("Enter name for Player one");
            String firstPlayername = scanner.next();

            System.out.println("Enter the type of Player for " + firstPlayername + " 1: human, 2: Below Average Computer, and 3: SmartComputer");
            
            
            int typeOfPlayer = 0;
            int typeInput = scanner.nextInt();

            if (typeInput == 1 || typeInput == 2 || typeInput == 3) {

                typeOfPlayer = typeInput;

            } else {
                while (typeInput != 1 || typeInput != 2 || typeInput != 3) {
                    System.out.println("Please Enter valid input! 1: human, 2: Below Average Computer, and 3: SmartComputer");
                    typeInput = scanner.nextInt();
                    if (typeInput == 1 || typeInput == 2 || typeInput == 3) {
                        typeOfPlayer = typeInput;
                        break;
                    }
                }
            }
           
            
            System.out.println("Enter 1 if you are going first. Enter 2 if you are going second");
            int orderOfPlayer = scanner.nextInt();

            if (typeOfPlayer == 1) {

                // HumanClass hc = new HumanClass(firstPlayername);
                if (orderOfPlayer == 1) {
                    players[0] = new HumanClass(firstPlayername);
                }
                if (orderOfPlayer == 2) {
                    players[1] = new HumanClass(firstPlayername);
                }

            } else if (typeOfPlayer == 2) {
                //BelowAverageComputerClass bacc = new BelowAverageComputerClass(firstPlayername);

                if (orderOfPlayer == 1) {
                    players[0] = new BelowAverageComputerClass(firstPlayername);
                }

                if (orderOfPlayer == 2) {
                    players[1] = new BelowAverageComputerClass(firstPlayername);
                }

            } else if (typeOfPlayer == 3) {
                // SmartComputerClass scc = new SmartComputerClass(firstPlayername);

                if (orderOfPlayer == 1) {
                    players[0] = new SmartComputerClass(firstPlayername);
                }

                if (orderOfPlayer == 2) {
                    players[1] = new SmartComputerClass(firstPlayername);
                }
            }

            // HumanClass hc = new HumanClass(1, firstPlayername );
//       for(int i = 0; i< players.length; i++){
//           System.out.println("i"+i);
//           System.out.println(players[i].playersName());
//       }
            // creating player 2
            System.out.println("\n\nEnter name for Player two");
            String secondPlayername = scanner.next();

            System.out.println("Enter the type of Player for " + secondPlayername + " 1: human, 2: Below Average Computer, and 3: SmartComputer");
            
            
            int typeOfPlayer2 = 0;
            int typeInput2 = scanner.nextInt();
         

            if (typeInput2 == 1 || typeInput2 == 2 || typeInput2 == 3) {

                typeOfPlayer2 = typeInput2;

            } else {
                
                while (typeInput2 != 1 || typeInput2 != 2 || typeInput2 != 3) {
                    System.out.println("Please Enter valid input! 1: human, 2: Below Average Computer, and 3: SmartComputer");
                    typeInput2 = scanner.nextInt();
                    if (typeInput2 == 1 || typeInput2 == 2 || typeInput2 == 3) {
                        typeOfPlayer2 = typeInput2;
                        break;
                    }
                }
            }

            System.out.println("Enter 1 if you are going first. Enter 2 if you are going second");
            int orderOfPlayer2 = scanner.nextInt();
            
            while(orderOfPlayer2 == orderOfPlayer ){
                System.out.println("Other player already selected " + orderOfPlayer);
                
                while(orderOfPlayer2 != 1 || orderOfPlayer2 !=2){
                    System.out.println("Please select 1 or 2" );
                    orderOfPlayer2 = scanner.nextInt();
                    if(orderOfPlayer2 != orderOfPlayer){
                        break;
                    }
                }
                
            }
            
            if (typeOfPlayer2 == 1) {

                //HumanClass hc = new HumanClass(firstPlayername);
                if (orderOfPlayer2 == 1) {
                    players[0] = new HumanClass(secondPlayername);
                }
                if (orderOfPlayer2 == 2) {
                    players[1] = new HumanClass(secondPlayername);
                }

            } else if (typeOfPlayer2 == 2) {
                // BelowAverageComputerClass bacc = new BelowAverageComputerClass(firstPlayername);

                if (orderOfPlayer2 == 1) {
                    players[0] = new BelowAverageComputerClass(secondPlayername);
                }

                if (orderOfPlayer2 == 2) {
                    players[1] = new BelowAverageComputerClass(secondPlayername);
                }

            } else if (typeOfPlayer2 == 3) {
                // SmartComputerClass scc = new SmartComputerClass(firstPlayername);

                if (orderOfPlayer2 == 1) {
                    players[0] = new SmartComputerClass(secondPlayername);
                }

                if (orderOfPlayer2 == 2) {
                    players[1] = new SmartComputerClass(secondPlayername);
                }
            }

            NimClass nimPlayer = new NimClass(players);
            System.out.println(" " + nimPlayer.play());

            System.out.println("\n\nWould you like to play again?");
            System.out.println("Enter 0 for no and 1 for yes");

            while (!scanner.hasNextInt()) {
                System.out.println("That's not a number!\n Please enter 0 for no and 1 for yes");
                scanner.next();
            }// end while
            playAgain = scanner.nextInt();

        } while (playAgain != 0);

        System.out.println("\nGame has Ended! Thank you for playing!");

    }// end main 

}// end NimProject

        
   