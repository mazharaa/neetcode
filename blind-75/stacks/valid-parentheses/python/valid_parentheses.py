def valid_parentheses(s: str) -> bool:
  if len(s) % 2 != 0:
    return False

  pair = {")": "(", "}": "{", "]": "["}
  stack = []

  for i in range(len(s)):
    c = s[i]

    if c == "(" or c == "{" or c == "[":
      stack.append(c)
    elif len(stack) == 0:
      return False
    else:
      open = stack.pop()
      if open != pair.get(c): return False

  return len(stack) == 0