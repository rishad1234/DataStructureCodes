
package circularsinglylinkedlist;


public class CircularList {
    private Node head;
    private int size;
    private Node tail;

    public CircularList() {
        this.head = new Node(Integer.MIN_VALUE);
        this.tail = new Node();
        this.head.setNext(null);
        size = 0;
    }
    
    public void insert(int number){
        Node node = new Node(number);
        Node current = head.getNext();
        Node previous = head;
        if(head.getNext() == null){
            head.setNext(node);
            tail = node;
            tail.setNext(head);
        }else{
            while(current != tail.getNext() && node.getNumber() > current.getNumber()){
                current = current.getNext();
                previous = previous.getNext();
            }
            previous.setNext(node);
            
        }
    }
    
    public void printNodes(){
        Node temp = head.getNext();
        while(temp != tail.getNext()){
            System.out.println(temp);
            temp = temp.getNext();
        }
    }
    
}
