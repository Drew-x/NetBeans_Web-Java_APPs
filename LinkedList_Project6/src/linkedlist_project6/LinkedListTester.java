/*
Section number: Cop3337 U11
Student ID: 5852258
I affirm that this program is enterely my own work and none of it is the work of any
other person. ______Andrew Bedon___________________________________________
 */
package linkedlist_project6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
   File: LinkedList_Project6.java (List-ops.txt HardCoded input version)
    A LinkedList_Project6 creates one object of each LinkedList class. Then reading the data given by list-ops.txt  creates approprate node objects 
       and store them in an Linked list.
    1) Using a APPEND method node objects are added to the end of the list 
    2) Using ADD method a node is insert object X as the new Nth element in the list, increasing the size of the list by 1
    3) Using DELETE method removes the Nth object from the list
    4) Using SWAP method Interchange the positions of the Mth and Nth  node objects on the Linked list
    5) Using REVERSE method reverse the order of the objects on the list
    6) Using CLEAR method Clears the list
 */
/**
 * A LinkedList_Project6 class Containing Main Method.
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

                    System.out.println("Link list cleared");
                    linkedList.clear();
                    System.out.println(linkedList);

                }// end clear if

                if (tempString.contentEquals("REVERSE")) {
                    try {
                        linkedList.reverse();
                    } catch (Exception e) {
                        System.out.println("Linked List is Empty");
                    }// end try 
                    

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
