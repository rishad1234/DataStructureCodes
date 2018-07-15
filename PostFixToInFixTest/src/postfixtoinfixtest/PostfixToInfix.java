
package postfixtoinfixtest;

import java.util.Queue;
import java.util.Stack;

public class PostfixToInfix {
    private StringBuilder postfix;
    private String infix;
    Stack<String> postStack;

    public PostfixToInfix(String postfix) {
        this.postfix = new StringBuilder(postfix);
        postStack = new Stack<>();
    }
    
    public String toInfix(){
        Stack<String> stack = new Stack<>();
        String reversed = new String(postfix.reverse());
        char[] reversedPostfix = reversed.toCharArray();
        
        for(char character: reversedPostfix){
            stack.push((character + ""));
        }
        while(!stack.isEmpty()){
            if(!isOperator(stack.peek())){
                postStack.push(stack.pop());
            }else {
                if(isOperator(stack.peek())){
                    postStack.push(stack.pop());
                    InfixStringMaking();
                }
            }
        }
        return infix;
    }
    
    public boolean isOperand(char temp){
        return ((temp >= 'a' && temp <= 'z') || (temp >= 'A' && temp <= 'Z'));
    }
    
    public boolean isOperator(String temp){
        return (temp.equals("+") || temp.equals("-") || temp .equals("*") || temp .equals("/"));
    }
    
    public void InfixStringMaking(){
        String operator = postStack.pop();
        String operand2 = postStack.pop();
        String operand1 = postStack.pop();
        String finalString = "(" + operand1 + operator + operand2 + ")";
        
        postStack.push(finalString);
        infix = finalString;
        
    }
}
