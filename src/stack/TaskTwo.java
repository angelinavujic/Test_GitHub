package stack;

import java.util.Stack;

public class TaskTwo {
	
	public static String checkBrackets(String input) {
        if (input.isEmpty()) {
            return "Fehlerhafte Klammerung!";
        }
        
        Stack<Character> stack = new Stack<>();
        char[] brackets = input.toCharArray();
        
        for (char bracket : brackets) {
            if (bracket == '(' || bracket == '[' || bracket == '{') {
                stack.push(bracket);
            } else if (bracket == ')' || bracket == ']' || bracket == '}') {
                if (stack.isEmpty() || !isMatchingPair(stack.pop(), bracket)) {
                    return "Fehlerhafte Klammerung!";
                }
            }
        }
        
        if (stack.isEmpty()) {
            return "Korrekte Klammerung!";
        } else {
            return "Fehlerhafte Klammerung!";
        }
    }
        
      
    private static boolean isMatchingPair(char opening, char closing) {
        return (opening == '(' && closing == ')') ||
               (opening == '[' && closing == ']') ||
               (opening == '{' && closing == '}');
    }
    
    public static void main(String[] args) {
        String test = "hallo";
        System.out.println(checkBrackets(test)); 
        
    }
}
