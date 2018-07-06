
package queuewithcircularlist;


public class QueueWithCircularList {


    public static void main(String[] args) {
        Queue q = new Queue();
//        
//        q.enqueue(4);
//        q.enqueue(55);
//        q.enqueue(4);
//        q.enqueue(55);
//        q.enqueue(4);
//        q.enqueue(55);
//        q.enqueue(4);
//        q.enqueue(55);
//        q.printQueue();
//        System.out.println("Size: " + q.size());
//        
//        System.out.println("delete: ");
//        q.dequeue();
//        q.dequeue();
//        q.dequeue();
//        q.dequeue();
//        q.dequeue();
//        q.dequeue();
//        q.dequeue();
//        q.dequeue();
//        q.dequeue();
//        q.dequeue();
//        
//        q.printQueue();
//        System.out.println("Size: " + q.size());
        
        for(int i = 0; i < 10; i++){
            q.enqueue(i);
        }
        q.printQueue();
        System.out.println("Size: " + q.size());
        
        for(int j = 0; j < 11; j++){
            q.dequeue();
        }
        q.printQueue();
        System.out.println("Size: " + q.size());
    }
    
}
