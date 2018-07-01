package stackwithlinkedlist;
public class Stack {
    LinkedList list;
    int top;

    public Stack() {
        list = new LinkedList();
        this.top = -1;
    }
    
    public void push(int number){
        list.insert(number);
    }
    
    public int pop(){
        return list.deleteNode();
    }
    
    public int search(int number){
        return 1;
    }
    
    public void printStack(){
        list.printNodes();
    } 
    
    public int getSize(){
        return list.getSize();
    }
}
