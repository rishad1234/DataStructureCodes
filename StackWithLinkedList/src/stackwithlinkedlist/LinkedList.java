
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
            Node previousNode = head;
            Node current = head.getNextNode();
            while(current != null){
                current = current.getNextNode();
                previousNode = previousNode.getNextNode();
            }
            previousNode.setNextNode(node);
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
        number = previousNode.getNextNode().getNumber();
        previousNode.setNextNode(null);
        size--;
        return number;
  
    }
    public void printNodes(){
        Node current = head.getNextNode();
        while(current != null){
            System.out.println(current);
            current = current.getNextNode();
        }
    }
    
    public int getSize(){
        return size;
    }
}
