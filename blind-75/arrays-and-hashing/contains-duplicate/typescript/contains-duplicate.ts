export function containsDuplicate(nums: number[]): boolean {
  const mapNums = new Map<number, number>();

  for (const num of nums) {
    if (!mapNums.has(num)) {
      mapNums.set(num, 1);
    } else {
      return true;
    }
  }

  return false;
}
