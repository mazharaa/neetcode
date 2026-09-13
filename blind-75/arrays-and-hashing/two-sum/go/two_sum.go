package twosum

func TwoSum(nums []int, target int) []int {
	diff := make(map[int]int)
	var ans []int

	for i := 0; i < len(nums); i++ {
		if _, exist := diff[target-nums[i]]; exist {
			ans = append(ans, diff[target-nums[i]], i)

			break
		}

		diff[nums[i]] = i
	}

	return ans
}
