/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bogusexceptiondemo;

/**
 *
 * @author I-KingDrew-I
 */



// BogusExceptionDemo.java

// Creates a new exception subclasss called DemoException,
// derived from superclass Exception.  Shows an exception specification 
// (aka: "throw list"), try block, throw statement, and catch block ("handler").
// In the catch block, 
// When the exception is caught, method printStackTrace() is called for 
// the DemoException object parameter bogus, and then the program continues.
// Note that there is no DemoException constructor.  Since no argument is 
// supplied when a DemoException object is created, Java will synthesize a
// default constructor.
class DemoException extends Exception
{
}

public class BogusExceptionDemo
{

    public static void method1() throws DemoException
    {
        System.out.println("Throwing DemoException in method1()");
        throw new DemoException();
    }

    public static void main(String[] args)
    {
        try
        {
            method1();  // exception will be thrown in method1()
            System.out.println("Hello from try block");	// not executed
        } 
        catch (DemoException bogus)
        {
            System.err.println("Caught it!");
            bogus.printStackTrace();
        }
        System.out.println("\nProgram continues...");
    }
}

/*  program output:

Caught it!
Throwing DemoException in method1()

DemoException
Program continues...
	at BogusExceptionDemo.method1(BogusExceptionDemo.java:22)
	at BogusExceptionDemo.main(BogusExceptionDemo.java:29)

*/
