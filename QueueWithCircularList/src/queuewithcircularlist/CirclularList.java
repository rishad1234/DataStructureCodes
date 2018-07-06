
package queuewithcircularlist;

public class CirclularList {
    private Node head;
    private Node tail;
    int size;

    public CirclularList() {
        head = new Node(Integer.MIN_VALUE);
        head.setNextNode(null);
    }
    public void insert(int number){
        Node node = new Node(number);
        if(head.getNextNode() == null){
            head.setNextNode(node);
            tail = node;
            tail.setNextNode(head);
        }else{
            tail.setNextNode(node);
            tail = node;
            tail.setNextNode(head);
        }
        size++;
    }
    
    
    
    public void printNodes(){
        if(head.getNextNode() == null || size == 0){
            System.out.println("No Node found");
        }
    
        Node current = head.getNextNode();
        while(current != tail.getNextNode()){
            System.out.println(current);
            current = current.getNextNode();
        }
    }
    
    public int getSize(){
        return size;
    }
    
}
