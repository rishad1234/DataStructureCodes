
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
    
    public int delete(){
        Node current = head.getNextNode();
        int number = Integer.MAX_VALUE;
        if(head.getNextNode() == null || size == 0){
            System.out.println("No data found");
        }else if(current != tail.getNextNode()){
            head = current;
            number = current.getNumber();
        }else{
            head.setNextNode(null);
        }
        size--;
        if(size <= 0){
            size = 0;
        }
        
        return number;
    }
    
    public void printNodes(){
        if(head.getNextNode() == null || size == 0){
            System.out.println("No Node found");
            
        }else{
            Node current = head.getNextNode();
            while(current != tail.getNextNode()){
                System.out.println(current);
                current = current.getNextNode();
            }
        }
    }
    
    public int getSize(){
        return size;
    }
    
}
