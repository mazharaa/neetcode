def two_sum(nums: list[int], target: int) -> list[int]:
  diff = {}
  ans = []

  for i in range(len(nums)):
    if target - nums[i] in diff:
      ans.append(diff.get(target - nums[i]))
      ans.append(i)

      break

    diff[nums[i]] = i

  return ans