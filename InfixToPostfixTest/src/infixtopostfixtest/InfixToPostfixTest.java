
package infixtopostfixtest;

import java.util.Scanner;

public class InfixToPostfixTest {

    public static void main(String[] args) {
        /*
            its very important to put spaces between the characters
        */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the String(with white spaces between every character): ");
        
        InfixToPostfix p = new InfixToPostfix(input.nextLine());
        System.out.println(p.toPostfix());
        System.out.println(p.evaluatePostFix());
    }
    
}
