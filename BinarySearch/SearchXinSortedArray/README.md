# Solved X in Sorted Array

## Problem
Given a sorted array of integers `nums` and a target value, 
return the index of the target if it exists. Otherwise, return `-1`.

## Approach
Used Binary Search.

1. Set `low` to the first index.
2. Set `high` to the last index.
3. Find the middle index.
4. If `nums[mid]` equals the target, return `mid`.
5. If target is greater than `nums[mid]`, search in the right half.
6. Otherwise, search in the left half.
7. If the target is not found, return `-1`.

## Example

Input:
nums = [1, 3, 5, 7, 9]
target = 7

Output:
3

## Complexity

Time Complexity: O(log n)

Space Complexity: O(1)

## Language
Java

## DSA Topic
Binary Search