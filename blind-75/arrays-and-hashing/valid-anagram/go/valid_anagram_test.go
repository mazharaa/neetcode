package validanagram

import (
	"strings"
	"testing"
)

func TestValidAnagram(t *testing.T) {
	tests := []struct {
		name 	string
		s 		string
		t 		string
		want 	bool
	}{
		{"Valid Anagram with RACE", "racecar", "carrace", true},
		{"Invalid Anagram with JAR adn JAM", "jar", "jam", false},
		{"Invalid Anagram with x", "x", "x", true},
		{"Valid anagram", "anagram", "nagaram", true},
		{"Valid with repeats", "aacc", "ccaa", true},
		{"Same string", "abc", "abc", true},
		{"Single char equal", "x", "x", true},
		{"Empty vs non-empty", "", "a", false},
		{"Prefix but shorter", "ab", "a", false},
		{"Longer s", "abc", "ab", false},
		{"Classic invalid", "rat", "car", false},
		{"Same letters different counts", "aab", "abb", false},
		{"One char differs", "jar", "jam", false},
		{"All same vs mixed", "aaaa", "aaab", false},
		{"Both empty", "", "", true},
		{"Single char differs", "x", "y", false},
		{"Long repeated valid", "aaaaaaaaaa", "aaaaaaaaaa", true},
		{"Longer t", "ab", "abc", false},               // early-return other direction — you only have longer-s
		{"Distinct permuted", "abcdef", "fedcba", true}, // no-repeats path, your valids all repeat
		{"Long invalid at end", strings.Repeat("a", 50000)+"b", strings.Repeat("a", 50000)+"c", false}, // late mismatch + max-len stress — you only havelong-valid
	}

	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			if got := ValidAnagram(tt.s, tt.t); got != tt.want {
				t.Errorf("ValidAnagram(%v, %v) = %v want %v", tt.s, tt.t, got, tt.want)
			}
		})
	}
}