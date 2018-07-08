
package stackwithlinkedlist;

public class LinkedList {
    private Node head;
    private int size;
    private Node tail;

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
            tail = node;
            tail.setNextNode(null);
        }else{
            tail.setNextNode(node);
            tail = node;
            tail.setNextNode(null);
        }
        size++;
    }
    
    public int deleteNode(){
        Node previousNode = head;
        Node current = head.getNextNode();
        int number = Integer.MIN_VALUE;
        while(current != null){
            current = current.getNextNode();
            if(current != null){
                previousNode = previousNode.getNextNode();
            }
        }
        size--;
        if(previousNode.getNextNode() != null){
            number = previousNode.getNextNode().getNumber();
            previousNode.setNextNode(null);
            
        }
        if(head.getNextNode() == null){
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
