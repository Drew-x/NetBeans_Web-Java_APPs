/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces_Polymorphism;

/**
 *
 * @author I-KingDrew-I
 */
/**
   Computes the average of a set of data values.
*/
public class DataSet
{
   private double sum  ;
   private Measurable maximum ;
   private int count ;

   /**
      Constructs an empty data set.
   */
   public DataSet(){
      sum = 0;
      count = 0;
      maximum = null;
   }// end constructor

   /**
      Adds a data value to the data set
      @param x a data value
   */
   public void add(Measurable x)
   {
      sum = sum + x.getMeasure();
      
      if (count == 0 || maximum.getMeasure() < x.getMeasure())
         maximum = x;
      count++;
   }

   /**
      Gets the average of the added data.
      @return the average or 0 if no data has been added
   */
   public double getAverage()
   {
      if (count == 0) return 0;
      else return sum / count;
   }

   /**
      Gets the largest of the added data.
      @return a pointer to the object with the maximum measure,
      or null if the DataSet is empty
   */
   public Measurable getMaximum()
   {
      return maximum;
   }
}