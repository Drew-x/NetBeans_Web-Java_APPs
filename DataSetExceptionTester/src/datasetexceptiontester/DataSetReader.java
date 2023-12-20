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



import java.io.File ;
import java.io.IOException;
import java.util.Scanner;

/**
   Reads a data set from a file. The first line of the file must contain an 
   int, which is the number of additional lines in the file.  Each additional 
   line must contain a double value.
*/
public class DataSetReader
{
   private double[] data ;		// array instance variable
    
    /**
      Reads a data set.
      @param filename the name of the file holding the data
      @return the data in the file
   */
   public double[] readFile(String filename) 
         throws IOException, BadDataException
   {
      Scanner in = null ;
      try 
      {
         in = new Scanner(new File(filename)) ;
         readData(in);
      }
      finally
      {
         if (in != null)	// if file was opened...
           in.close();		// ...close it
      }
      return data;
   }

   /**
      Reads all data.
      @param in the scanner that scans the data
   */
   private void readData(Scanner in) throws BadDataException
   {
      if (!in.hasNextInt()) // first record does not contain an int
         throw new BadDataException("First record must be a valid int."
                 + " Found: " + in.next());
            
      int numberOfValues = in.nextInt() ;    // get number of values in file
      data = new double[numberOfValues] ;    // create array with that number
                                             // of elements

      // for each value in the file, call readValue to extract it and store it
      // in th array
      for (int i = 0; i < numberOfValues; i++)
         readValue(in, i);    

      // is there anything left in the file after extracting the specified
      // number of values?
      if (in.hasNext()) 
         throw new BadDataException("End of file expected");
   }

   /**
      Reads next data value into the array
      @param in the scanner that reads the file
      @param i array index where next value will be stored
   */
   private void readValue(Scanner in, int i) throws BadDataException
   {
      if (!in.hasNext())  // reached eof
         throw new BadDataException("Unexpected end-of-file") ;
      if (!in.hasNextDouble())  // next token not a valid double
         throw new BadDataException("Need valid double! Found: " +
                                     in.next() + " (in record #" + (i+2) +")");
      
      // extract next double and store at specified index
      data[i] = in.nextDouble();      
   }   
}
