/*
Section number: Cop3337 U11
Student ID: 5852258
I affirm that this program is enterely my own work and none of it is the work of any
other person. ______Andrew Bedon___________________________________________
 */
package linkedlist_project6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;


/*
   File: Point3D_Project5.java (HardCoded input version)
   
    A Point3D_Project5 Class Creates one object of each concrete class. Then using the data given below - and store them in an array of Shapes.
    1)Using a loop it traverse the array and prints the actual class of the shape (Sphere, Cone, etc), all the input data, and the surface area/
    2) Sort the array in descending order by volume. Using the sort method of the Arrays class.
    3) Using a loop, prints ONLY the class name and volume for each object in the sorted array
    4)Sorts the array again, but this time in ascending order by the distance from the origin.  
      via a call to a sort method of the Arrays class- create a inner class that implements java’s Comparator interface
    5)Using a loop, print ONLY the class name and distance from the origin for each object in the sorted array.

 */
/**
 * A Point3D_Project5 class Containing Main Method.
 */
public class LinkedListTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        LinkedList<Node<Integer>> linkedList = new LinkedList<>();

        File file = new File("list-ops.txt");
        Scanner scanner = null;

        try {
            scanner = new Scanner(file);
            String tempString = "";

            while (scanner.hasNextLine()) {

                tempString = scanner.next();
                System.out.println(tempString);

                if (tempString.contentEquals("APPEND")) {

                    tempString = scanner.next();

                    try {

                        int num = Integer.parseInt(tempString.trim());
                        linkedList.append(new Node<Integer>(num));
                        //System.out.println("NUMBRR PARSED = " + num);
                        System.out.println("append number: " + num);
                        System.out.println(linkedList);
                        System.out.println();

                    } catch (Exception e) {
                        System.out.println(e);
                    }

                }//end append if

                if (tempString.contentEquals("ADD")) {

                   
                    //System.out.println("what is inside string " + tempString);

                    try {

                        tempString = scanner.next();
                        int num = Integer.parseInt(tempString.trim());
                        tempString = scanner.next();
                        int num2 = Integer.parseInt(tempString.trim());

                        System.out.println("add at: " + num + "( " + num2 + ")");
                        linkedList.add(num, new Node<Integer>(num2));
                        System.out.println(linkedList);

                        System.out.println();

                    } catch (Exception e) {
                        System.out.println(e);

                    }

                }// end add if

                if (tempString.contentEquals("DELETE")) {
                   

                    try {
                        tempString = scanner.next();
                        int num = Integer.parseInt(tempString.trim());
                        System.out.println("delete at: " + num);
                        linkedList.delete(num);

                        System.out.println(linkedList);

                        System.out.println();
                    } catch (Exception e) {
                        System.out.println(e);
                    }// end try catch

                }// end delete if

                if (tempString.contentEquals("SWAP")) {
                    System.out.println("sawp catched");

                    try {

                        tempString = scanner.next();
                        int num = Integer.parseInt(tempString.trim());
                        tempString = scanner.next();
                        int num2 = Integer.parseInt(tempString.trim());

                        System.out.println("sawp " + num + " with " + num2);
                        linkedList.swap(num, num2);
                        System.out.println(linkedList);

                        System.out.println();

                        //  }// end while/ try
                    } catch (Exception e) {

                        System.out.println(e);
                    }
                }// end swap if

                if (tempString.contentEquals("CLEAR")) {

                    System.out.println(" Link list cleared");
                    linkedList.clear();
                    System.out.println(linkedList);

                }// end clear if

                if (tempString.contentEquals("REVERSE")) {
                    System.out.println("reverse catched");
                    try {
                        linkedList.reverse();
                    } catch (Exception e) {
                        System.out.println(" Linked was empty ");
                    }
                    

                    System.out.println(linkedList);
                    System.out.println();

                }// end reverse if

            }// end while loop

        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println(fileNotFoundException);

        } finally {

            scanner.close();

        }// end finally / catch

    }// end main 

}// end linkedListTester
