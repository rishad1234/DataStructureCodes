
package treetest;

import java.util.Stack;


public class TreeClass {
    private Node root;

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
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
            Node temp = node;
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
    
    public void inOrderRecursive(Node root){
        if(root == null){
            
        }else{
            inOrderRecursive(root.getLeft());
            System.out.println(root.getValue() + ": parent: " + root.getParent());
            inOrderRecursive(root.getRight());
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
    
    public void preOrderRecursive(Node root){
        if(root == null){
            
        }else{
            System.out.println(root.getValue() + ": parent: " + root.getParent());
            preOrderRecursive(root.getLeft());
            preOrderRecursive(root.getRight());
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
