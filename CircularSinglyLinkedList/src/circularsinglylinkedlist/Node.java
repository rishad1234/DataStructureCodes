
package circularsinglylinkedlist;

public class Node {
    private int number;
    private Node previous;
    private Node next;

    public Node() {
    
    }
    
    public Node(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
    public boolean isNextNull(){
        return next == null;
    }

    @Override
    public String toString() {
        return "Node{" + "number=" + number + '}';
    }
    
}
