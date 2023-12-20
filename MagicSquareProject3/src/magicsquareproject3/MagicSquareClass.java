/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magicsquareproject3;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author abedo016
 */
public class MagicSquareClass {
    
    private int[][] matrix;
   
    static int preRow;
    static int preCol;
    
    public MagicSquareClass(int size){
        
       matrix = fill(size);
//    
//        for(int row = 0; row < matrix.length; row++){
//            
//            for(int col = 0; col < matrix[0].length; col++){
//                
//               System.out.printf("%3d ",matrix[row][col]);
//            }
//            System.out.println();
//        }
        
    }// end constuctor
    
    public int[][] fill(int size) {
        int[][] table = new int[size][size];

        int loopSize = size * size;
        
        int sizeMenosOne = size - 1;

        int center = sizeMenosOne / 2;

        int lastRowForTable = table.length - 1;

//        System.out.println("evenSize " + sizeMenosOne);
//        System.out.println("center " + center);
//        System.out.println("rowForTable " + lastRowForTable);
        // table[lastRowForTable][center] = 1;// center one 

        // table = a(table, lastRowForTable, center);// adds the one
       

         preRow = lastRowForTable;
         preCol = center;
        //  while(notFull == false){

//        System.out.println("prerow out " + preRow);
//        System.out.println("preCOl out" + preCol);

        

         table[lastRowForTable][center] = 1;
             
        for (int index = 2; index <= loopSize; index++) {
           
            preRow++;
            preCol++;
            
            if (preRow > lastRowForTable && preCol <= lastRowForTable) { // row doesnt exsits
                preRow = 0; // points to first row
                // int preC = preCol;
                //preC = preCol - 2;

                //table[preRow][preCol] = 2;
                if(table[preRow][preCol] == 0){
                table[preRow][preCol ] = index;
                // System.out.println("preC " + preC);
//                System.out.println("b " + preRow);
//                System.out.println("b " + preCol);
                } else {
                preRow = preRow - 2;

                preCol = preCol - 1;

                //table[preRow][preCol] = 4;
                table[preRow][preCol] = index;

//                System.out.println("e " + preRow);
//                System.out.println("e " + preCol);
                }

            }else if ((preCol > lastRowForTable) && (preRow <= lastRowForTable)) { // column doesnt exist
                // preRow = 1; not needed - hard coded
                preCol = 0;
                //fix
                //table[preRow][preCol] = 3;
                if(table[preRow][preCol] == 0){
                table[preRow][preCol] = index;
//                System.out.println("c " + preRow);
//                System.out.println("c " + preCol);
                } else {
                preRow = preRow - 2;

                preCol = preCol - 1;

                //table[preRow][preCol] = 4;
                table[preRow][preCol] = index;

//                System.out.println("e " + preRow);
//                System.out.println("e " + preCol);

                }

            }
//            else if (table[preRow][preCol] != 0  ) { // if number is already there and if col or row dont exist
//
//                preRow = preRow - 2;
//
//                preCol = preCol - 1;
//
//                //table[preRow][preCol] = 4;
//                table[preRow][preCol] = index;
//
//                System.out.println("e " + preRow);
//                System.out.println("e " + preCol);
//
//            }
            else if (preRow <= lastRowForTable && preCol <= lastRowForTable) { // if nothing is there

                //table[preRow][preCol] = 5;
                if(table[preRow][preCol] == 0){
                table[preRow][preCol] = index;
//                System.out.println("d " + preRow);
//                System.out.println("d " + preCol);
//                
//                System.out.println("last "+preRow);
//                System.out.println("last "+preCol);
//                System.out.println("last "+index);
                //System.out.println("last "+preCol);
                } else{
                preRow = preRow - 2;

                preCol = preCol - 1;

                //table[preRow][preCol] = 4;
                table[preRow][preCol] = index;

//                System.out.println("e " + preRow);
//                System.out.println("e " + preCol);
                }
                
            }  else if ( preRow > lastRowForTable && preCol > lastRowForTable ) { // if number is already there and if col or row dont exist
//                 System.out.println("in f");
//                 System.out.println(lastRowForTable);
//                 System.out.println("in f preRow " + preRow);
//                 System.out.println("in f preCol " + preCol);
                preRow = preRow - 2;

                preCol = preCol - 1;
                
//                 System.out.println("in f preRow " + preRow);
//                 System.out.println("in f preCol " + preCol);
                //table[preRow][preCol] = 4;
                if(table[preRow][preCol] == 0){
                table[preRow ][preCol ] = index ;

//                System.out.println("f " + preRow);
//                System.out.println("f " + preCol);
                } else{
                preRow = preRow - 2;

                preCol = preCol - 1;

                //table[preRow][preCol] = 4;
                table[preRow][preCol] = index;

//                System.out.println("e " + preRow);
//                System.out.println("e " + preCol);
                }
                    

            }
          
         
        }// end loop
        System.out.println();
        System.out.println(preRow);
        System.out.println(preCol);

//        for (int row = 0; row < table.length; row++) {
//
//            for (int col = 0; col < table[0].length; col++) {
//
//                System.out.print(" " + table[row][col]);
//            }
//            System.out.println();
//            
//            
//        }
        
        return table;

    }// end fill


