package containsduplicate

import "testing"

func TestContainsDuplicate(t *testing.T) {
	tests := []struct {
		name string
		nums []int
		want bool
	}{
		{"duplicate", []int{1, 2, 3, 1}, true},
		{"all unique", []int{1, 2, 3, 4}, false},
		{"empty", []int{}, false},
		{"single element", []int{1}, false},
		{"two identical", []int{7, 7}, true},
		{"adjacent duplicates", []int{1, 2, 2, 3}, true},
		{"all identical", []int{5, 5, 5, 5}, true},
		{"negative duplicates", []int{-1, -2, -3, -1}, true},
		{"zero duplicates", []int{0, 1, 2, 0}, true},
	}

	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			if got := ContainsDuplicate(tt.nums); got != tt.want {
				t.Errorf("ContainsDuplicate(%v) = %v, want %v", tt.nums, got, tt.want)
			}
		})
	}
}
