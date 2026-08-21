# Contains Duplicate

LeetCode 217 - Contains Duplicate

## Problem

Given an integer array `nums`, return `true` if any value appears at least twice in the array.

Return `false` if every element in the array is unique.

## Example

Input:

[1, 2, 3, 1]

Output:

true

## Approach

First, sort the array using `Arrays.sort()`.

After sorting, duplicate elements will come next to each other.

For example:

[1, 3, 2, 1]

After sorting:

[1, 1, 2, 3]

Then compare adjacent elements.

- If `nums[i] == nums[i + 1]`, return `true`.
- If no duplicate is found, return `false`.

## Complexity

Time Complexity: O(n log n)

Space Complexity: O(1)

## Key Concepts

- Arrays
- Sorting
- Duplicate Detection
- Array Traversal