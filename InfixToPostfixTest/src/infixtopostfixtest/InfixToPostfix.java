
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
        String[] temp = infix.split(" ");
        Stack<String> stack = new Stack<>();
        for(String t : temp){
            //t = t.trim();
        }
        for(int i = 0; i < temp.length; i++){
            if(!isOperator(temp[i])){
                postfix += temp[i] + " ";
            }else if(temp[i].equals("(")){
                stack.push(temp[i]);
            }else if(temp[i].equals(")")){
                while(!stack.isEmpty() && !stack.peek().equals("(")){
                    postfix += stack.pop() + " ";
                }
//                if(!stack.isEmpty() && stack.peek() != '('){
//                    return null;
//                }//unnecessary 
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }else if(isOperator(temp[i])){
                while(!stack.isEmpty() && precedence(temp[i]) <= precedence(stack.peek())){
                    postfix += stack.pop() + " ";
                }   
                stack.push(temp[i]);
            }else if(temp[i].equals(" ")){
                
            }
            
        }   
        while(!stack.isEmpty()){
            postfix += stack.pop() + " ";
        }
        return postfix;
    }
    
    public int precedence(String c){
        switch(c){
            case "+": 
            case "-":
                return 1;
            case "*":
            case "/":
                return 2;
            case "^":
                return 3;
        }
        return -1;
    }
    
    public boolean isOperator(String ch){
        return (ch.equals("+") || ch.equals("-") || ch.equals("*") || ch.equals("/") || ch.equals("^") || ch.equals("(") || ch.equals(")"));
    }
    
    private boolean isOperand(char ch) {
        return (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z');
    }
    
    public int evaluatePostFix(){
        String[] values = postfix.split(" ");
//        for(String value : values){
//            System.out.println(value);
//        }
        Stack<Integer> stack = new Stack();
        for(int i = 0; i < values.length; i++){
            if(isOperator(values[i])){
                int num2 = stack.pop();
                int num1 = stack.pop();
                stack.push(applyOperator(num1, num2, values[i]));
            }else{
                stack.push(Integer.parseInt(values[i]));
            }
        }
        return stack.pop();
    }
    
    private int applyOperator(int num1, int num2, String operator){
        switch (operator){
            case "+":
                return num2 + num1;
            case "-":
//                if(num1 < 0){
//                    return num1 - num2;
//                } maybe buggy
                return num1 - num2; /// check this line if the ans is not correct
            case "*":
                return num2 * num1;
            case "/":
                return num2 / num1;
            case "^":
                return (int) Math.pow(num1, num2);
            default:
                return -1;
        }
    }
}

