
package stackwithlinkedlist;


public class StackWithLinkedList {


    public static void main(String[] args) {
        Stack stack = new Stack();
        
        stack.push(0);
        stack.push(10);
        stack.push(15);
        stack.push(100);
        stack.push(20);
        stack.push(12);
        stack.printStack();
        System.out.println(stack.getSize());
        System.out.println("poping");
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        
        System.out.println(stack.getSize());
        stack.printStack();
    }
    
}
