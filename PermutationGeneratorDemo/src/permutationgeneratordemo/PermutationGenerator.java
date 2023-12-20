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
   This class generates permutations of a word.
*/
public class PermutationGenerator
{
   private String word ;

   /**
      Constructs a permutation generator.
      @param aWord the word to permute
   */
   public PermutationGenerator(String aWord)
   {
      word = aWord ;
   }

   /**
      Gets all permutations of a given word
      @return a list of all the permutations
   */
   public ArrayList<String> getPermutations()
   {
      ArrayList<String> permutations = new ArrayList<String>() ;

      // Trivial case: the empty string has only one permutation - itself
      if (word.length() == 0) 
      { 
         permutations.add(word) ; 
         return permutations ; 
      }

      // Loop through all character positions
      for (int i = 0; i < word.length(); i++)
      {
         // Form a simpler word by removing the ith character
         String shorterWord = word.substring(0, i)
               + word.substring(i + 1) ;

         // Generate all permutations of the simpler word
         PermutationGenerator shorterPermutationGenerator 
               = new PermutationGenerator(shorterWord) ;
         ArrayList<String> shorterWordPermutations 
               = shorterPermutationGenerator.getPermutations() ;

         // Add the removed character to the front of
         // each permutation of the simpler word, 
         for (String s : shorterWordPermutations)
         {
            permutations.add(word.charAt(i) + s) ;
         }
      }
      return permutations ;    // return list of all permutations
   }
}