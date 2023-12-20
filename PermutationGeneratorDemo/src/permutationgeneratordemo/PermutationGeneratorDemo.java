/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package permutationgeneratordemo;

/**
 *
 * @author I-KingDrew-I
 */



import java.util.ArrayList;

/**
   This program demonstrates the permutation generator.
*/
public class PermutationGeneratorDemo
{
   public static void main(String[] args)
   {
      PermutationGenerator generator = new PermutationGenerator("sruods");
      ArrayList<String> permutations = generator.getPermutations();
      
      for (String s : permutations){
               
         System.out.println(s);
      }
      
   }
}

/* output

eat
eta
aet
ate
tea
tae

*/