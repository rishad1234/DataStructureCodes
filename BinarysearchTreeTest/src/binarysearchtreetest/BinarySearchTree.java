
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
    
    public void delete(int value){
        Node temp = root;
        temp = delete(temp, value);
    }
    
    private Node delete(Node root, int value){
        if(root == null){
            return root;
        }
        if(value < root.getValue()){
            root.setLeft(delete(root.getLeft(), value));
        }else if(value > root.getValue()){
            root.setRight(delete(root.getRight(), value));
        }else{
            if(root.getLeft() == null){
                return root.getRight();
            }else if(root.getRight() == null){
                return root.getLeft();
            }
            
            root.setValue(root.getRight().min());
            
            root.setRight(delete(root.getRight(), root.getValue()));
        }
        return root; 
    }
}
