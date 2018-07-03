
package circularsinglylinkedlist;


public class CircularList {
    private Node head;
    private int size;
    private Node tail;

    public CircularList() {
        this.head = new Node(Integer.MIN_VALUE);
        this.tail = new Node(Integer.MAX_VALUE);
        this.head.setNext(tail);
        this.tail.setNext(head);
        size = 0;
    }
    
    public void insert(int number){
        Node node = new Node(number);
        Node current = head.getNext();
        Node previous = head;
        if(head.getNext() == tail){
            head.setNext(node);
            node.setNext(tail);
        }else{
            while(current != tail && node.getNumber() > current.getNumber()){
                current = current.getNext();
                previous = previous.getNext();
            }
            node.setNext(current);
            previous.setNext(node);
        }
    }
    
    public void printNodes(){
        Node temp = head.getNext();
        while(temp != tail){
            System.out.println(temp);
            temp = temp.getNext();
        }
    }
    
}
