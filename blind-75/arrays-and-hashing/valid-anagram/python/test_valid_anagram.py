from valid_anagram import valid_anagram


def test_valid_anagram_with_race():
    assert valid_anagram('racecar', 'carrace') is True


def test_invalid_anagram_with_jar_and_jam():
    assert valid_anagram('jar', 'jam') is False


def test_valid_anagram_with_x():
    assert valid_anagram('x', 'x') is True


def test_valid_anagram_anagram_nagaram():
    assert valid_anagram('anagram', 'nagaram') is True


def test_valid_with_repeats():
    assert valid_anagram('aacc', 'ccaa') is True


def test_same_string():
    assert valid_anagram('abc', 'abc') is True


def test_empty_vs_non_empty():
    assert valid_anagram('', 'a') is False


def test_prefix_but_shorter():
    assert valid_anagram('ab', 'a') is False


def test_longer_s():
    assert valid_anagram('abc', 'ab') is False


def test_classic_invalid():
    assert valid_anagram('rat', 'car') is False


def test_same_letters_different_counts():
    assert valid_anagram('aab', 'abb') is False


def test_all_same_vs_mixed():
    assert valid_anagram('aaaa', 'aaab') is False


def test_both_empty():
    assert valid_anagram('', '') is True


def test_single_char_differs():
    assert valid_anagram('x', 'y') is False


def test_long_repeated_valid():
    assert valid_anagram('aaaaaaaaaa', 'aaaaaaaaaa') is True


def test_longer_t():
    assert valid_anagram('ab', 'abc') is False


def test_distinct_permuted():
    assert valid_anagram('abcdef', 'fedcba') is True


def test_long_invalid_at_end():
    assert valid_anagram('a' * 50000 + 'b', 'a' * 50000 + 'c') is False
