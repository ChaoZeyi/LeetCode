package algorithms;
import java.util.Stack;

/**
 *
 * @author ChaoZeyi
 * Valid Parentheses
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
 *
 */
public class problem_20 {
    public static void main(String[] args)
    {
        boolean res = isValid("(({}[]))");
        System.out.println(res);
    }
    public static boolean isValid(String s) {
        if(s.length() == 0 || s.length() == 1)
            return false;

        char[] str_char = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str_char.length; i++)
        {
            if((str_char[i] == '(') || (str_char[i] == '{') || (str_char[i] == '['))
                stack.push(str_char[i]);
            else if(str_char[i] == ')')
            {
                if(stack.isEmpty() || (stack.peek() != '('))
                    return false;
                else {
                    stack.pop();
                }
            }else if(str_char[i] == '}')
            {
                if(stack.isEmpty() || (stack.peek() != '{'))
                    return false;
                else {
                    stack.pop();
                }
            }else if(str_char[i] == ']')
            {
                if(stack.isEmpty() || (stack.peek() != '['))
                    return false;
                else {
                    stack.pop();
                }
            }
        }
        if(stack.isEmpty())
            return true;
        else
            return false;
    }
}
