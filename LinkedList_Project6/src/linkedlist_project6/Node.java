/*
Section number: Cop3337 U11
Student ID: 5852258
I affirm that this program is enterely my own work and none of it is the work of any
other person. ______Andrew Bedon___________________________________________
 */
package linkedlist_project6;

 /**
 * Generic Node class. Containing data of Type and a reference to the next Node
 * object.
 *
 */
public class Node<Type> {

    private Type data;   // pointer to first Node on the list 
    private Node nextNode;  // used to iterate through the list

    public Node(Type typeOfData) {
        //setData(data);

        this.data = typeOfData;
        this.nextNode = null;
    }// end node constructor 

    /**
     * A getter method that returns the data inside a node object
     *
     * @return data
     */
    public Type getData() {
        return data;
    }

    /**
     * A setter method that sets the data of the node to the next node
     *
     * @parm data data inside node
     */
    public void setData(Type data) {

        this.data = (Type) data;

    }// end setData

    /**
     * A getter method that returns a pointer to the next node
     *
     * @return nextNode
     */
    public Node getNextNode() {
        return nextNode;
    }// end get node

    /**
     * A setter method that sets the pointer of the node to the next node
     *
     * @parm nextNode reference to next node
     */
    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }// end setNode

    /**
     * Return a String representation of a node
     *
     * @return the list as a String
     */
    @Override
    public String toString() {
        return "" + data;
    }// end to string

}// end node class
