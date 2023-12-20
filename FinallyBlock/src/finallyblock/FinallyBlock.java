/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finallyblock;

/**
 *
 * @author I-KingDrew-I
 */



// File: Finally.java

// Shows that a finally clause is always executed.

class BogusException extends Exception {}

public class FinallyBlock 
{
  public static void main(String[] args) 
  {
  		System.out.println("Entering outer try block") ;
    	try 
    	{
      		System.out.println("Entering inner try block") ;
      		try 
      		{
        			System.out.println("Throwing exception in inner try block") ;
        			throw new BogusException() ;
      		} 
      		finally 
      		{
        			System.out.println("finally in inner try block") ;
      		}
    	} 
    	catch(BogusException e) 
    	{
      		System.out.println("Caught BogusException in outer try block") ;
    	} 
    	finally 
    	{
      		System.out.println("finally in outer try block") ;
    	}
  }
}

/*  program output:

Entering outer try block
Entering inner try block
Throwing exception in inner try block
finally in inner try block
Caught BogusException in outer try block
finally in outer try block

*/
