package teststack;
public class Stack {
    private int[] stack;
    int top;
    private int[] buffer;

    public Stack(int size) {
        this.stack = new int[size];
        this.buffer = new int[size];
        this.top = -1;
    }
    
    public void push(int number){
        if(top == stack.length - 1){
            System.out.println("Stack is full");
        }else{
            stack[++top] = number;
        }
    }
    
    public int pop(){
        if(top == -1){
            System.out.println("Stack is empty");
            return Integer.MIN_VALUE;
        }else{
            return stack[top--];
        }
    }
    
    public int search(int number){
        int i;
        boolean counter = true;
        int bufferSize = top;
        System.arraycopy(stack, 0, buffer, 0, top + 1);
        if(top == -1){
            return -1;
        }else{
            for(i = top; i >= 0; i--){
                if(pop() == number){
                    counter = false;
                    break;
                }else{
                    counter = true;
                }
            }
        }
        System.arraycopy(buffer, 0, stack, 0, bufferSize + 1);
        top = bufferSize;
        if(counter){
            return -1;
        }
        return i + 1;
    }
    
    public void printStack(){
        for(int i = top; i >= 0; i--){
            System.out.print(stack[i] + " ");
        }
        System.out.println("");
    } 
}
