# Lower Bound

## Problem
Find the first index where `nums[i] >= x` in a sorted array.

## Approach
I used Binary Search to find the first position where the element is greater than or equal to `x`.

- If `nums[mid] >= x`:
  - Store `mid` as a possible answer.
  - Move to the left to find an earlier valid index.
- If `nums[mid] < x`:
  - Move to the right.

If no valid element is found, return `n`.

## Algorithm
1. Initialize `s = 0` and `e = n - 1`.
2. Set `ans = n`.
3. Calculate `mid`.
4. If `nums[mid] >= x`, update `ans` and move left.
5. Otherwise, move right.
6. Return `ans`.

## Time Complexity
O(log n)

## Space Complexity
O(1)