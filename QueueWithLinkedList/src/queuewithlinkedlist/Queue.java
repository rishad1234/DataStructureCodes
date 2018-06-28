
package queuewithlinkedlist;

public class Queue {
    LinkedList list;


    public Queue() {
        list = new LinkedList();
    }
    
    public void enqueue(int number){
        list.insert(number);
    }
    
    public int dequeue(){
        return list.deleteNode();
    }

    public void printQueue(){
        list.printNodes();
    }
    
    public int size(){
       return list.getSize();
    }
    
}
