
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
        //list.delete();
        return list.delete();
    }

    public void printQueue(){
        list.printNodes();
    }
    
    public int size(){
       return list.getSize();
    }
    
}
