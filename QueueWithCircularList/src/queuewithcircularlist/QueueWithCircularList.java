
package queuewithcircularlist;


public class QueueWithCircularList {


    public static void main(String[] args) {
        Queue q = new Queue();
        
        q.enqueue(4);
        q.enqueue(55);
                q.enqueue(4);
        q.enqueue(55);
                q.enqueue(4);
        q.enqueue(55);
                q.enqueue(4);
        q.enqueue(55);
        q.printQueue();
        System.out.println("Size: " + q.size());
    }
    
}
