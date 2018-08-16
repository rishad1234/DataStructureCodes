
package binarysearchtreetest;

import java.util.Scanner;

public class BinarysearchTreeTest {

    public static void main(String[] args) {
        BinarySearchTree binarytree = new BinarySearchTree();
    
        Scanner input = new Scanner(System.in);
        boolean menu = true;
        int choice;
        
        while(menu == true){
            System.out.println("Menu");
            System.out.println("1.Insert      2.Delete");
            System.out.println("3.Display     4.Exit");
            System.out.println("");
            System.out.println("Enter your choice: ");
            
            choice=input.nextInt();
            
            switch(choice){
                case 1:
                    System.out.println("Enter a number. ");
                    binarytree.insertBST(input.nextInt());
                    break;
                case 2:
                    System.out.println("Enter the value of the node to delete: ");
                    int number = input.nextInt();
                    binarytree.delete(number);
                    System.out.println("A node has been deleted");
                    break;
                case 3:
                    System.out.println("Printing the values: ");
                    System.err.println("pre Order: ");
                    binarytree.preOrderRecursive(binarytree.getRoot());
                    break;
                case 4:
                    System.out.println("Enter the value to search: ");
                    System.out.println("search : " + binarytree.search(input.nextInt(), binarytree.getRoot()));
                    break;
                default:
                    menu = false;
                    break;
            }
        }
    }
    
}
