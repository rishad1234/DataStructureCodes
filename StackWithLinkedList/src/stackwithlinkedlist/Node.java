
package stackwithlinkedlist;

public class Node {
    private int number;
    private Node nextNode;

    public Node(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }
    
    @Override
    public String toString() {
        return "Node" + " number=" + number;
    } 
}
