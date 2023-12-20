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
public class  LinkedList<Type extends Node > {

    
    Node head;
    Node iterator;
    public static int lastIndex = 1;
    public LinkedList() {
        
        head = null;
    }
    
    
     /**
     * Append an object to the end of the list
     * @param node the object to be appended
     */
    public void append(Type node){
    
        // create new Node with "info" member pointing to x
        Node temp = new Node(node);

        if (head == null){           // if list is empty...
        
            head = temp;            // ...put new Node at head of list.
        } else {
                               // if non-empty...
        
            lastNode().nextNode = temp; // ...append new node to end of list
            lastIndex++;
        }
    }
    
    
    
        // utility method returns a pointer to the last node on the list
    private Node lastNode(){
    
        if (head == null){       // if list empty...
        
          return null;        // ...no last node
        } else{
                            // get pointer to last node
        
            Node temp = head;           // ...start at head of list
            while (temp.nextNode != null){   // ...while not at last node...
            
                temp = temp.nextNode;   // ......move to next node
            }
            return temp;            // ...return pointer to last node
        }
    }// end last node
    
    
    public void clear(){
        
        this.head = null;
        
    }// end clear 
    
    
    public void add(int insertAt, Node node){
        
        Node tempLeadNode = this.head;
        Node tempTrailNode = this.head;
       
        if(head == null){
            
            head = tempTrailNode;
        
        } else{
            
            int count = 0;
            
            while (count <= insertAt) {
               
                tempTrailNode = tempLeadNode; // changes pointer to tempLead
                tempLeadNode = tempLeadNode.nextNode; // tempHead points to the next
                
                System.out.println("the Count "+count + " data inside of tempNode "+tempTrailNode.data + " data inside of tempHead " + tempLeadNode.data);
                if (count == insertAt -1) {
                    tempTrailNode.nextNode = node;
                    node.nextNode = tempLeadNode;
                }
                 count++;
            }
 
            System.out.println();
        
        }
   
    }// end add
    
    
    public Node<Type> delete(int deleteAt){
        
        Node tempLeadNode = this.head;
        Node tempTrailNode = this.head;
        
        int count = 0;
        
        while (count <= deleteAt) {
            tempTrailNode = tempLeadNode;
            tempLeadNode = tempLeadNode.nextNode;
            
             System.out.println("the Count "+count + " data inside of tempTrailNode "+tempTrailNode.data + " data inside of tempLeadNode " + tempLeadNode.data);
            if(count == deleteAt - 1 ){
                tempTrailNode.nextNode = tempLeadNode.nextNode;
                
                System.out.println("inside");
            }// end if
            
            if (deleteAt == 0) {
                this.head = tempLeadNode;
                
                System.out.println("inside2");
            }
             System.out.println("count "+ count);
             
             count++;
        }// end while
        return tempLeadNode;
        
        
        
    }// end delect
    
    
    public void swap(int position1, int position2 ){
        
        Node tempLeadNode = this.head;
        Node tempTrailNode = this.head;
        
        int count = 0;
        
        while (count < position1 ) {
            
            tempTrailNode = tempLeadNode;
            tempLeadNode = tempLeadNode.nextNode;
            
         
            count++;
            System.out.println("the Count " + count + " data inside of tempTrailNode "+tempTrailNode.data + " data inside of tempLeadNode " + tempLeadNode.data);
        }
        System.out.println();
        
        Node tempLeadNode2 = this.head;
        Node tempTrailNode2 = this.head;
        
        int count2 = 0;
        
        while (count2 < position2) {
            tempTrailNode2 = tempLeadNode2;
            tempLeadNode2 = tempLeadNode2.nextNode;
            
            count2++;
            System.out.println("the Count "+count2 + " data inside of tempTrailNode2 "+tempTrailNode2.data + " data inside of tempLeadNode2 " + tempLeadNode2.data);
        }
         System.out.println();
        
         // condition for swapping next to each other 
         
        if(position1 == position2 - 1){
             tempTrailNode.nextNode = tempLeadNode2;
             tempTrailNode2.nextNode = tempLeadNode;
             
         }
         
         // create holder of the next node address
         Node pointer = tempLeadNode.nextNode;   
         Node pointer2 = tempLeadNode2.nextNode;
         
//         System.out.println("tempTrailNode.nextNode "+pointer.nextNode); // point to next pointer form pointer.data or pointer2.data
//         System.out.println("tempTrailNode2.nextNode "+pointer2.nextNode);
          System.out.println("tempTrailNode.nextNode "+pointer.data);
         System.out.println("tempTrailNode2.nextNode "+pointer2.data);
         
         tempTrailNode.nextNode = tempLeadNode2; // switching the pointer of tempTrailNode. so instead of pointing to 25 it points to 1
         tempLeadNode2.nextNode = pointer;// now to not loss data we have to point back to the data, tempLeadNode(100) has to point to the address of 3
         
         
         tempTrailNode2.nextNode = tempLeadNode; // switching the pointer of tempTrailNode2. so instead of pointing to (100) it points 25
         tempLeadNode.nextNode = pointer2;// now to not loss data we have to point back to the data, tempLeadNode(1) has to point to the address of 1
         
         System.out.println("tempTrailNode2.nextNode "+ pointer);
         System.out.println("tempTrailNode.nextNode "+ pointer2);
       
         //tempLeadNode.nextNode = 
    }
    // 2 and 5 25-1
    
