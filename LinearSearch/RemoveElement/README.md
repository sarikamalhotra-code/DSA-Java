# LeetCode 27 - Remove Element

## Problem

Given an integer array `nums` and an integer `val`, remove all occurrences of `val` from `nums` in-place.

Return the number of elements `k` that are not equal to `val`.

The first `k` elements of `nums` should contain the elements that are not equal to `val`.

## Example

### Input
nums = [3,2,2,3]
val = 3

Output
k = 2
nums = [2,2,_,_]

Approach

We use a simple linear traversal with an extra index k.
Traverse the array from left to right.
If nums[i] is not equal to val, place it at nums[k].
Increment k.
Return k after completing the traversal.

Complexity

Time Complexity: O(n)
Space Complexity: O(1)

Concepts Practiced

Arrays
Linear Traversal
In-place Array Modification
Two Pointer Technique
Time and Space Complexity