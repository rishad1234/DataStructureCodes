
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
//                if(node != null){
//                    //node.setParent(stack.peek());
//                }
            }
        }
        
        while(!stack.isEmpty()){
            Node node = stack.pop();
            Node temp = node;
            System.out.println(node.getValue() + ": parent: " + node.getParent());
            if(node.getRight() != null){
 
                node = node.getRight();
//                node.setParent(temp);
                
                while(node != null){
                    stack.push(node);
                    node = node.getLeft();
//                    if(node != null){
//                        //node.setParent(stack.peek());
//                    }
                }
            }
        }
    }
    
    public void inOrderRecursive(Node root){
        if(root == null){
            //System.out.println(root.getValue() + ": parent: " + root.getParent());
        }else{
            inOrderRecursive(root.getLeft());
            System.out.println(root.getValue() + ": parent: " + root.getParent());
            inOrderRecursive(root.getRight());
        }
        
        
    }
}
