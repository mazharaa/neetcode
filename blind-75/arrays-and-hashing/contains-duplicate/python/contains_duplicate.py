def contains_duplicate(nums: list[int]) -> bool:
  mapNums = {}
  for num in nums:
    if num in mapNums:
      return True
    else:
      mapNums[num] = 1
    
  return False