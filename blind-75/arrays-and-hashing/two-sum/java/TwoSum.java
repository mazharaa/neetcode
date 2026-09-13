import java.util.HashMap;

public class TwoSum {
  public int[] twoSum(int[] nums, int target) {
    HashMap<Integer, Integer> diff = new HashMap<>();

    for (int i = 0; i < nums.length; i++) {
      if (diff.containsKey(target - nums[i])) {
        return new int[] {diff.get(target - nums[i]), i};
      }

      diff.put(nums[i], i);
    }

    return null;
  }
}
