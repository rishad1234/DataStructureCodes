
package binarysearchtreetest;

public class BinarySearchTree {
    private Node root;
    
    public void insertBST(int value){
        Node node = new Node(value);
        if(this.root == null){
            root = node;
        }else{
            Node temp = root;
            while(true){
                if(node.getValue() <= temp.getValue()){
                    if(temp.getLeft() == null){
                        temp.setLeft(node);
                        break;
                    }else{
                        temp = temp.getLeft();
                    }
                }else{
                    if(temp.getRight() == null){
                        temp.setRight(node);
                        break;
                    }else{
                        temp = temp.getRight();
                    }
                }
            }
        }
    }
}
