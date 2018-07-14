
package infixtopostfixtest;

public class InfixToPostfixTest {

    public static void main(String[] args) {
        InfixToPostfix p = new InfixToPostfix("a+(b+c)*d");
        System.out.println(p.toPostfix());
    }
    
}
