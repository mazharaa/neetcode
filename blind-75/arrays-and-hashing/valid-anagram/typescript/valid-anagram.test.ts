import { expect, test } from "bun:test";
import { validAnagram } from "./valid-anagram";

test("Valid Anagram with RACE", () => {
  expect(validAnagram("racecar", "carrace")).toBe(true);
});

test("Invalid Anagram with JAR adn JAM", () => {
  expect(validAnagram("jar", "jam")).toBe(false);
});

test("Invalid Anagram with x", () => {
  expect(validAnagram("x", "x")).toBe(true);
});

test("Valid anagram", () => {
  expect(validAnagram("anagram", "nagaram")).toBe(true);
});

test("Valid with repeats", () => {
  expect(validAnagram("aacc", "ccaa")).toBe(true);
});

test("Same string", () => {
  expect(validAnagram("abc", "abc")).toBe(true);
});

test("Single char equal", () => {
  expect(validAnagram("x", "x")).toBe(true);
});

test("Empty vs non-empty", () => {
  expect(validAnagram("", "a")).toBe(false);
});

test("Prefix but shorter", () => {
  expect(validAnagram("ab", "a")).toBe(false);
});

test("Longer s", () => {
  expect(validAnagram("abc", "ab")).toBe(false);
});

test("Classic invalid", () => {
  expect(validAnagram("rat", "car")).toBe(false);
});

test("Same letters different counts", () => {
  expect(validAnagram("aab", "abb")).toBe(false);
});

test("One char differs", () => {
  expect(validAnagram("jar", "jam")).toBe(false);
});

test("All same vs mixed", () => {
  expect(validAnagram("aaaa", "aaab")).toBe(false);
});

test("Both empty", () => {
  expect(validAnagram("", "")).toBe(true);
});

test("Single char differs", () => {
  expect(validAnagram("x", "y")).toBe(false);
});

test("Long repeated valid", () => {
  expect(validAnagram("aaaaaaaaaa", "aaaaaaaaaa")).toBe(true);
});

test("Longer t", () => {
  expect(validAnagram("ab", "abc")).toBe(false);
});

test("Distinct permuted", () => {
  expect(validAnagram("abcdef", "fedcba")).toBe(true);
});

test("Long invalid at end", () => {
  expect(validAnagram("a".repeat(50000) + "b", "a".repeat(50000) + "c")).toBe(false);
});
