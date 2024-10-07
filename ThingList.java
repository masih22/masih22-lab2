import java.util.Random;
public class ThingList {
    //Node class
    private class Node {
        Thing data; 
        Node next;
        //node constrcutor that will hold Thing type 
        Node(Thing t){
            this.data = t;
            this.next = null;
        }
    }
    
    private Node head;
    //method for adding a new node with a thing into the list
    public void addThingNode(Thing t) {
        Node createdNode = new Node(t);
        createdNode.next = head; 
        head = createdNode;
    }
    //method for printing all of things at certain row, col and color
    public void printAll() {
        Node currentNode = head;
        while(currentNode != null){
            System.out.println(currentNode.data.row + " " + currentNode.data.col + " " + currentNode.data.lab);
            currentNode = currentNode.next;
        }
    }
    //method for moving all things in list
    public void moveAll(Random t) {
        Node currentNode = head;
        while(currentNode != null) {
            currentNode.data.maybeTurn(t);
            currentNode.data.step();
            currentNode = currentNode.next;
        }

    }
}