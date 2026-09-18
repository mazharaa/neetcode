from valid_parentheses import valid_parentheses

def test_valid_parentheses_example1():
  assert valid_parentheses("[]") is True

def test_valid_parentheses_example2():
  assert valid_parentheses("([{}])") is True

def test_valid_parentheses_example3():
  assert valid_parentheses("[(])") is False

def test_valid_parentheses_empty_string():
  assert valid_parentheses("") is True

def test_valid_parentheses_single_opener():
  assert valid_parentheses("(") is False

def test_valid_parentheses_single_closer():
  assert valid_parentheses(")") is False
  assert valid_parentheses("]") is False
  assert valid_parentheses("}") is False

def test_valid_parentheses_closer_first():
  assert valid_parentheses(")(") is False

def test_valid_parentheses_all_closers():
  assert valid_parentheses("))]]") is False

def test_valid_parentheses_mismatched_pair():
  assert valid_parentheses("(]") is False

def test_valid_parentheses_interleaved():
  assert valid_parentheses("([)]") is False

def test_valid_parentheses_closer_with_empty_stack():
  assert valid_parentheses("())(()") is False

def test_valid_parentheses_unclosed_openers():
  assert valid_parentheses("((") is False
  assert valid_parentheses("([](") is False

def test_valid_parentheses_sequential_valid():
  assert valid_parentheses("()[]{}") is True

def test_valid_parentheses_deeply_nested_valid():
  assert valid_parentheses("((([[[{{{}}}]]])))") is True

def test_valid_parentheses_long_repeated_valid():
  assert valid_parentheses("()" * 5000) is True