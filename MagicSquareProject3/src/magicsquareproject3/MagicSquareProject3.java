/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magicsquareproject3;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author abedo016
 */
public class MagicSquareProject3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

       Scanner scanner = new Scanner(System.in);

        int showAnotherHand;

        do {
            System.out.println("Please enter a odd value for the size of the magic square ");

            // scanner.next();
            while (!scanner.hasNextInt()) {

                System.out.println("That's not a number!\n Please enter an 'acceptable' value ");
                scanner.next();

            }// end while

            int size = scanner.nextInt();

            while (size % 2 == 0) {
                System.out.println("Please enter a odd value");
                size = scanner.nextInt();
            }// end if
             System.out.println();
            MagicSquareClass magicSquare = new MagicSquareClass(size);

            boolean magicChecker = magicSquare.isMagic();
            if (magicChecker == true) {
                System.out.print(magicSquare.toString());
                
                System.out.println("\nThe Square is Magic!");

            } else {

                System.out.println("This was not a magic square");

            }
            
            System.out.println();
            System.out.println("Would you like to create another magic square? \n Enter 0 for yes and 1 for no");

            while (!scanner.hasNextInt()) {

                System.out.println("That's not a number!\n Please enter an 'acceptable' value ");
                scanner.next();

            }// end while

            showAnotherHand = scanner.nextInt();

        } while (showAnotherHand <= 0); // end do while

       
      
    }
    
}
