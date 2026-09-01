# Check if the Array is Sorted II

## Problem
Given an ArrayList of integers, check whether the array is sorted in non-decreasing order.

## Approach
- Traverse the ArrayList from left to right.
- Compare each element with the next element.
- If `nums[i] > nums[i + 1]`, the array is not sorted.
- Return `false`.
- If no such pair is found, return `true`.

Complexity
Time Complexity: O(n)
Space Complexity: O(1)
Example

Input:
[1, 2, 3, 4, 5]

Output:
true

Input:
[1, 9, 6, 8, 5]

Output:
false