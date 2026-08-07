# Running Sum of 1D Array

## Problem
Given an integer array `nums`, return the running sum of the array.

The running sum at index `i` is the sum of all elements from index `0` to `i`.

## Approach
- Create a new array `ans` of the same size.
- Store the first element directly.
- Traverse the array from left to right.
- For each index, add the current element to the previous running sum.
- Return the resulting array.

## Algorithm
1. Create a result array `ans`.
2. Set `ans[0] = nums[0]`.
3. Traverse the array from index `1` to `n-1`.
4. Store `ans[i] = ans[i - 1] + nums[i]`.
5. Return `ans`.

## Time Complexity
- **O(n)**

## Space Complexity
- **O(n)**

## Concepts Used
- Arrays
- Array Traversal
- Prefix Sum (Running Sum)
- Indexing