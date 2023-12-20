/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionsexample;

/**
 *
 * @author I-KingDrew-I
 */



// File:  ExceptionsExample.java

// Creates two new exception classes and throws one exception of each.  Shows 
// how, when an exception is thrown, the stack of method calls is "unwound" as
// Java looks for a calling method with a handler for the particular class of 
// exception.

// Also calls toString() implicitly for the exception parameters passed to 
// the catch blocks

class Exception1 extends RuntimeException {}
class Exception2 extends RuntimeException {}

public class ExceptionsExample 
{
	static void method1() 
	{
		try 
		{
			method2() ;
		} 
		catch(Exception1 e) 
		{
			System.out.println( e + " caught in method1") ;
		}
	} // end method1
	
	static void method2() 
	{
		method3() ;
		System.out.println("Back from method3") ;	// not executed
	} // end method2
	
	static void method3() throws Exception1 
	{
		throw new Exception1() ;
	} // end method3
	
	static void method4() throws Exception2 
	{
		throw new Exception2() ;
	} // end method5	
	
	public static void main(String[] args) 
	{
		try 
		{
			method1() ;
			System.out.println("Back from method1") ;
			try 
			{
				method4() ;
				System.out.println("Back from method4") ;		// not executed
			} 
			catch(Exception2 e) 
			{
				System.out.println( e + " caught in main.") ;
			}
			method3();
			System.out.println("Back from method4") ;			// not executed
		} 
		catch(Exception e) 
		{
			System.out.println( e + " caught in main.") ;
		}
	} 
}

/*
Exception1 caught in method1
Back from method1
Exception2 caught in main.
Exception1 caught in main.
*/		