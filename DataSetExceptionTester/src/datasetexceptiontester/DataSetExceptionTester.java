/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datasetexceptiontester;

/**
 *
 * @author I-KingDrew-I
 */



import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class DataSetExceptionTester{

   public static void main(String[] args){
   
      Scanner in = new Scanner(System.in);
      DataSetReader reader = new DataSetReader();
      
      boolean done = false;
      while (!done) 
      {
         System.out.print("\nPlease enter the file name: ") ;
         String filename = in.next();
         try 
         {
            // call readFile to open and process file
            double[] data = reader.readFile(filename) ;
            // here only if no exceptions in readFile or methods called by it
            double sum = 0 ;
            for (double d : data) 
              sum = sum + d ; 
            System.out.println("The sum is " + sum);
            done = true ;     // to exit loop
         }
         // catching superclass of FileNotFoundException
         catch (IOException exception)
         {
            System.out.println(exception.toString()) ;
         }
         catch (BadDataException exception)
         {
            System.out.println(exception.toString()) ;
         }
      }
   }
}

/*

Sample output:

Please enter the file name: bad1.dat
BadDataException: Unexpected end-of-file

Please enter the file name: bad2.dat
BadDataException: First record must be a valid int. Found: ten

Please enter the file name: bad3.dat
BadDataException: Need valid double! Found: one (in record #2)

Please enter the file name: bad4.dat
BadDataException: End of file expected

Please enter the file name: good1.dat
java.io.FileNotFoundException: good1.dat (The system cannot find the file specified)

Please enter the file name: good.dat
The sum is 55.0

*/
