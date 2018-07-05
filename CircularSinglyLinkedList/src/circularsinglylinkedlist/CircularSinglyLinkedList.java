
package circularsinglylinkedlist;

public class CircularSinglyLinkedList {


    public static void main(String[] args) {
        CircularList list = new CircularList();
        list.insert(12);
        list.insert(2);
        list.insert(129);
        list.insert(1123); 
        list.insert(6);

        System.out.println("Size: " + list.getSize());
        list.printNodes();
        
        System.out.println("After delete: ");
        
        list.delete(12);
        list.delete(2);
        list.delete(129);
        list.delete(1123);
        list.delete(6);
        list.delete(12);
        list.delete(12344);
        list.printNodes();
        System.out.println("Size: " + list.getSize());
        for(int i = 0; i < 10; i++){
            list.insert(i);
        }
        System.out.println("After that: ");
        list.printNodes();
        for(int i = 0; i < 10; i++){
            list.delete(i);
        }
        list.delete(2);
        System.out.println("After that: ");
        list.printNodes();
        System.out.println("Size: " + list.getSize());
        
    }
    
}
