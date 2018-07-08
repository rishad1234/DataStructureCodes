
package stackwithlinkedlist;

public class LinkedList {
    private Node head;
    private int size;


    public LinkedList() {
        head = new Node(Integer.MIN_VALUE);
        head.setNextNode(null);
        size = 0;
    }
    
    public boolean isEmpty(){
        return head == null;
    }
    public void insert(int number){
        Node node = new Node(number);
        if(head.getNextNode() == null){
            head.setNextNode(node);
        }else{
            Node temp = head.getNextNode();
            head.setNextNode(node);
            node.setNextNode(temp);
        }
        size++;
    }
    
    public int deleteNode(){
        Node temp = null;
        int number = Integer.MAX_VALUE;
        if(head.getNextNode() != null){
            temp = head.getNextNode();
            number = temp.getNumber();
            if(temp.getNextNode() != null){
                head.setNextNode(temp.getNextNode());
            }else if(temp.getNextNode() == null){
                head.setNextNode(null);
            }
        }
        size++;
        if(size <= 0){
            size = 0;
        }
        return number;
  
    }
    
    public void printNodes(){
        Node current = head.getNextNode();
        if(current == null || size == 0){
            System.out.println("Stack is empty");
        }
        while(current != null){
            System.out.println(current);
            current = current.getNextNode();
        }
    }
    
    public int getSize(){
        return size;
    }
}
