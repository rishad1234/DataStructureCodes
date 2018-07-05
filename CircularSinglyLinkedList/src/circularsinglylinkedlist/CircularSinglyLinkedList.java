
package circularsinglylinkedlist;

public class CircularSinglyLinkedList {


    public static void main(String[] args) {
        CircularList list = new CircularList();
        list.insert(12);
        list.insert(2);
        list.insert(129);
        list.insert(1123); 
        list.insert(6);

        list.printNodes();
        
        System.out.println("After delete: ");
        
        list.delete(7);
        list.delete(1);
        list.delete(2);
        list.printNodes();
        
    }
    
}
