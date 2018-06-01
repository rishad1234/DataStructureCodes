
package doublylinkedlisttest;

public class DoublyLinkedList {
    private Node head;
    private Node tail;

    public DoublyLinkedList() {
        head = new Node(Integer.MIN_VALUE);
        tail = new Node(Integer.MAX_VALUE);
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public Node getTail() {
        return tail;
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }
    
    public void insert(int number){
        Node node = new Node(number);
        if(head.getNext() == null && tail.getPrevious() ==  null){
            head.setNext(node);
            node.setPrevious(head);
            node.setNext(tail);
            tail.setPrevious(node);
        } else{
            Node current = head.getNext();
            while(current != tail.getNext() && node.getNumber() > current.getNumber()){
                current = current.getNext();
            }
            node.setPrevious(current.getPrevious());
            node.setNext(current);
            current.getPrevious().setNext(node);
            current.setPrevious(node);
        }
    }
    
    public void delete(int number){
        Node current = head.getNext();
        while(current != tail){
            Node temp;
            if(number == current.getNumber()){
                temp = current;
                while(current != tail && number == current.getNumber()){
                    current = current.getNext();
                }
               temp.getPrevious().setNext(current);
               current.setPrevious(temp.getPrevious());
            }else{
                current = current.getNext();
            }
            
        }
        
    }
    
    public void printListForward(){
        Node current = head.getNext();
        while(current != tail){
            System.out.println(current);
            current = current.getNext();
        }      
    }
    public void printListBackward(){
        Node current = tail.getPrevious();
        while(current != head){
            System.out.println(current);
            current = current.getPrevious();
        }
    }
}
