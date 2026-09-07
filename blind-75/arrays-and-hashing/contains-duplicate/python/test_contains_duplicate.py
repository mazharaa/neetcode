from contains_duplicate import contains_duplicate


def test_returns_true_with_duplicate():
    assert contains_duplicate([1, 2, 3, 1]) is True


def test_returns_false_all_unique():
    assert contains_duplicate([1, 2, 3, 4]) is False


def test_returns_false_for_empty_list():
    assert contains_duplicate([]) is False


def test_returns_false_for_single_element():
    assert contains_duplicate([1]) is False


def test_returns_true_for_two_identical_elements():
    assert contains_duplicate([7, 7]) is True


def test_returns_false_for_two_distinct_elements():
    assert contains_duplicate([1, 2]) is False


def test_returns_true_for_adjacent_duplicates():
    assert contains_duplicate([1, 2, 2, 3]) is True


def test_returns_true_when_all_elements_identical():
    assert contains_duplicate([5, 5, 5, 5]) is True


def test_returns_true_with_negative_duplicates():
    assert contains_duplicate([-1, -2, -3, -1]) is True


def test_returns_false_with_distinct_negatives():
    assert contains_duplicate([-1, -2, -3, -4]) is False


def test_returns_true_with_zero_duplicates():
    assert contains_duplicate([0, 1, 2, 0]) is True


def test_returns_true_with_boundary_value_duplicates():
    assert contains_duplicate([-1_000_000_000, 1_000_000_000, -1_000_000_000]) is True


def test_returns_false_with_distinct_boundary_values():
    assert contains_duplicate([-1_000_000_000, 0, 1_000_000_000]) is False


def test_returns_true_in_large_list_with_duplicate_at_ends():
    nums = list(range(100_000))
    nums.append(0)
    assert contains_duplicate(nums) is True


def test_returns_false_in_large_list_of_unique_values():
    assert contains_duplicate(list(range(100_000))) is False
