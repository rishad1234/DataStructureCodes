
package binarysearchtreetest;

public class BinarysearchTreeTest {

    public static void main(String[] args) {
        BinarySearchTree btree = new BinarySearchTree();
        
        for(int i = 1; i <= 100; i+=1){
            btree.insertBST(i);
        }
        
        btree.postOrderRecursive(btree.getRoot());
    }
    
}