    public boolean isMagic() {
        
        boolean checkMagic = true;
        
        ArrayList<Integer> magicTableValues = addingMagic();
        
        for(int index = 0; index < magicTableValues.size(); index++){
            
            int num = magicTableValues.get(index);
            
            if(num !=  magicTableValues.get(0)){
                
                checkMagic = false;
            }
           // System.out.println(magicTableValues.get(index));
        }
        

        return checkMagic;
        
    }

    
    public ArrayList<Integer> addingMagic(){
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        ArrayList<Integer> list3 = new ArrayList<Integer>();
        
        for(int row = 0; row < matrix.length; row ++){
            
            int sum1 = 0;
            int sum2 = 0;
            int sum3 = 0;
            int sum4 = 0;
            
            for(int col = 0; col < matrix[0].length; col++){
                
                if(col == row){
                    
                    sum1 += matrix[row][col];
                    
                }// slanted
                
                if(col + row == matrix.length-1){
                    
                   sum2= matrix[ (matrix.length -1) - row][row];
                    
                }
                
                sum3 += matrix[row][col];
                sum4 += matrix[col][row];
                
            }// end inner loop
            list2.add(sum1);
            list3.add(sum2);
            list.add(sum3);
            list.add(sum4);
           
         
           
            
        }// end outter loop
        
        
         int finSum = 0;
         int finSum2 = 0;
            
            
            for(int index = 0; index < list2.size(); index++){
                
                finSum += list2.get(index);
                finSum2 += list3.get(index);
                
                
            } // end loop 
            
            
            list.add(finSum);
            list.add(finSum2);
//            System.out.println("list "+list.toString());
//            System.out.println("list2 "+list2.toString());
//            System.out.println("list3 "+list3.toString());
        
            return list;
    }

    @Override
    public String toString() { 
        StringBuilder builder = new StringBuilder();

        for(int row = 0; row < matrix.length; row++){
   
            for(int col = 0; col < matrix[0].length; col++){
                
               
               builder.append(matrix[row][col]+"   ");
               
            }
            builder.append("\n");
        }
        return builder.toString();
    }   

//     @Override
//    public String toString() {
//        String text = " ";
//        
//          for(int row = 0; row < matrix.length; row++){
//            
//            for(int col = 0; col < matrix[0].length; col++){
//                
//               //System.out.printf("%3d ",matrix[row][col]);
//               text = " " + Integer.toString(matrix[row][col]);
//            }
//            text = " \n";
//        }
//        
//        return  text ;
//        
//        
//    }

    
    
    
    
    
//    @Override
//    public String toString() {
//        
//        String text = ""; 
//        
//         for(int row = 0; row < matrix.length; row++){
//            int num = 0;
//            for(int col = 0; col < matrix[0].length; col++){
//                
//               num = matrix[row][col];
//              text = Integer.toString(num);
//            }
//            System.out.println();
//        }
//        
//        return text;
//    }


    
   
    
    
    
}// end class


