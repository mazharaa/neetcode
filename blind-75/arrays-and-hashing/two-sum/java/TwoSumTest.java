import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

public class TwoSumTest {
  private final TwoSum solution = new TwoSum();

  @Test
  void example1() {
    assertArrayEquals(new int[] {0, 1}, solution.twoSum(new int[] {3, 4, 5, 6}, 7));
  }

  @Test
  void example2() {
    assertArrayEquals(new int[] {0, 2}, solution.twoSum(new int[] {4, 5, 6}, 10));
  }

  @Test
  void example3DuplicateValues() {
    assertArrayEquals(new int[] {0, 1}, solution.twoSum(new int[] {5, 5}, 10));
  }

  @Test
  void noSolutionReturnsNull() {
    assertNull(solution.twoSum(new int[] {1, 2, 3}, 100));
  }

  @Test
  void emptyArrayReturnsNull() {
    assertNull(solution.twoSum(new int[] {}, 5));
  }

  @Test
  void singleElementReturnsNull() {
    assertNull(solution.twoSum(new int[] {1}, 1));
  }

  @Test
  void negativeNumbers() {
    assertArrayEquals(new int[] {0, 2}, solution.twoSum(new int[] {-3, 4, 3, 90}, 0));
  }

  @Test
  void allNegatives() {
    assertArrayEquals(new int[] {0, 1}, solution.twoSum(new int[] {-5, -3, -8}, -8));
  }

  @Test
  void zeroPairNonAdjacent() {
    assertArrayEquals(new int[] {0, 2}, solution.twoSum(new int[] {0, 4, 0}, 0));
  }

  @Test
  void sameElementNotReused() {
    assertArrayEquals(new int[] {1, 2}, solution.twoSum(new int[] {3, 2, 4}, 6));
  }

  @Test
  void pairAtTheEnd() {
    assertArrayEquals(new int[] {3, 4}, solution.twoSum(new int[] {1, 2, 3, 4, 5}, 9));
  }

  @Test
  void largeMagnitudes() {
    assertArrayEquals(new int[] {0, 1}, solution.twoSum(new int[] {1000000000, -999999999}, 1));
  }

  @Test
  void multipleAnswersReturnsFirstFound() {
    assertArrayEquals(new int[] {1, 2}, solution.twoSum(new int[] {1, 5, 3, 7}, 8));
  }
}
