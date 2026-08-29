# LeetCode 153 - Find Minimum in Rotated Sorted Array 🚀

## Problem

Given a rotated sorted array, find and return the minimum element in the array.

## Example 1

Input:
nums = [3,4,5,1,2]

output:

1

Example 2

Input:

nums = [4,5,6,7,0,1,2]

Output:

0

Approach

For practice, this solution uses Linear Search.

Initialize minimum with the first element of the array.
Traverse the entire array.
Compare each element with minimum.
If the current element is smaller, update minimum.
Return minimum after traversal.

Complexity

Time Complexity: O(n)
Space Complexity: O(1)
