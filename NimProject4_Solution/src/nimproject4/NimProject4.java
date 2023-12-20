/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
            
            int typeOfPlayer = scanner.nextInt();
            
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
            int typeOfPlayer2 = scanner.nextInt();

            System.out.println("Enter 1 if you are going first. Enter 2 if you are going second");
            int orderOfPlayer2 = scanner.nextInt();

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

            System.out.println("Would you like to play again?");
            System.out.println("Enter 0 for no and 1 for yes");

            while (!scanner.hasNextInt()) {
                System.out.println("That's not a number!\n Please enter 0 for no and 1 for yes");
                scanner.next();
            }// end while
            playAgain = scanner.nextInt();

        } while (playAgain != 0);

        System.out.println("Game has Ended! Thank you for playing!");

    }// end main 

}// end NimProject

        // player two
//       for(int i = 0; i < players.length; i++){
//           
//           System.out.println(players[i].playersName());
//       }
        // System.out.println("Enter name for player two- not valid" );
        //String secondPlayername = scanner.next();
        //HumanClass hc2 = new HumanClass(2, scanner.next() );
        // BelowAverageComputerClass bacc = new BelowAverageComputerClass(2,scanner.next() );
        //SmartComputerClass scc = new SmartComputerClass(2, secondPlayername);
//        System.out.println("The The Name of Player 1 = " + hc.playersName());
//        System.out.println("The of Player2 is = " + hc2.playersName());
        //   NimClass nimPlayer = new NimClass(scc, hc);
        // System.out.println("The starting marbles are = main_ "+ nimPlayer.startingMarbles); CHECk
        //   nimPlayer.play();
        /*       
        System.out.println("Select the type of player for player one");
        
        System.out.println("1: human, 2: Below Average Computer, and 3: SmartComputer");
        
        int typeOfPlayer = scanner.nextInt();
         
        System.out.println("Enter the name of the player one ");
        
        String nameOfPlayer = scanner.next();
           
        HumanClass humanClass = null;
        BelowAverageComputerClass bacc = null;
        SmartComputerClass smartComputerClass = null;
        
        if (typeOfPlayer == 1){
            
             humanClass = new HumanClass(typeOfPlayer, nameOfPlayer);
        } else if (typeOfPlayer == 2){
            
            bacc = new BelowAverageComputerClass(typeOfPlayer, nameOfPlayer);
            
        }else if (typeOfPlayer == 3){
            
            smartComputerClass = new SmartComputerClass(typeOfPlayer, nameOfPlayer);
            
        }
        
        // player two
        System.out.println("Player two information");
        
        System.out.println("Select the type of player for player one");
        
        System.out.println("1: human, 2: Below Average Computer, and 3: SmartComputer");
        
        typeOfPlayer = scanner.nextInt();
         
        System.out.println("Enter the name of the player one ");
        
        nameOfPlayer = scanner.next();
        
        HumanClass humanClass2 = null;
        BelowAverageComputerClass bacc2 = null;
        SmartComputerClass smartComputerClass2 = null;
        
        if (typeOfPlayer == 1){
            
             humanClass2 = new HumanClass(typeOfPlayer, nameOfPlayer);
        } else if (typeOfPlayer == 2){
            
            bacc2 = new BelowAverageComputerClass(typeOfPlayer, nameOfPlayer);
            
        }else if (typeOfPlayer == 3){
            
            smartComputerClass2 = new SmartComputerClass(typeOfPlayer, nameOfPlayer);
            
        }
        
       // System.out.println("the players name is " );
        
        //System.out.println("type of player is " + smartComputerClass.playersName());
        
        System.out.println("The size of the Marble pile is set too: " + PileClass.numberOfMarbles);
        
        NimClass nimClass = new NimClass(humanClass);
        
        //NimClass nimClass2 = new NimClass(humanClass2);
        
        System.out.println(" in main - "+ nimClass.play());
        
        
       

        
    
        
    
    pile.createPileOfMarbles();
    int amountTaken = humanClass.move(5);
    
    if (amountTaken == -1){
        
        System.out.println(" you cheated ");
    }else{
        
        pile.setNumberOfMarbles(amountTaken);
    }
    
    
    System.out.println(PileClass.numberOfMarbles);
    
         */
        // int subtracted = pileClass.numberOfMarbles - 20;
        // PASSSED
//    System.out.println(pileClass.numberOfMarbles);
//    pileClass.setNumberOfMarbles(20);
//    System.out.println(pileClass.numberOfMarbles);
//        do {
//            
//            
//            while (!scanner.hasNextInt()) {
//
//                System.out.println("Please Enter Correct value \n 1: human, 2: Below Average Computer, and 3: SmartComputer ");
//                scanner.next();
//
//            }
//
//            while (scanner.nextInt() != 1 || scanner.nextInt() != 2 || scanner.nextInt() != 3) {
//
//                System.out.println(" Please enter correct Range \n 1: human, 2: Below Average Computer, and 3: SmartComputer");
//                scanner.next();
//                
//            }
//            
//            if(scanner.nextInt() == 1 || scanner.nextInt() == 2 || scanner.nextInt() == 3 ){
//                checker = true;
//            }
//            
//            
//        } while (checker);
//        HumanClass humanClass = new HumanClass(1, firstPlayeName);
//        BelowAverageComputerClass belowAverageComputerClass = new BelowAverageComputerClass(2, secondPlayeName);
//        
//        System.out.println(" " + humanClass.playersName() + " " );


//Scanner scanner = new Scanner(System.in);
//
//        int showAnotherHand;
//
//        do {
//            System.out.println("Please enter a odd value for the size of the magic square ");
//
//            // scanner.next();
//            while (!scanner.hasNextInt()) {
//
//                System.out.println("That's not a number!\n Please enter an 'acceptable' value ");
//                scanner.next();
//
//            }// end while
//
//            int size = scanner.nextInt();
//
//            while (size % 2 == 0) {
//                System.out.println("Please enter a odd value");
//                size = scanner.nextInt();
//            }// end if
//             System.out.println();
//            MagicSquareClass magicSquare = new MagicSquareClass(size);
//
//            boolean magicChecker = magicSquare.isMagic();
//            if (magicChecker == true) {
//                System.out.print(magicSquare.toString());
//                
//                System.out.println("\nThe Square is Magic!");
//
//            } else {
//
//                System.out.println("This was not a magic square");
//
//            }
//            
//            System.out.println();
//            System.out.println("Would you like to create another magic square? \n Enter 0 for yes and 1 for no");
//
//            while (!scanner.hasNextInt()) {
//
//                System.out.println("That's not a number!\n Please enter an 'acceptable' value ");
//                scanner.next();
//
//            }// end while
//
//            showAnotherHand = scanner.nextInt();
//
//        } while (showAnotherHand <= 0); // end do while