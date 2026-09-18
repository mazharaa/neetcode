export function validParentheses(s: string): boolean {
  if (s.length % 2 !== 0) {
    return false;
  }

  const pair = new Map<string, string>([
    [")", "("],
    ["}", "{"],
    ["]", "["],
  ]);

  const stack: string[] = [];

  for (let i = 0; i < s.length; i++) {
    const c = s[i];

    if (c === "(" || c === "{" || c === "[") {
      stack.push(c);
    } else if (stack.length === 0) {
      return false;
    } else {
      const open = stack.pop();

      if (open !== pair.get(c)) {
        return false;
      }
    }
  }

  return stack.length === 0;
}
