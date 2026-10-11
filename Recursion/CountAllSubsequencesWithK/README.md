# Count All Subsequences with Sum K

## Problem Statement
Given an array `nums` and an integer `k`, count the number of non-empty subsequences whose sum is equal to `k`.

## Example
Input:
nums = [4, 9, 2, 5, 1]
k = 10

Output:
2

Explanation:
The subsequences are [9, 1] and [4, 5, 1].
Both have a sum equal to 10.

## Approach: Recursion

For every element, we have two choices:

1. Pick the current element.
2. Do not pick the current element.

Recursively explore both choices and add their counts to get the total number of valid subsequences.

### Base Cases
- If the target sum becomes 0, return 1.
- If the array is exhausted before finding the target sum, return 0.

## Java Solution
Implemented using recursion with pick and not-pick choices.

## Complexity Analysis
- **Time Complexity:** O(2^N)
- **Space Complexity:** O(N), due to the recursion stack.

## Key Learning
- Recursion
- Pick and Not Pick Pattern
- Subsequences
- Backtracking

---
Part of my Striver A2Z DSA practice using Java.