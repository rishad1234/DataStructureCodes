package teststack;
import java.util.Scanner;
public class TestStack {

    public static void main(String[] args) {
        
        Stack stack= new Stack(4);
        Scanner input= new Scanner(System.in);
        boolean menu=true;
        int choice;
        
        while(menu==true){
            System.out.println("Menu");
            System.out.println("1.Push      2.Pop");
            System.out.println("3.Display   3.Search    5.Exit");
            System.out.println("");
            System.out.println("Enter your choice: ");
            
            choice=input.nextInt();
            
            switch(choice){
                case 1:
                    System.out.println("Enter a number. ");
                    stack.push(input.nextInt());
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    System.out.println("Printing the values: ");
                    stack.printStack();
                    break;
                case 4:
                    System.out.println("Enter the number: ");
                    int number = input.nextInt();
                    System.out.println("position: " + stack.search(number));
                    break;
                case 5:
                    menu = false;
                    break;
            }
        }      
    } 
}
