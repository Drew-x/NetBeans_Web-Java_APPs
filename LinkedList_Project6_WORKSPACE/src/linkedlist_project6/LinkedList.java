/*
Section number: Cop3337 U11
Student ID: 5852258
I affirm that this program is enterely my own work and none of it is the work of any
other person. ______Andrew Bedon___________________________________________
 */
package linkedlist_project6;

/**
 *
 * @author  abedo016
 */


/**
 * Implements a simple generic list
 * 
 */
public class LinkedList<Type extends Node> {

    private Node head; // pointer to first Node on the list 
    
    public static int lastIndex = 1; //index of last node

    public LinkedList() {

        head = null;
    }// end constructor 

    /**
     * Append an object to the end of the list
     *
     * @param node the object to be appended
     */
    public void append(Type node) {

        // create new Node with "info" member pointing to x
        Node temp = new Node(node);

        if (head == null) {           // if list is empty...

            head = temp;            // ...put new Node at head of list.
        } else {
            // if non-empty...

            lastNode().setNextNode(temp); // ...append new node to end of list
        }// end if else
        
    }// end append

    // utility method returns a pointer to the last node on the list
    private Node lastNode() {

        if (head == null) {       // if list empty...

            return null;        // ...no last node
        } else {
            // get pointer to last node

            Node temp = head;           // ...start at head of list
            while (temp.getNextNode() != null) {   // ...while not at last node...

                temp = temp.getNextNode();   // ......move to next node
                lastIndex++;
            }// end while
           
            
            return temp;            // ...return pointer to last node
        }
    }// end last node

    /**
     * Make the list empty.
     */
    public void clear() {

        this.head = null;

    }// end clear 

    /**
     * A public add method that Insert object X as the new Nth element in the
     * list, increasing the size of the list by 1.
     */
    public void add(int insertAt, Node node) {

        Node tempLeadNode = this.head; // pointer to first Node on the list 
        Node tempTrailNode = this.head; // used to iterate through the list
        
        int insertAtNew = insertAt - 1;
        
 
        if (head == null) {

            head = tempTrailNode;

        } else if (insertAt == 1){
            
            tempTrailNode = tempLeadNode;
            
            tempLeadNode = tempLeadNode.getNextNode();
            this.head = node;
            node.setNextNode(tempTrailNode);
        } else {

            int count = 0;

            while (count <= insertAtNew) { // was at <=

                tempTrailNode = tempLeadNode; // changes pointer to tempLead
                tempLeadNode = tempLeadNode.getNextNode(); // tempHead points to the next

                if (count == insertAtNew - 1) {
                    tempTrailNode.setNextNode(node);
                    node.setNextNode(tempLeadNode);
                }// end if 
                count++;

            }// end while

        }// end else if
// block
    }// end add

    /**
     * A public delete method that removes the Nth object from the list.
     *
     */
    public void delete(int deleteAt) {

        Node tempLeadNode = this.head; // pointer to first Node on the list 
        Node tempTrailNode = this.head; // used to iterate through the list

        int deleteAtNew = deleteAt - 1;
        int count = 0;

        while (count <= deleteAtNew) {
            tempTrailNode = tempLeadNode;
            tempLeadNode = tempLeadNode.getNextNode();

            if (count == deleteAtNew - 1) {
                tempTrailNode.setNextNode(tempLeadNode.getNextNode());

            }// end if

            if (deleteAtNew == 0) {
                this.head = tempLeadNode;

            }// end  if

//            if (deleteAtNew > lastIndex) {
//                System.out.println(lastIndex);
//                break;
//            }// end if 

            count++;
        }// end while

    }// end delect

    /**
     * A public swap method that Interchange the positions of the position1 and
     * position2 objects on the list.
     *
     */
    public void swap(int position1, int position2) {

        Node tempLeadNode = this.head; // pointer to first Node on the list 
        Node tempTrailNode = this.head; // used to iterate through the list

        int count = 1;

        
        while (count < position1) {

            tempTrailNode = tempLeadNode;
            tempLeadNode = tempLeadNode.getNextNode();

            count++;
           // System.out.println("the Count " + count + " data inside of tempTrailNode "+tempTrailNode.getData() + " data inside of tempLeadNode " + tempLeadNode.getData());
        }// end while
        System.out.println();
        
        Node tempLeadNode2 = this.head;
        Node tempTrailNode2 = this.head;

        int count2 = 1;

        while (count2 < position2) {
            tempTrailNode2 = tempLeadNode2;
            tempLeadNode2 = tempLeadNode2.getNextNode();

            count2++;

            //System.out.println("the Count " + count2 + " data inside of tempTrailNode "+tempTrailNode2.getData() + " data inside of tempLeadNode " + tempLeadNode2.getData());
        }// end while 

         if (position1 == 1) {
           // System.out.println(tempTrailNode+" thes trail");// check has 5 
            
           // tempTrailNode = tempLeadNode;// 5
            //tempLeadNode = tempLeadNode.getNextNode();  // 7
            
            // tempTrailNode2 =7
            
           // Node temp4 = tempTrailNode2; //7 
           
           // Node temp = tempTrailNode;  // 5
            Node temp2 = tempTrailNode2; // 7               now // 12
            
            temp2 = temp2.getNextNode(); // 12
            // System.out.println("temp2 "+ temp2);
             //System.out.println("temp2.next "+ temp2.getNextNode());
           // Node temp3 = temp2.getNextNode();// 22 data
            
            
            this.head = temp2;
            // System.out.println("head "+ temp2);
          //   System.out.println("head.next "+ temp2.getNextNode());
//            temp2.setNextNode(temp4);
//            System.out.println("temp3 " + temp3);
//            
//            
//            temp4.setNextNode(temp); // 7 -> 5
//            
//            temp.setNextNode(temp3);  //5 -> 22
//            
//            
//            temp2.setNextNode(tempLeadNode2);
//            
//            this.head = temp2;
            //head.setNextNode(tempTrailNode2);
            
            // System.out.println(tempTrailNode2);
            
            
          
            
            
            
//            System.out.println("what value is tempTrail "+ this.head);
//            System.out.println("what value is tempTrail "+ this.head.getNextNode());
//            System.out.println("what value is tempTrail "+ this.head.getNextNode().getNextNode());
//            System.out.println("what value is tempTrail "+ this.head.getNextNode().getNextNode().getNextNode());
//            System.out.println("what value is tempTrail "+ this.head.getNextNode().getNextNode().getNextNode().getNextNode());
//            System.out.println("what value is tempTrail "+ this.head.getNextNode().getNextNode().getNextNode().getNextNode().getNextNode());
//            System.out.println("what value is tempTrail "+ this.head.getNextNode().getNextNode().getNextNode().getNextNode().getNextNode().getNextNode());
        }
         
        // conditon for swapping right next to each other
        if (position1 == position2 - 1) {
            tempTrailNode.setNextNode(tempLeadNode2);
            tempTrailNode2.setNextNode(tempLeadNode);

        }// end if 

        Node pointer = tempLeadNode.getNextNode();
        Node pointer2 = tempLeadNode2.getNextNode();

        tempTrailNode.setNextNode(tempLeadNode2); // switching the pointer of tempTrailNode
        tempLeadNode2.setNextNode(pointer); //  tempLeadNode has to point to the address of 3

        tempTrailNode2.setNextNode(tempLeadNode); // switching the pointer of tempTrailNode2
        tempLeadNode.setNextNode(pointer2); // tempLeadNode has to point to the address of 1

    }
    // 2 and 5 25-1

