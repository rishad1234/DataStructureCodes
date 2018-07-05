
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
            if(previous == tail){
                previous.setNext(node);
                tail = node;
            }else{
                previous.setNext(node);
                node.setNext(current);
            }
        }
    }
    public int delete(int number){
        Node current = head.getNext();
        Node previous = head;
        if(head.getNext() == tail){
            System.out.println("list empty");
            return Integer.MIN_VALUE;
        }
        while(current != tail.getNext()){
            if(current.getNumber() == number){
                previous.setNext(current.getNext());
            }else{
                current = current.getNext();
                previous = previous.getNext();
            }
        }
        return number;
    }
    
    public void printNodes(){
        Node temp = head.getNext();
        while(temp != tail.getNext()){
            System.out.println(temp);
            temp = temp.getNext();
        }
    }
    
}
