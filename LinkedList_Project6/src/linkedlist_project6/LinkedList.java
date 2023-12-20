/*
Section number: Cop3337 U11
Student ID: 5852258
I affirm that this program is enterely my own work and none of it is the work of any
other person. ______Andrew Bedon___________________________________________
 */
package linkedlist_project6;

/**
 * Implements a simple generic list contains a Type data of Node Containing type
 * data.
 */
public class LinkedList<Type extends Node> {

    private Node head; // pointer to first Node on the list 

   

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

    //
    /**
     * utility method returns a pointer to the last node on the list.
     *
     * @return Node
     */
    private Node lastNode() {

        if (head == null) {       // if list empty...

            return null;        // ...no last node
        } else {
            // get pointer to last node

            Node temp = head;           // ...start at head of list
            while (temp.getNextNode() != null) {   // ...while not at last node...

                temp = temp.getNextNode();   // ......move to next node
                
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
     *
     * @param insertAt
     * @param node
     */
    public void add(int insertAt, Node node) {

        Node tempLeadNode = this.head; // pointer to first Node on the list 
        Node tempTrailNode = this.head; // used to iterate through the list

        int insertAtNew = insertAt - 1;

        if (head == null) {

            head = tempTrailNode;

        } else if (insertAt == 1) {

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

    }// end add

    /**
     * A public delete method that removes the Nth object from the list.
     *
     * @param deleteAt
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

            count++;
        }// end while

    }// end delect

    /**
     * A public swap method that Interchange the positions of the position1 and
     * position2 objects on the list.
     *
     * @param position1
     * @param postion2
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

        }// end while

        Node tempLeadNode2 = this.head; // pointer to second Node on the list
        Node tempTrailNode2 = this.head; // used to iterate through the list 

        int count2 = 1;

        while (count2 < position2) {
            tempTrailNode2 = tempLeadNode2;
            tempLeadNode2 = tempLeadNode2.getNextNode();

            count2++;

        }// end while 

        if (position1 == 1) {

            Node temp2 = tempTrailNode2; // 7               now // 12

            temp2 = temp2.getNextNode(); // 12

            this.head = temp2;

        }

        // conditon for swapping right next to each other
        if (position1 == position2 - 1) {
            tempTrailNode.setNextNode(tempLeadNode2);
            tempTrailNode2.setNextNode(tempLeadNode);

        }// end if 

        Node pointer = tempLeadNode.getNextNode(); //  first swaped node
        Node pointer2 = tempLeadNode2.getNextNode();//  second swaped node

        tempTrailNode.setNextNode(tempLeadNode2); // switching the pointer of tempTrailNode
        tempLeadNode2.setNextNode(pointer); //  tempLeadNode has to point to the address of 3

        tempTrailNode2.setNextNode(tempLeadNode); // switching the pointer of tempTrailNode2
        tempLeadNode.setNextNode(pointer2); // tempLeadNode has to point to the address of 1

    }

    /**
     * A public reverse method that reverses the order of the objects on the
     * list.
     */
    public void reverse() {
        Node tempLeadNode = this.head; // last node on list

        while (tempLeadNode.getNextNode() != null) { //checker == false

            tempLeadNode = tempLeadNode.getNextNode();

        } // end while loop

        Node pointer = this.head; // first node on list
        Node previous = null; // previous 
        Node current = null; // current 

        while (pointer != tempLeadNode) {

            current = pointer;
            pointer = pointer.getNextNode();

            current.setNextNode(previous);

            tempLeadNode.setNextNode(current);

            previous = current;

            this.head = pointer;
        }

    }// end reverse

    /**
     * Return a String containing all the objects on the Linked list
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
