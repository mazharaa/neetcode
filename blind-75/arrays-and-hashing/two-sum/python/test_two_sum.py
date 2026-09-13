from two_sum import two_sum

def test_example1():
  assert two_sum([3, 4, 5, 6], 7) == [0, 1]

def test_example2():
  assert two_sum([4, 5, 6], 10) == [0, 2]

def test_example3_duplicate_values():
  assert two_sum([5, 5], 10) == [0, 1]

def test_no_solution_returns_empty():
  assert two_sum([1, 2, 3], 100) == []

def test_empty_array_returns_empty():
  assert two_sum([], 5) == []

def test_single_element_returns_empty():
  assert two_sum([1], 1) == []

def test_negative_numbers():
  assert two_sum([-3, 4, 3, 90], 0) == [0, 2]

def test_all_negatives():
  assert two_sum([-5, -3, -8], -8) == [0, 1]

def test_zero_pair_non_adjacent():
  assert two_sum([0, 4, 0], 0) == [0, 2]

def test_same_element_not_reused():
  assert two_sum([3, 2, 4], 6) == [1, 2]

def test_pair_at_the_end():
  assert two_sum([1, 2, 3, 4, 5], 9) == [3, 4]

def test_large_magnitudes():
  assert two_sum([1000000000, -999999999], 1) == [0, 1]

def test_multiple_answers_returns_first_found():
  assert two_sum([1, 5, 3, 7], 8) == [1, 2]
