import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
  public boolean containsDuplicate(int[] nums) {
    Set<Integer> setNums = new HashSet<>();

    for (int num : nums) {
      if (!setNums.add(num)) {
        return true;
      }
    }

    return false;
  }
}
