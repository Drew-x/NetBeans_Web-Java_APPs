/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist_tester;

/**
 *
 * @author I-KingDrew-I
 */
public class LinkedList_Tester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      LinkedList<Node<Integer>> linkedList = new LinkedList<>();
      
        Node<Integer> head = new Node<Integer>(7);
        
        Node<Integer> node2 = new Node<Integer>(5);
        
        Node<Integer> node3 = new Node<Integer>(3);
        
        Node<Integer> node4 = new Node<Integer>(1);
        
        Node<Integer> node5 = new Node<Integer>(10);
        
        Node<Integer> node6 = new Node<Integer>(15);
        
        linkedList.append(head);
        linkedList.append(node2);
        linkedList.append(node3);
        linkedList.append(node4);
        linkedList.append(node5);
        linkedList.append(node6);
        
        System.out.println(linkedList);
        
        //linkedList.clear();
        
        //System.out.println("clear"+linkedList);
        
        Node<Integer> node7 = new Node<Integer>(25);
        Node<Integer> node8 = new Node<Integer>(100);
        linkedList.add(2, node7);
        linkedList.add(4, node8);
        System.out.println(linkedList);
        
        
//        linkedList.delete(4);
//        linkedList.delete(2);
//        System.out.println(linkedList);
        
         System.out.println("swapping");
         
         
         linkedList.swap(2, 5);
         System.out.println(linkedList);
         
         linkedList.swap(1, 6);  
         System.out.println(linkedList);
         
         linkedList.delete(1);
         System.out.println(linkedList);
         
        // System.out.println("the last in "+ linkedList.lastIndex );
         linkedList.reverse();
         
         System.out.println("the list is =" +linkedList);
         
    }
    
}



/********

/ 
/ 
///
//To change this license header, choose License Headers in Project Properties.
//  To change this template file, choose Tools | Templates
//  and open the template in the editor.
// 
package linkedlist_project6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;



/**
 *
 * @author I-KingDrew-I
 
public class LinkedListTester {

    
     * @param args the command line arguments
    
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

                    System.out.println("add catched");
                    //System.out.println("what is inside string " + tempString);

                    try {
                      
                        
                        //while (scanner.hasNextInt()) {
                            tempString = scanner.next();
                            int num = Integer.parseInt(tempString.trim());
                            tempString = scanner.next();
                            int num2 = Integer.parseInt(tempString.trim());

                            System.out.println("add at: "+ num + "( "+num2+")");
                            linkedList.add(num, new Node<Integer>(num2));
                            System.out.println(linkedList);
                            
                           // System.out.println("NUMBRR PARSED = " + num);
                            System.out.println();

                       // }// end while catch

                    } catch (Exception e) {
                        System.out.println(e);

                    }

                }// end add if

                if (tempString.contentEquals("DELETE")) {
                    System.out.println("delete catched");

                    

                    try {
                        tempString = scanner.next();
                        int num = Integer.parseInt(tempString.trim());
                        System.out.println("delete at: "+ num);
                        linkedList.delete(num);
                        //System.out.println("NUMBRR PARSED = " + num);
                        System.out.println(linkedList);
                        
                        System.out.println();
                    } catch (Exception e) {
                        System.out.println(e);
                    }

                }// end delete if

                if (tempString.contentEquals("SWAP")) {
                    System.out.println("sawp catched");

                    try {
                        //while (scanner.hasNextInt()) {
                            tempString = scanner.next();
                            int num = Integer.parseInt(tempString.trim());
                            tempString = scanner.next();
                            int num2 = Integer.parseInt(tempString.trim());
                            
                             System.out.println("sawp " + num + " with "+ num2);
                            linkedList.swap(num, num2);
                            System.out.println(linkedList);
                           // System.out.println("NUMBRR PARSED = " + num);
                            System.out.println();

                      //  }// end while/ try
                    } catch (Exception e) {

                        System.out.println(e);
                    }
                }// end swap if

                if (tempString.contentEquals("CLEAR")) {
                   // System.out.println("clear catched");
                    System.out.println(" Link list cleared");
                    linkedList.clear();
                    System.out.println(linkedList);
                    //  tempString = scanner.next();

                }// end clear if

                if (tempString.contentEquals("REVERSE")) {
                    System.out.println("reverse catched");
                    linkedList.reverse();
                    //System.out.println("last index"+linkedList.lastIndex);
                    System.out.println(linkedList);
                    System.out.println();
//                     tempString = scanner.next();
                }// end reverse if

            }// end while loop
            
        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println(fileNotFoundException);

        } finally {

            scanner.close();
            // scanner.close();
        }// end finally / catch


       
    }// end main 
    
}// end linkedListTester

//
//FileInputStream file = new FileInputStream("list-ops.txt");
//        Scanner scanner = null;
//        DataInputStream dataInputStream = new DataInputStream(file);
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(dataInputStream));
//        
//        String text = "";
//        try {
//            scanner = new Scanner(file);
//           
//            while((bufferedReader.readLine()) != null) {
//                
//                System.out.println(bufferedReader.readLine());;
////                System.out.println(scanner.next());
////                
////                if(scanner.nextLine() == "APPEND"){
////                    
////                    System.out.println("append catched");
////                }
////                
////                if (scanner.nextLine() == "ADD") {
////                     System.out.println("add catched");
////                }
////                
////                if (scanner.nextLine()== "SWAP") {
////                     System.out.println("sawp catched");
////                }
////                if (scanner.nextLine() == "CLEAR") {
////                     System.out.println("clear catched");
////                }
////                
////                if (scanner.nextLine() == "REVERSE") {
////                     System.out.println("reverse catched");
////                }
////                
////                if(scanner.hasNext(pattern))
////                    
////                    System.out.println("number");
////                }
//               
//                
//            }
//        } catch (FileNotFoundException fileNotFoundException) {
//            System.out.println(fileNotFoundException);
//
//        } finally {
//
//            scanner.close();
//            // scanner.close();
//        }



*/