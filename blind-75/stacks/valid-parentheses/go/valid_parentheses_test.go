package validparentheses

import (
	"strings"
	"testing"
)

func TestValidParentheses(t *testing.T) {
	tests := []struct {
		name	string
		s			string
		want	bool
	} {
		{"Example 1", "[]", true},
		{"Example 2", "([{}])", true},
		{"Example 3", "[(])", false},
		{"Empty string", "", true},
		{"Single opener", "(", false},
		{"Single closer )", ")", false},
		{"Single closer ]", "]", false},
		{"Single closer }", "}", false},
		{"Closer first", ")(", false},
		{"All closers", "))]]", false},
		{"Mismatched pair", "(]", false},
		{"Interleaved", "([)]", false},
		{"Closer with empty stack", "())(()", false},
		{"Unclosed openers", "((", false},
		{"Unclosed openers with prefix", "([](", false},
		{"Sequential valid", "()[]{}", true},
		{"Deeply nested valid", "((([[[{{{}}}]]])))", true},
		{"Long repeated valid", strings.Repeat("()", 5000), true},
	}

	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			if got := ValidParentheses(tt.s); got != tt.want {
				t.Errorf("ValidParentheses(%v) = %v want %v", tt.s, got, tt.want)
			}
		})
	}
}