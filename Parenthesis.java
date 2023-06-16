import java.util.Stack;

public class Parenthesis {
    public static boolean isBalanced(String parentheses) {
        Stack<Character> stack = new Stack<>();

        for (char c : parentheses.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();
                if ((c == ')' && top != '(') || (c == '}' && top != '{')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String parentheses1 = "{{()}"; 
        String parentheses2 = "{{()}}";
        String parentheses3 = "()";

        if (isBalanced(parentheses1)) {
            System.out.println("BALANCED");
        } else {
            System.out.println("NOT BALANCED");
        }

        if (isBalanced(parentheses2)) {
            System.out.println("BALANCED");
        } else {
            System.out.println("NOT BALANCED");
        }

        if (isBalanced(parentheses3)) {
            System.out.println("BALANCED");
        } else {
            System.out.println("NOT BALANCED");
        }
    }
}
