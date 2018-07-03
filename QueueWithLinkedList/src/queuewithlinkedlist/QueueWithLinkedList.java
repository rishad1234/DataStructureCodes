
package queuewithlinkedlist;

public class QueueWithLinkedList {

    public static void main(String[] args) {
        Queue queue = new Queue();
        
        queue.enqueue(10);
        queue.enqueue(4);
        queue.enqueue(11);
        queue.enqueue(124);
        queue.enqueue(454);
        queue.enqueue(33);
        queue.enqueue(21);
        queue.printQueue();
        System.out.println("size: " + queue.size());
        
        System.out.println("dequeue check:");
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        queue.printQueue();
        System.out.println("size: " + queue.size());
        
        queue.enqueue(454);
        queue.enqueue(33);
        queue.enqueue(21);
        queue.printQueue();
        System.out.println("size: " + queue.size());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        queue.printQueue();
        System.out.println("size: " + queue.size());
    }
    
}
