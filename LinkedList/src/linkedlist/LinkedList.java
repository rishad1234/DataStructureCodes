
package linkedlist;

public class LinkedList {
    private Node head;
    private int size;

    public LinkedList() {
        head = new Node(Integer.MIN_VALUE);
        head.setNextNode(null);
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
            while(current != null && node.getNumber() > current.getNumber()){
                current = current.getNextNode();
                previousNode = previousNode.getNextNode();
            }
            node.setNextNode(current);
            previousNode.setNextNode(node);
        }
    }
    
    public void deleteNode(int number){
        Node previousNode = head;
        Node current = head.getNextNode();
        boolean isNull = false;
        //int count = 0;
        while(current != null){
            if(number == current.getNumber()){
                while(current != null && number == current.getNumber()){
                    current = current.getNextNode();
                }
                previousNode.setNextNode(current);
            }
            if(current != null){
                current = current.getNextNode();
                previousNode  = previousNode.getNextNode();    
            }             
        }
    }
    public void printNodes(){
        Node current = head.getNextNode();
        while(current != null){
            System.out.println(current);
            current = current.getNextNode();
        }
    }
}
