import { expect, test } from "bun:test";

import { containsDuplicate } from "./contains-duplicate";

test("returns true with duplicate", () => {
  expect(containsDuplicate([1, 2, 3, 1])).toBe(true);
});

test("returns false all unique", () => {
  expect(containsDuplicate([1, 2, 3, 4])).toBe(false);
});

test("returns false for empty array", () => {
  expect(containsDuplicate([])).toBe(false);
});

test("returns false for single element", () => {
  expect(containsDuplicate([1])).toBe(false);
});

test("returns true for two identical elements", () => {
  expect(containsDuplicate([7, 7])).toBe(true);
});

test("returns false for two distinct elements", () => {
  expect(containsDuplicate([1, 2])).toBe(false);
});

test("returns true for adjacent duplicates", () => {
  expect(containsDuplicate([1, 2, 2, 3])).toBe(true);
});

test("returns true when all elements are identical", () => {
  expect(containsDuplicate([5, 5, 5, 5])).toBe(true);
});

test("returns true with negative duplicates", () => {
  expect(containsDuplicate([-1, -2, -3, -1])).toBe(true);
});

test("returns false with distinct negatives", () => {
  expect(containsDuplicate([-1, -2, -3, -4])).toBe(false);
});

test("returns true with zero duplicates", () => {
  expect(containsDuplicate([0, 1, 2, 0])).toBe(true);
});

test("returns true with boundary value duplicates", () => {
  expect(containsDuplicate([-1_000_000_000, 1_000_000_000, -1_000_000_000])).toBe(true);
});

test("returns false with distinct boundary values", () => {
  expect(containsDuplicate([-1_000_000_000, 0, 1_000_000_000])).toBe(false);
});

test("returns true in large array with duplicate at ends", () => {
  const nums = Array.from({ length: 100_000 }, (_, i) => i);
  nums.push(0);
  expect(containsDuplicate(nums)).toBe(true);
});

test("returns false in large array of unique values", () => {
  const nums = Array.from({ length: 100_000 }, (_, i) => i);
  expect(containsDuplicate(nums)).toBe(false);
});