    public void reverse(){
        
        Node nodeLead = this.head;
        Node nodeTrail = this.head;
        
        Node tempLeadNode = this.head;

        
        while (tempLeadNode.nextNode != null) { //checker == false
    
                tempLeadNode = tempLeadNode.nextNode;

        } // end while loop
        
        
        Node tempHolder = tempLeadNode.nextNode;

        

        Node pointer = this.head; 
        Node previous = null;
        Node current = null; 
            
       while(pointer != null){
           
           current = pointer;
           pointer = pointer.nextNode;
           
           
           current.nextNode = previous;
           previous = current;
           this.head = current;
           System.out.println(previous);
       } 
        
        


        
//        while (this.head != tempLeadNode) {
//            
//            nodeTrail = nodeLead;
//            nodeLead = nodeLead.nextNode;
//            
//            
//            
//            System.out.println("node trail"+ nodeTrail + "       tempLeadNode nexts  "+ tempLeadNode.nextNode + "      tempHolder " + nodeLead);
//           
//            this.head = nodeLead;
//            
//        }
//
//       
        
        System.out.println("");
            System.out.println("tempLeadNode- outside- "+ tempLeadNode);
         
           

        }// end revserse

    
    private Node<Type> reverseHelper(Node<Type> nodeTrail, Node<Type> nodeLead){
        
        Node<Type> tempNode = null;
        Node temp1 = nodeLead;
        Node temp2 = nodeTrail;
        tempNode = temp1;
        
        tempNode.nextNode = temp2;
        
        return tempNode;
    }
    
    
        
//       theLast.nextNode = value;
//            System.out.println("value outside"+value);
//            lastAdded = value;
//            System.out.println("lastAdded outside"+lastAdded);
//            tempTrailNode = tempLeadNode;
//            
//            tempLeadNode = tempLeadNode.nextNode;
//            
//            this.head = tempLeadNode;
//            
//            value = tempTrailNode.nextNode;
//            
            

    
     /**
     * Return a String containing all the objects on the list
     * @return the list as a String
     */
    public String toString(){
    
        String out = "";
        Node temp = head; 		// start at head of list 
        while (temp != null){            // while more nodes on list...
        
            out += temp.data.toString() + "  ";	// ...append current obj
            temp = temp.nextNode;		// ...and move to next node
        }
        return out + "\n";
    }// end toString
}// end LinkedList


       
        
//        System.out.println(tempHolder + " - before add here "+ " nodeLead " + nodeLead);
//        
//        tempHolder = nodeLead; // both are the same
//        System.out.println(tempHolder + " - before add here "+ " nodeLead " + nodeLead);
//        System.out.println("space");
//        
//        nodeLead = nodeLead.nextNode; // temp is  7 and nodelead is ahead one 
//        System.out.println(tempHolder + " - here one add " + "nodeLead " + nodeLead);
//  
//        tempHolder = nodeLead; // they are equal again 
//        System.out.println(tempHolder + " before add here "+ " nodeLead " + nodeLead);
//        
//        nodeLead = nodeLead.nextNode; // temp is 1 and now node is ahead one 3
//        System.out.println(tempHolder + " before add here "+ " nodeLead " + nodeLead);
//        
//        tempHolder = nodeLead;
//        System.out.println(tempHolder + "  here added"+ "nodeLead " + nodeLead);
        
        
        
        
//        while (nodeTrail != tempLeadNode) {
//            
//       
//        }
        
        //System.out.println("printing node lead"+ nodeLead);
       // System.out.println("printing node trail "+ nodeTrail);
        



 /*           
               //System.out.println("tempLeadNode inside " + tempLeadNode.nextNode);
               
                nodeTrail = nodeLead;
                holder = nodeTrail;
                System.out.println("holder inside " + holder);
                tempLeadNode.nextNode = holder;
                
                nodeLead = nodeLead.nextNode;
                

               // System.out.println("\n nodeTrail inside " + nodeTrail.nextNode);
                this.head = nodeLead;
                 
              //  System.out.println("what is nodeTrail before "+nodeTrail.nextNode);
                nodeTrail.nextNode = null;
               
               // secondHolder = holder;
                //nodeTrail.nextNode = secondHolder;
             //  System.out.println("what is nodeTrail "+nodeTrail.nextNode);
   */     
               
            // while to reverse
               
          
            //System.out.println(counter);
                
                
//                System.out.println("lead"+tempLeadNode);
//                System.out.println("trail"+tempTrailNode);
//                System.out.println("value"+value);
//                System.out.println("theLast"+theLast);
                    
            // end while loop
//            tempTrailNode = tempLeadNode;
//            tempLeadNode = tempLeadNode.nextNode;
//            
//            value = tempTrailNode;
//            
//            System.out.println("the last " + theLast.nextNode);
//                   
//            if(tempLeadNode.nextNode  == null){
//                
//                checker = true;
//                break;
//            }
           
           
           // count++;