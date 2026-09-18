# First and Last Occurrence in a Sorted Array

## Problem
Given a sorted array `nums` and a target value, find the starting and ending position of the target.

If the target is not present, return `[-1, -1]`.

## Example

Input:
nums = [5,7,7,8,8,10]
target = 8

Output:

[3,4]

Approach

We use Binary Search two times:

1. Find First Occurrence
If nums[mid] >= target, move to the left.
If nums[mid] == target, store mid as first.
Continue searching left to find an earlier occurrence.
2. Find Last Occurrence
If nums[mid] <= target, move to the right.
If nums[mid] == target, store mid as last.
Continue searching right to find a later occurrence.

Finally, return:

[first, last]

Algorithm

Initialize first = -1 and last = -1.
Perform binary search to find the first occurrence.
Perform another binary search to find the last occurrence.
Return {first, last}.

Complexity

Time Complexity: O(log n)
Space Complexity: O(1)

Key Concept

This problem is solved using Binary Search by modifying the search direction after finding the target.

First occurrence → search left
Last occurrence → search right