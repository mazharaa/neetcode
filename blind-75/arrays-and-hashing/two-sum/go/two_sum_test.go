package twosum

import (
	"slices"
	"testing"
)

func TestTwoSum(t *testing.T) {
	tests := []struct {
		name   string
		nums   []int
		target int
		want   []int
	}{
		{"Example 1", []int{3, 4, 5, 6}, 7, []int{0, 1}},
		{"Example 2", []int{4, 5, 6}, 10, []int{0, 2}},
		{"Example 3", []int{5, 5}, 10, []int{0, 1}},
		{"No solution", []int{1, 2, 3}, 100, nil},
		{"Empty slice", []int{}, 5, nil},
		{"Single element", []int{1}, 1, nil},
		{"Negative numbers", []int{-3, 4, 3, 90}, 0, []int{0, 2}},
		{"All negatives", []int{-5, -3, -8}, -8, []int{0, 1}},
		{"Zero pair non-adjacent", []int{0, 4, 0}, 0, []int{0, 2}},
		{"Same element not reused", []int{3, 2, 4}, 6, []int{1, 2}},
		{"Pair at the end", []int{1, 2, 3, 4, 5}, 9, []int{3, 4}},
		{"Large magnitudes", []int{1000000000, -999999999}, 1, []int{0, 1}},
		{"Multiple answers returns first found", []int{1, 5, 3, 7}, 8, []int{1, 2}},
	}

	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			if got := TwoSum(tt.nums, tt.target); !slices.Equal(got, tt.want) {
				t.Errorf("TwoSum(%v, %v) = %v, want %v", tt.nums, tt.target, got, tt.want)
			}
		})
	}
}
