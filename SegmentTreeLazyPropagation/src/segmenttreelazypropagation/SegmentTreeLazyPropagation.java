
package segmenttreelazypropagation;

import java.util.Scanner;

public class SegmentTreeLazyPropagation {

    static int[] inputArray;
    static Node[] tree;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the number of element of the input array: ");
        int size = input.nextInt();
        
        inputArray = new int[size + 1];
        tree = new Node[size * 3 + 1];
        
        System.out.println("Enter the elements: ");
        for(int i = 1; i <= size; i++){
            inputArray[i] = input.nextInt();
        }
        
        constructSegmentTree(1, 1, size);
        
        for(int i = 1; i < tree.length; i++){
            if(tree[i] != null){
                System.out.println(tree[i]);
            } 
            
        }
        
        update(1, 1, size, 1, 4, 2);
        
        System.out.println("After update: ");

        for(int i = 1; i < tree.length; i++){
            if(tree[i] != null){
                System.out.println(tree[i]);
            } 
            
        }
        
        System.out.println("query: " + query(1, 1, size, 1, 4, 0));
    }
    
    public static void constructSegmentTree(int node, int begin, int end){
        
        try{
            
            if(begin == end){
                tree[node] = new Node(inputArray[begin], 0);
                return;
            }

            int left = node * 2;
            int right = node * 2 + 1;
            int mid = (begin + end) / 2;

            constructSegmentTree(left, begin, mid);
            constructSegmentTree(right, mid + 1, end);

            int temp = tree[left].sum + tree[right].sum;
            tree[node] = new Node(temp, 0);
            
        }catch(NullPointerException e){
            
        }
    }
    
    public static void update(int node, int begin, int end, int range1, int range2, int value){
        
        if(range1 > end || range2 < begin){
            return;
        }
        
        if(begin >= range1 && end <= range2){
        
            tree[node].sum += (end - begin + 1) * value;
            tree[node].propagation += value;
            return;
        }
        
        int left = node * 2;
        int right = node * 2 + 1;
        int mid = (begin +  end) / 2;
        
        update(left, begin, mid, range1, range2, value);
        update(right, mid + 1, end, range1, range2, value);
        
        tree[node].sum = tree[left].sum + tree[right].sum 
                + (end - begin + 1) * tree[node].propagation;
    }
    
    public static int query(int node, int begin, int end, int range1, int range2, int carry){
        
        if(range1 > end || range2 < begin){
            return 0;
        }
        
        if(begin >= range1 && end <= range2){
            return tree[node].sum + carry * (end - begin + 1);
        }
        
        int left = node * 2;
        int right = node * 2 + 1;
        int mid = (begin +  end) / 2;
        
        int leftSum = query(left, begin, mid, range1, range2, carry + tree[node].propagation);
        int rightSum = query(right, mid + 1, end, range1, range2, carry + tree[node].propagation);
        
        return leftSum + rightSum;
    } 
    
}

class Node{
    int sum;
    int propagation;

    public Node(int sum, int propagation) {
        this.sum = sum;
        this.propagation = propagation;
    }

    @Override
    public String toString() {
        return "Node{" + "sum=" + sum + ", propagation=" + propagation + '}';
    }
    
}