//     for(int i = 1; i <= 8; i++){
//         
//         if(i == 1){
//              table[lastRowForTable][center] = 1;
//              
//          }
//
//
//        preRow ++;
//        preCol ++;
//        System.out.println("prerow " + preRow);
//        System.out.println("preCOl " + preCol);
////        System.out.println("prerow " + preRow);
////        System.out.println("preCOl " + preCol);
////                
//        if (preRow > lastRowForTable && preCol > lastRowForTable) {
//            preRow = preRow - 1;
//            preCol = preCol -1;
//             System.out.println("a "+preRow);
//             System.out.println("a "+ preCol);
//            table[preRow][preCol] = i;
//            continue;
//
//        }
//        
//        if(preRow > lastRowForTable && preCol <= lastRowForTable ){ // row doesnt exsits
//             preRow = 0;
//             preCol = 2;
//            table[preRow][preCol] = i;
//           
//                 System.out.println("b "+preRow);
//             System.out.println("b "+ preCol);
//             continue;
//        } 
//        
//        if(preCol > lastRowForTable && preRow <= lastRowForTable ){ // column doesnt exist
//            preRow = 2;
//            preCol = 0;
//             
//             table[preRow][preCol] = i;
//             System.out.println("c "+preRow);
//             System.out.println("c "+ preCol);
//             continue;
//        } 
//        
//        if( table[preRow][preCol] == 0){
//            
//            
//            table[preRow][preCol] = i;
//                 System.out.println("d "+preRow);
//             System.out.println("d "+ preCol);
//            continue;
//        }
//        if( table[preRow][preCol] != 0){
//            
//            preRow = preRow - 1;
//            preCol = preCol - 1;
//            
//            table[preRow][preCol] = i;
//            
//                 System.out.println("e "+preRow);
//             System.out.println("e "+ preCol);
//             continue;
//        }
//        
//      
//        
//        }
        // }

//
//    public int[][] a(int[][] table, int lastRowForTable, int center) {
//
//        int downOne = lastRowForTable + 1;
//        int rightOne = center + 1;
//
//        table[downOne][rightOne] = 2;
////        if(downOne > lastRowForTable && rightOne > lastRowForTable ){ // none existing row and column 
////            
////            table[lastRowForTable - 1][center] = 2;
////            
//////            table = b(table);
////    
////        }
//
//        return table;
//    }
//
//    public int[][] b(int[][] table, int lastRowForTable, int center) {
//
//        int downOne = lastRowForTable + 1;
//        int rightOne = center + 1;
//        if (downOne > lastRowForTable && rightOne > lastRowForTable) { // none existing row and column 
//
//            table[lastRowForTable - 1][center] = 2;
//
////            table = b(table);
//        }
//        return table;
//    }
//
//    public int[][] c(int[][] table, int lastRowForTable, int center) {
//
//        int downOne = lastRowForTable + 1;
//        int rightOne = center + 1;
//        table[downOne][rightOne] = 0;
//
//        if (downOne > lastRowForTable) { // none exsiting row
//
//            table[0][1] = 9;
//        }
//
//        return table;
//    }
//
//    public int[][] d(int[][] table, int lastRowForTable, int center) {
//
//        int downOne = lastRowForTable + 1;
//        int rightOne = center + 1;
//        table[downOne][rightOne] = 0;
//
//        if (rightOne > lastRowForTable) {
//
//            table[1][0] = 3;
//
//        }
//
//        return table;
//    }
//
//    public int[][] e(int[][] table, int lastRowForTable, int center) {
//
//        int downOne = lastRowForTable + 1;
//        int rightOne = center + 1;
//
//        if (table[downOne][rightOne] == 0) {
//
//            table[downOne][rightOne] = 3;
//
//        }
//
//        return table;
//    }
