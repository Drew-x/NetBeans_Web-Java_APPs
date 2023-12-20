/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrixexamplecode;

/**
 *
 * @author abedo016
 */
public class MatrixExampleCode {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

       
        int[][] table = {{15, 25, 34, 45}, // 1st row (table[0])
        {55, 67, 75, 48}, // 2nd row (table[1])
        {96, 10, 11, 12}};  // 3rd row (table[2])

        int[][] table2 = new int[3][4];

        int[][] table3 = new int[3][4]; // empty matrix
        
        
        
        //TABLE 1 prints the rows
        // Table 2 prints the colums
        
        
        // Chaning values on table 1
        for (int row = 0; row < table.length; row++) {

            for (int col = 0; col < table[row].length; col++) {

                // System.out.print(" " + table[row][col]);
                table[row][col] = row;
            }

        }

        // adding values on table2
        for (int row = 0; row < table2.length; row++) {

            for (int col = 0; col < table2[0].length; col++) {

                // System.out.print(" " + table[row][col]);
                table2[row][col] = col;
            }

        }

        //printing table 1
        System.out.println("printing table1 with calues of row ");
        for (int row = 0; row < table.length; row++) {

            for (int col = 0; col < table[row].length; col++) {

                System.out.print(" " + table[row][col]);
                // table[row][col] = col;
            }
            System.out.println();
        }
        System.out.println();
        
        
        System.out.println("printing table2 with calues of col ");

        // printing table2
        for (int row = 0; row < table2.length; row++) {

            for (int col = 0; col < table2[row].length; col++) {

                System.out.print(" " + table2[row][col]);
                // table[row][col] = col;
            }
            System.out.println();
        }
        
//        
//        // modifing value
//        for (int row = 0; row < table2.length; row++) {
//
//            for (int col = 0; col < table2[0].length; col++) {
//
//               // System.out.print(" " + table2[row][col]);
//               if(table2[1][2] == 2){
//                   
//                   table2[1][2] = 9;
//               }
//                // table[row][col] = col;
//            }
//           
//        }
//        
//         System.out.println();
//         System.out.println(" printing modified table2[1][2]");
//         
//         // printing modified table
//        for (int row = 0; row < table2.length; row++) {
//
//            for (int col = 0; col < table2[0].length; col++) {
//
//                System.out.print(" " + table2[row][col]);
//                // table[row][col] = col;
//            }
//            System.out.println();
//        }
//        // Printing a table thats only intialized 
//          System.out.println();
//          System.out.println("Print table3- empty");
//        
//        for (int row = 0; row < table3.length; row++) {
//
//            for (int col = 0; col < table3[0].length; col++) {
//
//                System.out.print(" " + table3[row][col]);
//                // table[row][col] = col;
//            }
//            System.out.println();
//        }
        
        
        System.out.println("Printing table.length (controls rows- size vertical) " + table.length);
        System.out.println("Printing table[0].length (controls col - size horozantal ) " + table[0].length);
        
    }

}
