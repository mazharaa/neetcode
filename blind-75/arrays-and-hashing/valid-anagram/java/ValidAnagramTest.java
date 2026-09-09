import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class ValidAnagramTest {
  private final ValidAnagram solution = new ValidAnagram();

  @Test
  void validAnagramRacecar() {
    assertTrue(solution.validAnagram("racecar", "carrace"));
  }

  @Test
  void invalidAnagramJarJam() {
    assertFalse(solution.validAnagram("jar", "jam"));
  }

  @Test
  void singleCharEqual() {
    assertTrue(solution.validAnagram("x", "x"));
  }

  @Test
  void validAnagramAnagramNagaram() {
    assertTrue(solution.validAnagram("anagram", "nagaram"));
  }

  @Test
  void validWithRepeats() {
    assertTrue(solution.validAnagram("aacc", "ccaa"));
  }

  @Test
  void sameString() {
    assertTrue(solution.validAnagram("abc", "abc"));
  }

  @Test
  void emptyVsNonEmpty() {
    assertFalse(solution.validAnagram("", "a"));
  }

  @Test
  void prefixButShorter() {
    assertFalse(solution.validAnagram("ab", "a"));
  }

  @Test
  void longerS() {
    assertFalse(solution.validAnagram("abc", "ab"));
  }

  @Test
  void classicInvalid() {
    assertFalse(solution.validAnagram("rat", "car"));
  }

  @Test
  void sameLettersDifferentCounts() {
    assertFalse(solution.validAnagram("aab", "abb"));
  }

  @Test
  void allSameVsMixed() {
    assertFalse(solution.validAnagram("aaaa", "aaab"));
  }

  @Test
  void bothEmpty() {
    assertTrue(solution.validAnagram("", ""));
  }

  @Test
  void singleCharDiffers() {
    assertFalse(solution.validAnagram("x", "y"));
  }

  @Test
  void longRepeatedValid() {
    assertTrue(solution.validAnagram("aaaaaaaaaa", "aaaaaaaaaa"));
  }

  @Test
  void longerT() {
    assertFalse(solution.validAnagram("ab", "abc"));
  }

  @Test
  void distinctPermuted() {
    assertTrue(solution.validAnagram("abcdef", "fedcba"));
  }

  @Test
  void longInvalidAtEnd() {
    assertFalse(solution.validAnagram("a".repeat(50_000) + "b", "a".repeat(50_000) + "c"));
  }
}
