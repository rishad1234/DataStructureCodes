
package linkedlist;

import java.util.Scanner;

public class LinkedListTest {

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
    
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
                    linkedList.insert(input.nextInt());
                    break;
                case 2:
                    System.out.println("Enter the value of the node to delete: ");
                    int number = input.nextInt();
                    linkedList.deleteNode(number);
                    System.out.println("A node has been deleted");
                    break;
                case 3:
                    System.out.println("Printing the values: ");
                    linkedList.printNodes();
                    break;
                case 4:
                    menu = false;
                    break;
            }
        }
    }
}