import java.util.ArrayDeque;

public class ValidParantheses {
    public static boolean isValid(String s) {
        ArrayDeque<Character> stack = new ArrayDeque<>() ;
        
        for (Character c : s.toCharArray()) {
            if(c == '(' || c == '{' || c == '[')
                stack.push(c);
            else if(!stack.isEmpty())
            {
                if( c == ')' && stack.peek() == '(')
                    stack.pop() ;
                else if( c == '}' && stack.peek() == '{')
                    stack.pop() ;
                else if( c == ']' && stack.peek() == '[')
                    stack.pop() ;
                else 
                    return false ;

            }
            else return false ;
        }
        return stack.isEmpty() ;
    }
    public static void main(String[] args) {
        System.out.println(isValid("(])"));
    }
}
