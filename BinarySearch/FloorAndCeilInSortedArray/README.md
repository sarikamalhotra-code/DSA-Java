# Floor and Ceil in a Sorted Array

## Problem
Given a sorted array and an integer `x`, find:

- Floor: Largest element less than or equal to `x`
- Ceil: Smallest element greater than or equal to `x`

## Approach
We use Binary Search.

During the search:

- If `nums[mid] == x`:
  - Both floor and ceil are `x`.
- If `nums[mid] < x`:
  - `nums[mid]` is a possible floor.
  - Move right to find a larger floor.
- If `nums[mid] > x`:
  - `nums[mid]` is a possible ceil.
  - Move left to find a smaller ceil.

Initialize both `floor` and `ceil` as `-1` when no valid value exists.

## Algorithm
1. Set `s = 0` and `e = n - 1`.
2. Initialize `floor = -1` and `ceil = -1`.
3. While `s <= e`:
   - Calculate `mid`.
   - If `nums[mid] == x`, set both to `nums[mid]`.
   - If `nums[mid] < x`:
     - Set `floor = nums[mid]`.
     - Move right.
   - If `nums[mid] > x`:
     - Set `ceil = nums[mid]`.
     - Move left.
4. Return `{floor, ceil}`.

## Example
Input:
`nums = [1, 2, 4, 6, 8], x = 5`

Output:
`[4, 6]`

Here:
- Floor = `4`
- Ceil = `6`

## Complexity
- Time: `O(log n)`
- Space: `O(1)`

## Key Concept
Binary Search can be used to efficiently find both the **floor** and **ceil** in a sorted array.