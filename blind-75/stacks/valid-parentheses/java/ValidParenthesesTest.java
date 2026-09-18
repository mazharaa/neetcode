import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class ValidParenthesesTest {
  private final ValidParentheses solution = new ValidParentheses();

  @Test 
  void example1() {
    assertTrue(solution.validParentheses("[]"));
  }

  @Test 
  void example2() {
    assertTrue(solution.validParentheses("([{}])"));
  }

  @Test 
  void example3() {
    assertFalse(solution.validParentheses("[(])"));
  }

  @Test
  void emptyString() {
    assertTrue(solution.validParentheses(""));
  }

  @Test
  void singleOpener() {
    assertFalse(solution.validParentheses("("));
  }

  @Test
  void singleCloser() {
    assertFalse(solution.validParentheses(")"));
    assertFalse(solution.validParentheses("]"));
    assertFalse(solution.validParentheses("}"));
  }

  @Test
  void closerFirst() {
    assertFalse(solution.validParentheses(")("));
  }

  @Test
  void allClosers() {
    assertFalse(solution.validParentheses("))]]"));
  }

  @Test
  void mismatchedPair() {
    assertFalse(solution.validParentheses("(]"));
  }

  @Test
  void interleaved() {
    assertFalse(solution.validParentheses("([)]"));
  }

  @Test
  void closerWithEmptyStack() {
    assertFalse(solution.validParentheses("())(()"));
  }

  @Test
  void unclosedOpeners() {
    assertFalse(solution.validParentheses("(("));
    assertFalse(solution.validParentheses("([]("));
  }

  @Test
  void sequentialValid() {
    assertTrue(solution.validParentheses("()[]{}"));
  }

  @Test
  void deeplyNestedValid() {
    assertTrue(solution.validParentheses("((([[[{{{}}}]]])))"));
  }

  @Test
  void longRepeatedValid() {
    assertTrue(solution.validParentheses("()".repeat(5000)));
  }
}