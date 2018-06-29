
package infixtopostfixtest;

import java.util.Stack;

public class InfixToPostfix {
    private String infix;
    private String postfix;

    public InfixToPostfix(String infix) {
        this.infix = infix;
        this.postfix = "";
    }
    
    public String toPostfix(){
        char[] temp = infix.toCharArray();
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < temp.length; i++){
            if(isOperand(temp[i])){
                postfix += temp[i];
            } else if(temp[i] == '('){
                stack.push(temp[i]);
            } else if(temp[i] == ')'){
                while(!stack.isEmpty() && stack.peek() != '('){
                    postfix += stack.pop();
                }
//                if(!stack.isEmpty() && stack.peek() != '('){
//                    return null;
//                }unnecessary 
                if(!stack.isEmpty()){
                    stack.pop();
                }
            } else if(isOperator(temp[i])){
                if(!stack.isEmpty() && precedence(temp[i]) <= precedence(stack.peek())){
                    postfix += stack.pop();
                }   
                stack.push(temp[i]);
             }
        }
            
        while(!stack.isEmpty()){
            postfix += stack.pop();
        }
        return postfix;
    }
    
    public int precedence(char c){
        switch(c){
            case '+': 
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }
    
    public boolean isOperator(char ch){
        return (ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '^' || ch == '(' || ch == ')');
    }
    
    private boolean isOperand(char ch) {
        return (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z');
    }
}
