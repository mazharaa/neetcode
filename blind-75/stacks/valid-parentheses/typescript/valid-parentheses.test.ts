import { expect, test } from "bun:test";
import { validParentheses } from "./valid-parentheses";

test("Example 1", () => {
  expect(validParentheses("[]")).toBe(true);
});

test("Example 2", () => {
  expect(validParentheses("([{}])")).toBe(true);
});

test("Example 3", () => {
  expect(validParentheses("[(])")).toBe(false);
});

test("empty string", () => {
  expect(validParentheses("")).toBe(true);
});

test("single opener", () => {
  expect(validParentheses("(")).toBe(false);
});

test("single closer", () => {
  expect(validParentheses(")")).toBe(false);
  expect(validParentheses("]")).toBe(false);
  expect(validParentheses("}")).toBe(false);
});

test("closer first", () => {
  expect(validParentheses(")(")).toBe(false);
});

test("all closers", () => {
  expect(validParentheses("))]]")).toBe(false);
});

test("mismatched pair", () => {
  expect(validParentheses("(]")).toBe(false);
});

test("interleaved", () => {
  expect(validParentheses("([)]")).toBe(false);
});

test("closer with empty stack", () => {
  expect(validParentheses("())(()")).toBe(false);
});

test("unclosed openers", () => {
  expect(validParentheses("((")).toBe(false);
  expect(validParentheses("([](")).toBe(false);
});

test("sequential valid", () => {
  expect(validParentheses("()[]{}")).toBe(true);
});

test("deeply nested valid", () => {
  expect(validParentheses("((([[[{{{}}}]]])))")).toBe(true);
});

test("long repeated valid", () => {
  expect(validParentheses("()".repeat(5000))).toBe(true);
});
