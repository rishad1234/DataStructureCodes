
package queuewithlinkedlist;

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
//        Node previousNode = head;
//        Node current = head.getNextNode();
        int number = Integer.MIN_VALUE;
//        while(current != null){
//            current = current.getNextNode();
//            if(current != null){
//                previousNode = previousNode.getNextNode();
//            }
//        }
//        number = previousNode.getNextNode().getNumber();
//        previousNode.setNextNode(null);
        if(head.getNextNode() != null){
            Node current = head.getNextNode();
            number = current.getNumber();

            head.setNextNode(current.getNextNode());
            size--;
        }else{
            System.out.print("(garbage) ");
        }
        return number;
  
    }
    public void printNodes(){
        if(isEmpty()){
            System.out.println("No data found");
        }else{
            Node current = head.getNextNode();
            while(current != null){
                System.out.println(current);
                current = current.getNextNode();
            }
        }
    }
    
    public int getSize(){
        return size;
    }
}
