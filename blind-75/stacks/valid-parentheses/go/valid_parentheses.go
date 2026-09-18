package validparentheses

func ValidParentheses(s string) bool {
	if len(s) % 2 != 0 {
		return false
	}

	pair := map[string]string{
		")": "(",
		"}": "{",
		"]": "[",
	}

	stack := []string{}

	for i := 0; i < len(s); i++ {
		c := s[i]

		if c == '(' || c == '{' || c == '[' {
			stack = append(stack, string(c))
		} else if len(stack) == 0 {
			return false
		} else {
			open := stack[len(stack) - 1]
			stack = stack[:len(stack) - 1]
			
			if open != pair[string(c)] {
				return false
			}
		}
	}

	return len(stack) == 0
}