package hanoinonrecursive;
public class Stack {
    LinkedList list;
    int top;

    public Stack() {
        list = new LinkedList();
        this.top = -1;
    }
    
    public void push(Node node){
        list.insert(node);
    }
    
    public Node pop(){
        return list.deleteNode();
    }
    
    public int search(int number){
        return 1;
    }
    
//    public void printStack(){
//        list.printNodes();
//    } 
    
//    public int getSize(){
//        return list.getSize();
//    }
    
    public boolean isEmpty(){
        return list.isEmpty();
    }
}
