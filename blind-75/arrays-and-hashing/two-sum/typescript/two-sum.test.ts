import { expect, test } from "bun:test";
import { twoSum } from "./two-sum";

test("Example 1", () => {
  expect(twoSum([3, 4, 5, 6], 7)).toEqual([0, 1]);
});

test("Example 2", () => {
  expect(twoSum([4, 5, 6], 10)).toEqual([0, 2]);
});

test("Example 3 duplicate values", () => {
  expect(twoSum([5, 5], 10)).toEqual([0, 1]);
});

test("No solution returns empty", () => {
  expect(twoSum([1, 2, 3], 100)).toEqual([]);
});

test("Empty array returns empty", () => {
  expect(twoSum([], 5)).toEqual([]);
});

test("Single element returns empty", () => {
  expect(twoSum([1], 1)).toEqual([]);
});

test("Negative numbers", () => {
  expect(twoSum([-3, 4, 3, 90], 0)).toEqual([0, 2]);
});

test("All negatives", () => {
  expect(twoSum([-5, -3, -8], -8)).toEqual([0, 1]);
});

test("Zero pair non-adjacent", () => {
  expect(twoSum([0, 4, 0], 0)).toEqual([0, 2]);
});

test("Same element not reused", () => {
  expect(twoSum([3, 2, 4], 6)).toEqual([1, 2]);
});

test("Pair at the end", () => {
  expect(twoSum([1, 2, 3, 4, 5], 9)).toEqual([3, 4]);
});

test("Large magnitudes", () => {
  expect(twoSum([1000000000, -999999999], 1)).toEqual([0, 1]);
});

test("Multiple answers returns first found", () => {
  expect(twoSum([1, 5, 3, 7], 8)).toEqual([1, 2]);
});
