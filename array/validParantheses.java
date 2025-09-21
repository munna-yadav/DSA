import java.util.Stack;
public class validParantheses {

    static boolean solution(String s){
        Stack<Character> stack = new Stack<>();

        for(char c:s.toCharArray()){
            if(c == '('){
                stack.push('(');
            }
            else if(c =='{'){
                stack.push('}');
            }
            else if(c =='['){
                stack.push(']');
            }
            else if(stack.isEmpty() || stack.pop() != c);
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String parantheses = "({()})";
        boolean result = solution(parantheses);
        System.out.println(result);
    }
}