import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Map;

public class ValidParentheses {
  public boolean validParentheses(String s) {
    if (s.length() % 2 != 0) {
      return  false;
    }

    Map<Character, Character> pair = Map.of(')', '(', '}', '{', ']', '[');
    Deque<Character> stack = new ArrayDeque<>();

    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      if (c == '(' || c == '{' || c == '[') {
        stack.push(c);
      } else if (stack.isEmpty()) {
        return false;
      } else {
        char open = stack.pop();
        if (open != pair.get(c)) return false;
      }
    }

    return stack.isEmpty();
  }
}