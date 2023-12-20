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

public class Node<Type> {
    
    
    Type data;
    Node nextNode;
   // Node next;

    public Node(Type typeOfData ) {
       //setData(data);
        
        this.data = typeOfData;
        this.nextNode = null;
    }

    public Type getData() {
        return data;
    }

    public Node getNextNode() {
        return nextNode;
    }

   
    

    public void setData(Type data) {
        this.data = (Type) data;
    }
//
//    public Node getNextNode() {
//        return nextNode;
//    }
//
//    public void setNextNode(Node nextNode) {
//        this.nextNode = nextNode;
//    }

    @Override
    public String toString() {
        return  data + "";
    }
    
    
    
}
