# Count Occurrences in a Sorted Array

## Problem

Given a sorted array `arr` and an integer `target`, find how many times the target appears in the array.

If the target is not present, return `0`.

## Example

### Input

```text
arr = [0, 0, 1, 1, 1, 2, 3]
target = 1

Output
3
Explanation

The target 1 appears at indices 2, 3, and 4.

So, the count is 3.

Approach

We use Binary Search two times:

1. Find First Occurrence
If arr[mid] >= target, move towards the left.
If arr[mid] == target, store mid as first.
Continue searching on the left to find the first occurrence.
2. Find Last Occurrence
If arr[mid] <= target, move towards the right.
If arr[mid] == target, store mid as last.
Continue searching on the right to find the last occurrence.
3. Calculate Count

If the target exists:

count = last - first + 1

If the target does not exist:

count = 0

Algorithm

Initialize first = -1 and last = -1.
Use binary search to find the first occurrence.
If first == -1, return 0.
Use binary search to find the last occurrence.
Return last - first + 1.

Complexity

Time Complexity: O(log n)
Space Complexity: O(1)

Key Concept

This problem is an extension of First and Last Occurrence using Binary Search.

First Occurrence → search left
Last Occurrence  → search right
Count            → last - first + 1