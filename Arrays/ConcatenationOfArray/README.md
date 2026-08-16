# Concatenation of Array

LeetCode 1929 - Concatenation of Array

## Problem
Given an integer array `nums` of length `n`, create an array `ans` of length `2n`
where `ans` is the concatenation of two `nums` arrays.

## Example

Input:
[1, 2, 1]

Output:
[1, 2, 1, 1, 2, 1]

## Approach
Create an answer array of size `2 * nums.length`.

For every element:
- Store it at `ans[i]`
- Store it again at `ans[i + nums.length]`

## Complexity

Time Complexity: O(n)

Space Complexity: O(n)