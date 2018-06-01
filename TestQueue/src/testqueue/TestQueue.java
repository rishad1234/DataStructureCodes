package testqueue;

import java.util.Scanner;

public class TestQueue {

    public static void main(String[] args) {
        
        Queue queue=new Queue(4);
        Scanner input=new Scanner(System.in);
        boolean menu=true;
        int choice;
        
        while(menu==true){
            System.out.println("Menu");
            System.out.println("1.Enqueue   2.Dequeue");
            System.out.println("3.Display   4.Search    5.Exit");
            System.out.println("");
            System.out.println("Enter your choice: ");
            
            choice=input.nextInt();
            
            switch(choice){
                case 1:
                    System.out.println("Enter a number. ");
                    queue.enqueue(input.nextInt());
                    break;
                case 2:
                    queue.dequeue();
                    break;
                case 3:
                    queue.printQueue();
                    break;
                case 4:
                    System.out.println("Enter a number to search: ");
                    int number = input.nextInt();
                    System.out.println("Position: " + queue.search(number));
                    break;
                case 5: 
                    menu = false;
                    break;
                
            }
        }
    }
    
}
