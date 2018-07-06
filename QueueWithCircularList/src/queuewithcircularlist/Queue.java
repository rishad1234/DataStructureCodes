
package queuewithcircularlist;

public class Queue {
    CirclularList list;


    public Queue() {
        list = new CirclularList();
    }
    
    public void enqueue(int number){
        list.insert(number);
    }
    
    public int dequeue(){
        //return list.deleteNode();
        return 1;
    }

    public void printQueue(){
        list.printNodes();
    }
    
    public int size(){
       return list.getSize();
    }
    
}
