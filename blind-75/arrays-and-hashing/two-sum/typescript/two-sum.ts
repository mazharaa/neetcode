export function twoSum(nums: number[], target: number): number[] {
  const diff = new Map<number, number>();
  const ans: number[] = [];

  for (let i = 0; i < nums.length; i++) {
    if (diff.has(target - nums[i])) {
      ans.push(diff.get(target - nums[i])!, i);

      break;
    }

    diff.set(nums[i], i);
  }

  return ans;
}
