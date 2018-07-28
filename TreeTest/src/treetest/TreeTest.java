
package treetest;

public class TreeTest {

    public static void main(String[] args) {
        Node[] node = new Node[8];
        for(int i = 0; i < 8; i++){
            node[i] = new Node(i);
        }
        
        node[0].setLeft(node[1]);
        node[0].setRight(node[2]);
        node[1].setLeft(node[3]);
        node[1].setRight(node[4]);
        node[2].setLeft(node[5]);
        node[2].setRight(node[6]);
        node[6].setLeft(node[7]);
        
        TreeClass tree = new TreeClass();
        
        tree.inOrderNonRecursive(node[0]);
        System.out.println("");
        tree.inOrderRecursive(node[0]);
    }
    
}
