# Search Insert Position

## Problem
Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be inserted in sorted order.

## Approach
We use Binary Search.

- If `nums[mid] >= target`, `mid` can be the answer.
  - Store `mid` in `ans`.
  - Search on the left side for a smaller valid index.
- If `nums[mid] < target`, search on the right side.
- Initialize `ans = n` in case the target should be inserted at the end.

## Algorithm
1. Set `s = 0` and `e = n - 1`.
2. Set `ans = n`.
3. While `s <= e`:
   - Calculate `mid`.
   - If `nums[mid] >= target`:
     - Store `mid` as `ans`.
     - Move left: `e = mid - 1`.
   - Otherwise:
     - Move right: `s = mid + 1`.
4. Return `ans`.

## Example
Input:
`nums = [1, 3, 5, 6], target = 5`

Output:
`2`

## Complexity
- Time: `O(log n)`
- Space: `O(1)`

## Key Concept
This problem is equivalent to finding the **Lower Bound**:
> First index where `nums[i] >= target`.