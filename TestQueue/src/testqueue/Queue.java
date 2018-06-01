
package testqueue;

public class Queue {
    private int[] queue;
    private int[] buffer;
    private int front;
    private int back;

    public Queue(int size) {
        this.queue = new int[size];
        this.buffer = new int[size];
        this.front = 0;
        this.back = 0;
    }
    
    public void enqueue(int number){
        if(back == queue.length){
            System.out.println("Queue overflow.");
        }else{
            queue[back] = number;
            back++;
        }
    }
    
    public int dequeue(){
        int number = Integer.MIN_VALUE; ///// shows garbage values when
        if (size() == 0) {              ////size is zero
            System.out.println("Queue is empty.");
        }else{
            number = queue[front];
            front++;
        }
        return number;
    }
    
    public int search(int number){
        System.arraycopy(queue, front, buffer, front, size());
        int i;
        boolean validate = true;
        int bufferFront = front; 
        for(i = front; i < back; i++){
            if(dequeue() == number){
                validate = false;
                break;
            }
            else{
                validate = true;
            }
        }
        front = bufferFront;
        System.arraycopy(buffer, front, queue, front, size());
        if(validate){
            return - 1;
        }else{
            return i + 1;
        }
    }

    public void printQueue(){
        if(size() == 0){
            System.out.println("Queue is empty");
        }
        for(int i = front; i < back; i++){
            System.out.print(queue[i] + " ");
        }
        System.out.println("");
    }
    
    public int size(){
        return back - front;
    }
    
}
