
package hanoinonrecursive;

public class Node {
    private int disk;
    private int i;
    private int j;
    private int k;
    private Node nextNode;

    public int getDisk() {
        return disk;
    }

    public void setDisk(int disk) {
        this.disk = disk;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getJ() {
        return j;
    }

    public void setJ(int j) {
        this.j = j;
    }

    public int getK() {
        return k;
    }

    public void setK(int k) {
        this.k = k;
    }

    public Node(int disk, int i, int j, int k) {
        this.disk = disk;
        this.i = i;
        this.j = j;
        this.k = k;
    }

    public Node(Node node) {
        this.disk = node.getDisk();
        this.i = node.getI();
        this.j = node.getJ();
        this.k = node.getK();
        
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }
    
    @Override
    public String toString() {
        return String.valueOf(disk);
    }
}
