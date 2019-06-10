
package segmenttree;

import java.util.Scanner;

/**
 *
 * @author rishad
 */
public class SegmentTree {

    static int[] inputArray;
    static int[] tree;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the number of element of the input array: ");
        int size = input.nextInt();
        
        inputArray = new int[size + 1];
        tree = new int[size * 3 + 1];
        
        System.out.println("Enter the elements: ");
        for(int i = 1; i <= size; i++){
            inputArray[i] = input.nextInt();
        }
        
        constructSegmentTree(1, 1, size);
        
//        for(int i = 0; i < tree.length; i++){
//            System.out.println(tree[i]);
//        }
        
        System.out.println("query: ");
        System.out.println(query(1, 1, size, 2, 5));
        
        System.out.println("update: ");
        update(1, 1, size, 2, 10);
        
        System.out.println("tree: ");
        for(int i = 0; i < tree.length; i++){
            System.out.println(tree[i]);
        }        
                
    }
    
    public static void constructSegmentTree(int node, int begin, int end){
        
        if(begin == end){
            tree[node] = inputArray[begin];
            return;
        }
        
        int left = node * 2;
        int right = node * 2 + 1;
        int mid = (begin + end) / 2;
        
        constructSegmentTree(left, begin, mid);
        constructSegmentTree(right, mid + 1, end);
        
        tree[node] = tree[left] + tree[right];
    }
    
    public static int query(int node, int begin, int end, int range1, int range2){
        
        if(range1 > end || range2 < begin){
            return 0;
        }
        
        if(begin >= range1 && end <= range2){
            return tree[node];
        }
        
        int left = node * 2;
        int right = node * 2 + 1;
        int mid = (begin +  end) / 2;
        
        int leftSum = query(left, begin, mid, range1, range2);
        int rightSum = query(right, mid + 1, end, range1, range2);
        
        return leftSum + rightSum;
    }
    
    public static void update(int node, int begin, int end, int position, int value){
        
        if(position > end || position < begin){
            return;
        }
        
        if(begin >= position && end <= position){
            tree[node] = value;
            return;
        }
        
        int left = node * 2;
        int right = node * 2 + 1;
        int mid = (begin +  end) / 2;
        
        update(left, begin, mid, position, value);
        update(right, mid + 1, end, position, value);
        
        tree[node] = tree[left] + tree[right];
    }
}
