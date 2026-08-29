# LeetCode 35 - Search Insert Position 🚀

## Problem

Given a sorted array of distinct integers and a target value, return the index if the target is found.

If the target is not found, return the index where it would be inserted in order.

You must write an algorithm with O(log n) runtime complexity.

## Examples

### Example 1
Input:
nums = [1,3,5,6]
target = 5

Output:

2
Example 2

Input:

nums = [1,3,5,6]
target = 2

Output:

1
Example 3

Input:

nums = [1,3,5,6]
target = 7

Output:

4

Approach

For practice, this solution uses Linear Search.

Traverse the array from left to right.
Check if nums[i] >= target.
If true, return i.
If the loop finishes, the target should be inserted at the end, so return nums.length.

Complexity

Time Complexity: O(n)
Space Complexity: O(1)
