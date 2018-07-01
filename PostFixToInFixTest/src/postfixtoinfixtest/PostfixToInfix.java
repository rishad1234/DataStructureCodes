
package postfixtoinfixtest;

import java.util.Stack;

public class PostfixToInfix {
    private StringBuilder postfix;
    private String infix;
    private String[] temp;

    public PostfixToInfix(String postfix) {
        this.postfix = new StringBuilder(postfix);
        temp = new String[postfix.length()];
    }
    
    public String toInfix(){
        //String[] temp = new String[postfix.length()];
        Stack<String> stack = new Stack<>();
        String reversed = new String(postfix.reverse());
        char[] reversedPostfix = reversed.toCharArray();
        
        for(char character: reversedPostfix){
            stack.push((character + ""));
        }
        int i = 0;
        while(!stack.isEmpty()){
            if(isOperand((stack.peek().toCharArray()[0]))){
                temp[i] = stack.pop();
                i++;
            }else {
                if(isOperator(stack.peek().toCharArray()[0])){
                    temp[i]=stack.pop();
                    i = 1;
                    InfixStringMaking();
                }
            }
        }
        return infix;
    }
    
    public boolean isOperand(char temp){
        return ((temp >= 'a' && temp <= 'z') || (temp >= 'A' && temp <= 'Z'));
    }
    
    public boolean isOperator(char temp){
        return (temp == '+' || temp == '-' || temp == '*' || temp == '/');
    }
    
    public void InfixStringMaking(){
        String finalString = "(" + temp[0] + temp[2] + temp[1] + ")";
        
        for(int i = 0; i < 3; i++){
            temp[i] = "";
        }
        temp[0] = finalString;
        infix = finalString;
        
    }
}
