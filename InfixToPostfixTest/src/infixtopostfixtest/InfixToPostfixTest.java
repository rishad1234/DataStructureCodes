/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infixtopostfixtest;

/**
 *
 * @author Admin
 */
public class InfixToPostfixTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        InfixToPostfix p = new InfixToPostfix("a+b+c*d");
        System.out.println(p.toPostfix());
    }
    
}
