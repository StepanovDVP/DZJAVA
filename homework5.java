import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class homework5 {
    public static void main(String[] args) {
        System.out.println(isCorrectParentheses("()")); // true
        System.out.println(isCorrectParentheses("(")); // false
        System.out.println(isCorrectParentheses("())")); // false
        System.out.println(isCorrectParentheses("((()))")); // true
        System.out.println(isCorrectParentheses("()[]{}<>")); // true
        System.out.println(isCorrectParentheses("([)]")); // false
        System.out.println(isCorrectParentheses("][]")); // false
        System.out.println(isCorrectParentheses("[]{<()[]<>>}"));// true


    }

    /**
     * Дана последовательность скобочек. Проверить, что она является корректной.
     */
    public static boolean isCorrectParentheses(String parentheses) {
        char[] ch = parentheses.toCharArray();
        Map<Character, Character> Brackets = new HashMap<>();
        Brackets.put('(', ')');
        Brackets.put('{', '}');
        Brackets.put('<', '>');
        Brackets.put('[', ']');
        Deque<Character> stact = new ArrayDeque<>();
        for (char i: ch
             ) {
            if(Brackets.containsKey(i)){
                stact.push(i);
            } else if (Brackets.containsValue(i)) {
                if (stact.isEmpty() || Brackets.get(stact.pop()) != i)
                    return false;
            }
        }
        return stact.isEmpty();
    }
}