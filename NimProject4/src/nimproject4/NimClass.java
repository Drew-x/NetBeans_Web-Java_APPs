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
 * Computes the move method of each PlayerInterface, depend only on the Player
 * interface and Pile class
 */
public class NimClass {

    //HumanClass humanClass, SmartComputerClass smartComputerClass,BelowAverageComputerClass bacc
    PlayerInterface playerInterface = null;
    PlayerInterface playerInterface2 = null;
    
    int startingMarbles = 0;
    int newpile = 0;
    
    PileClass createMarbles = new PileClass();
    String name = " ";
  
    /**
     * Constructs a NimClass and creates a Pile object.
     *
     * @param playerInterface Array of playerInterface.
     *
     */
    public NimClass(PlayerInterface[] playerInterface) {

        this.playerInterface = playerInterface[0];
        this.playerInterface2 = playerInterface[1];

        this.startingMarbles = createMarbles.createPileOfMarbles();
        //System.out.println("int value of startingMarbles = " + startingMarbles); Check
        createMarbles.setNumberOfMarbles(startingMarbles);

        // System.out.println(" in Nim _inside Constrcutor = " + PileClass.numberOfMarbles); Check
    }

    /**
     * A method to call all the methods for each player polymorphically and
     * returns the winner’s name when the game ends
     *
     * @return String returns the winners name
     */
    public String play() {

        while (PileClass.getNumberOfMarbles() > 1) {

            // System.out.println("inNimMarbles " + PileClass.numberOfMarbles ); CHECKED
//            System.out.println("first play "+playerInterface.playersName());
//            System.out.println("second player "+playerInterface2.playersName());
            System.out.println("Player: " + playerInterface.playersName());
            newpile = playerInterface.move(PileClass.getNumberOfMarbles());
            createMarbles.setNumberOfMarbles(PileClass.getNumberOfMarbles() - newpile);
            System.out.println();
            System.out.println(playerInterface.playersName() + ": Has taken " + newpile + " of Marbles\n");

            if (newpile == 1 && PileClass.getNumberOfMarbles() == 1) {
                name = playerInterface.playersName();
               
                break;

            }// end if
            
            System.out.println("Player2: " + playerInterface2.playersName());
            newpile = playerInterface2.move(PileClass.getNumberOfMarbles());
            createMarbles.setNumberOfMarbles(PileClass.getNumberOfMarbles() - newpile);
            System.out.println();
            System.out.println(playerInterface2.playersName() + ": Has taken " + newpile + " of Marbles");
            System.out.println();

            if (newpile == 1 && PileClass.getNumberOfMarbles() == 1) {
                name = playerInterface2.playersName();
               
                break;
            }// end if
            
        }// end while

        // System.out.println(" "+ startingMarbles); 
        return"Game over Player " + name + " has Won the Game ! ";//"the play method " + newpile return user input
    }// end play
    
}// end NimClass
