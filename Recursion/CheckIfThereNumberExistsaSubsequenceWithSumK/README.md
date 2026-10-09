# Check if There Exists a Subsequence with Sum K

## Problem Statement
Given an array `nums` and an integer `k`, check whether there exists a subsequence whose elements sum up to `k`.

Return `true` if such a subsequence exists; otherwise, return `false`.

## Approach: Recursion

We use recursion to explore two choices for every element:

1. **Pick:** Include the current element in the subsequence and subtract its value from the target.
2. **Not Pick:** Skip the current element and keep the target unchanged.

### Base Cases
- If `k == 0`, return `true` because the target sum has been achieved.
- If `index == nums.length`, return `false` because all elements have been checked without finding the target.

If either recursive path returns `true`, a valid subsequence exists.

## Algorithm
1. Start recursion from index `0`.
2. If the target becomes `0`, return `true`.
3. If all elements have been processed, return `false`.
4. Try picking the current element if its value is less than or equal to the target.
5. Try skipping the current element.
6. Return `true` if either choice finds a valid subsequence.

## Example

**Input:**
```text
nums = [1, 2, 3, 4, 5]
k = 8

Output:

true

Explanation:

The subsequence [1, 2, 5] has a sum of 8.

Complexity Analysis

Time Complexity: O(2^N), where N is the number of elements, because each element has two choices: pick or not pick.
Space Complexity: O(N), due to the recursion stack.

Key Concepts

Recursion
Subsequences
Pick and Not Pick Pattern

Base Cases

Backtracking