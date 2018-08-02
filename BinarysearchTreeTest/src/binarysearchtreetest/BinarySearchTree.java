
package binarysearchtreetest;

import java.util.Stack;

public class BinarySearchTree {
    private Node root;

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }
    
    
    
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
    
    public Node delete(int value){
        Node temp = root;
        temp = delete(temp, value);
        return temp;
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
            
            root.setValue(min(root.getRight()));
            
            root.setRight(delete(root.getRight(), root.getValue()));
        }
        return root; 
    }
    
    public int min(Node root){
        Node temp = root;
        if(temp.getLeft() == null){
            return temp.getValue();
        }else{
            return min(temp.getLeft());
        }
    }
    public int max(Node root){
        Node temp = root;
        if(temp.getRight() == null){
            return temp.getValue();
        }else{
            return max(temp.getRight());
        }
    }
    
    public void preOrderRecursive(Node root){
        if(root == null){
            
        }else{
            System.out.println(root.getValue() + ": parent: " + root.getParent());
            preOrderRecursive(root.getLeft());
            preOrderRecursive(root.getRight());
        }
    }
    
    public void inOrderRecursive(Node root){
        if(root == null){
            
        }else{
            inOrderRecursive(root.getLeft());
            System.out.println(root.getValue() + ": parent: " + root.getParent());
            inOrderRecursive(root.getRight());
        }
    }
    
    public void postOrderRecursive(Node root){
        if(root != null){
            postOrderRecursive(root.getLeft());
            postOrderRecursive(root.getRight());
            System.out.println(root.getValue() + ": parent: " + root.getParent());
        }
    }
    
    public void preOrderNonRecursive(Node root){
        Stack<Node> stack = new Stack<>();
        Node node = root;
        stack.push(node);
        while(!stack.isEmpty()){
            Node temp = stack.pop();
            System.out.println(temp.getValue() + ": parent: " + temp.getParent());
            if(temp.getRight() != null){
                stack.push(temp.getRight());
            }
            if(temp.getLeft()!= null){
                stack.push(temp.getLeft());
            }
        }
    }

    public void inOrderNonRecursive(Node root){
        Stack<Node> stack = new Stack<>();
        if(root == null){
            System.out.println(root);
        }else{
            Node node = root;
            while(node != null){
                stack.push(node);
                node = node.getLeft();
            }
        }
        
        while(!stack.isEmpty()){
            Node node = stack.pop();
            System.out.println(node.getValue() + ": parent: " + node.getParent());
            if(node.getRight() != null){
                node = node.getRight();  
                while(node != null){
                    stack.push(node);
                    node = node.getLeft();
                }
            }
        }
    }
    
    public void postOrderNonRecursive(Node root){
        if(root != null){
            Stack<Node> stack = new Stack<>();
            Stack<Node> temp = new Stack<>();
            
            temp.push(root);
            Node node = null;
            
            while(!temp.isEmpty()){
                node = temp.pop();
                stack.push(node);
                
                if(node.getLeft() != null){
                    temp.push(node.getLeft());
                }
                if(node.getRight() != null){
                    temp.push(node.getRight());
                }
            }
            
            while(!stack.isEmpty()){
                Node n = stack.pop();
                System.out.println(n.getValue() + ": parent: " + n.getParent());
            }
        }
    }
}
