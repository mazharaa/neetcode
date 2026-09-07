import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class ContainsDuplicateTest {
  private final ContainsDuplicate solution = new ContainsDuplicate();

  @Test
  void emptyArrayReturnFalse() {
    assertFalse(solution.containsDuplicate(new int[] {}));
  }

  @Test
  void returnsTrueWithDuplicate() {
    assertTrue(solution.containsDuplicate(new int[] {1, 2, 3, 1}));
  }

  @Test
  void singleElementReturnsFalse() {
    assertFalse(solution.containsDuplicate(new int[] {1}));
  }

  @Test
  void twoIdenticalReturnsTrue() {
    assertTrue(solution.containsDuplicate(new int[] {7, 7}));
  }

  @Test
  void twoDistinctReturnsFalse() {
    assertFalse(solution.containsDuplicate(new int[] {1, 2}));
  }

  @Test
  void adjacentDuplicateReturnsTrue() {
    assertTrue(solution.containsDuplicate(new int[] {1, 2, 2, 3}));
  }

  @Test
  void allIdenticalReturnsTrue() {
    assertTrue(solution.containsDuplicate(new int[] {5, 5, 5, 5}));
  }

  @Test
  void negativeDuplicateReturnsTrue() {
    assertTrue(solution.containsDuplicate(new int[] {-1, -2, -3, -1}));
  }

  @Test
  void distinctNegativesReturnsFalse() {
    assertFalse(solution.containsDuplicate(new int[] {-1, -2, -3, -4}));
  }

  @Test
  void zeroDuplicateReturnsTrue() {
    assertTrue(solution.containsDuplicate(new int[] {0, 1, 2, 0}));
  }

  @Test
  void boundaryDuplicateReturnsTrue() {
    assertTrue(solution.containsDuplicate(new int[] {-1_000_000_000, 1_000_000_000, -1_000_000_000}));
  }

  @Test
  void distinctBoundaryReturnsFalse() {
    assertFalse(solution.containsDuplicate(new int[] {-1_000_000_000, 0, 1_000_000_000}));
  }

  @Test
  void largeUniqueReturnsFalse() {
    int[] nums = new int[100_000];
    for (int i = 0; i < nums.length; i++) {
      nums[i] = i;
    }
    assertFalse(solution.containsDuplicate(nums));
  }

  @Test
  void largeDuplicateAtEndsReturnsTrue() {
    int[] nums = new int[100_001];
    for (int i = 0; i < 100_000; i++) {
      nums[i] = i;
    }
    nums[100_000] = 0;
    assertTrue(solution.containsDuplicate(nums));
  }
}
