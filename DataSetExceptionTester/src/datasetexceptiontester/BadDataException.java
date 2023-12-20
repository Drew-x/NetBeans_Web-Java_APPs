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



/**
   This class reports bad input data.
*/
public class BadDataException extends Exception
{
   public BadDataException() {}
   public BadDataException(String message)
   {
      super(message);
   }
}