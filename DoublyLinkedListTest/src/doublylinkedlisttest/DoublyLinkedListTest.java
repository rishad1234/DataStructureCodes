
package doublylinkedlisttest;

import java.util.Scanner;

public class DoublyLinkedListTest {

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
    
        Scanner input = new Scanner(System.in);
        boolean menu = true;
        int choice;
        
        while(menu == true){
            System.out.println("Menu");
            System.out.println("1.Insert                2.Delete");
            System.out.println("3.Display (forward)     4.Display (backward)");
            System.out.println("5.Exit");
            System.out.println("");
            System.out.println("Enter your choice: ");
            
            choice=input.nextInt();
            
            switch(choice){
                case 1:
                    System.out.println("Enter a number. ");
                    list.insert(input.nextInt());
                    break;
                case 2:
                    System.out.println("Enter the value of the node to delete: ");
                    int number = input.nextInt();
                    list.delete(number);
                    System.out.println("A node has been deleted");
                    break;
                case 3:
                    System.out.println("Printing the values in forward: ");
                    list.printListForward();
                    break;
                    
                case 4: 
                    System.out.println("Printing the values in backward: ");
                    list.printListBackward();
                    break;
                case 5:
                    menu = false;
                    break;
            }
        }
    }
    
}
