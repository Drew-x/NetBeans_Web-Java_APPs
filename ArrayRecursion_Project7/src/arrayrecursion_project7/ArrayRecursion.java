/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayrecursion_project7;

/**
/*  File: ArrayRecursion.java
 *
 *  Programmer: Andrew Bedon
 *
 */


import java.util.Random;
import javax.swing.JOptionPane;

/**
 * A class that performs some simple array operations recursively
 * @author Greg
 */
public class ArrayRecursion{
   // instance var's
   private int[] list ;       // array of ints
   private int size ;         // number of elements

   /**
    * Create an ArrayRecursion object. 
    * Creates an array with between 10 and 15 elements, and fills it with
    * random positive 2-digit ints
    */
   public ArrayRecursion(){
   
      Random r = new Random();
      size = r.nextInt(6) + 10;
      list = new int[size];

      for (int i = 0; i < size; i++){
      
         list[i] = r.nextInt(90) + 10;
      }
   }// end Array recusion 

   /**
    * Return the list as a string
    * @return a string containing all ints stored in list
    */
   public String toString()
   {
      String out = "";
      for (int i = 0; i < size; i++)
      {
         out += list[i] + "  ";
      }
      return out + "\n";
   }

   /**
    * Returns the index of the largest value in the array.
    * @return the index of the largest value in the array
    */
   public int getIndexOfLargest(){
   
      return recursiveGetIndexOfLargest(list, size);
   }

   // recursive "helper" method to return index of largest value
   // called by public method getIndexOfLargest()
    private int recursiveGetIndexOfLargest(int[] list, int count) {
        //System.out.println("the count"+ count);
        
        if (count == 1) {
            
            return list[count];
        }
       
      return Math.max(list[count-1], recursiveGetIndexOfLargest(list, count - 1));   // bogus value to enable program skeleton to run
    }

   /**
    * Sort the array in descending order using the selection sort
    */
   public void sort(){
   
      recursiveSort(list, size);
   }

   // recursive "helper" method to sort the array
   // called by public method sort()
    private void recursiveSort(int[] list, int count) {

       int temp = list[0];
       
       list[0] = getIndexOfLargest();
        
       if (temp == getIndexOfLargest()) {
            
            
       }
       
        if (count == 1) {
            
            
            return;
        }
        
        recursiveSort(list, count - 1);
    }
        
   
   /**
    * Indicates whether a given int is on the list
    * @param target the int to search for
    * @return true if target is on the list, false if not
    */
   public boolean contains (int target){
       
       
      return recursiveContains(list,size,target) ;
   }
   
   // recursive "helper" method to search the array
   // called by public method contains()
    private boolean recursiveContains(int[] list, int count, int target) {
        
        
        if (list[count -1] == target) {

            return true;
            
        } else if (count == 1 && list[0] != target) {
            
            return false;
            
        } else{
            
            return recursiveContains(list ,count -1 ,target);
        }
        

        
      //  return                  // bogus return value to enable program skeleton to run
    }  
   
   public static void main(String[] args){
   
      ArrayRecursion list = new ArrayRecursion();

      System.out.println("\nOriginal:  " + list);

      System.out.println("Largest value is at index: "
              + list.getIndexOfLargest());
      list.sort();
      System.out.println("\nSorted:    " + list);
     
      String target = JOptionPane.showInputDialog("Number to search for?") ;
      int searchee = Integer.parseInt(target) ;
      
      if (list.contains(searchee))
         System.out.println(searchee + " is on the list");
      else
         System.out.println(searchee + " is not on the list");
   }
}

//  if (count <= 1) {
//            return;
//        } else {
//             recursiveSort(list, count - 1);
//            //find x such that a[x] is the smallest of a[k] ... a[a.length - 1]
//            if (list[count] > list[count - 1]) {
//                // swap a[k-1] and a[x]
//                
//                int temp = list[count];
//                
//                list[count ] = list[0];
//                list[0] = temp;
//            }
//
//        }