    /**
     * A public reverse method that reverses the order of the objects on the
     * list
     */
    public void reverse() {

                
        Node tempLeadNode = this.head;
        Node nodeLead = this.head;
        Node nodeTrail = this.head;
      
         int count = 0;
         
        
        while (tempLeadNode.getNextNode() != null) { //checker == false
    
                tempLeadNode = tempLeadNode.getNextNode();
                count++;
        } // end while loop
        
        Node pointer = this.head;
        Node previous = null;
        Node current = null;
     
       
        
         
        while (pointer != tempLeadNode) {
            
           
            
            current = pointer;
            pointer = pointer.getNextNode();
            
           // System.out.println("curret- "+ current);
           // System.out.println("pointer "+ pointer);
            //System.out.println("pointer.next "+ pointer.getNextNode());
           // System.out.println("");
            
            current.setNextNode(previous);
            //System.out.println("current. next"+ current.getNextNode());
            //System.out.println("");
            
            tempLeadNode.setNextNode(current);
            //System.out.println("tempLeadNode.next" + tempLeadNode.getNextNode());
            //System.out.println("");
            
            previous = current;
            
           // System.out.println("previous "+ previous);
  
           // System.out.println("currents pointer "+ current.getNextNode() );
            
            
            this.head = pointer;
            
           // current.setNextNode(previous);
            
           // previous = pointer;
        }
         
         
       // System.out.println("the last " + tempLeadNode);
      
//            current = pointer;
//            pointer = pointer.getNextNode();
//
//            current.setNextNode(previous);
//            previous = current;
//            this.head = current;
    
        
       
//        while (pointer != null) {
//
//            current = pointer;
//            System.out.println("current " + current);
//            System.out.println("pointer " + pointer);
//            System.out.println("");
//            
//            pointer = pointer.getNextNode();
//            System.out.println("pointer called pointer.next " + pointer);
//            System.out.println("");
//            
//            current.setNextNode(previous);
//            System.out.println("current " + current);
//            System.out.println("current.next " + current.getNextNode());
//            System.out.println("previous " + previous);
//            System.out.println("");
//            
//            previous = current;
//            System.out.println("previous " + previous);
//            System.out.println("current " + current);
//            System.out.println("");
//            
//            this.head = current;
//            System.out.println("head " + this.head);
//            System.out.println("head " + this.head.getNextNode());
//        }// end while 

    }// end revserse

    /**
     * Return a String containing all the objects on the list
     *
     * @return the list as a String
     */ 
    public String toString() {

        String out = "";
        Node temp = head; 		// start at head of list 
        while (temp != null) {            // while more nodes on list...

            out += temp.getData().toString() + "  ";	// ...append current obj
            temp = temp.getNextNode();		// ...and move to next node
        }
        return out + "\n";
    }// end toString
    
}// end LinkedList



//reverse code
//    while (tempLeadNode != this.head) {
//            
//            nodeTrail = nodeLead;
//            nodeLead = nodeLead.getNextNode();
//            
//            System.out.println("the count is "+ count);
//            
//            if (tempLeadNode.getNextNode() == null) {
//                System.out.println("in first");
//                add(count + 1, nodeLead);
//                delete(0);
//            }
//            tempLeadNode.setNextNode(nodeTrail);
//            
//            if (tempLeadNode.getNextNode() != null) {
//                
//                System.out.println("in second");
//                       
//                add(count + 1, nodeTrail);
//                //swap(count + 1, count + 2);
//                delete(0);
//            
//            }
//           
//          
//           
//            
//        }



// code tried for add and revser

//// find length     
// 
//        int count2 = 1;
//        while (temp.getNextNode() != null) { //checker == false
//    
//                temp = temp.getNextNode();
//                count2++;
//        } // end while loop
//        
// // end find length  
// 
// //Append to the end code
//            
//        if (insertAt == count2 + 1) {
//            append((Type) node);
//        }
// 
// // 
// // code for adding        