
package infixtopostfixtest;

public class InfixToPostfixTest {

    public static void main(String[] args) {
        /*
            its very important to put spaces between the characters
        */
        InfixToPostfix p = new InfixToPostfix("1233 + 2 ^ 3 + 3 * 4");
        System.out.println(p.toPostfix());
        System.out.println(p.evaluatePostFix());
    }
    
}
