# Find Minimum in Rotated Sorted Array 🔍

## Problem Statement

Given a rotated sorted array with distinct elements, find the minimum element in the array.

### Example

Input:
[4, 5, 6, 7, -7, 1, 2, 3]

Output:
-7

---

## Approach

We use **Binary Search** to find the minimum element efficiently.

### Key Observation

Compare the middle element with the last element:

- If `arr[mid] > arr[e]`
  - The minimum element lies on the **right side** of `mid`.
  - Move `s` to `mid + 1`.

- Otherwise:
  - The minimum element can be at `mid` or on the left side.
  - Move `e` to `mid`.

We continue until `s == e`.

At that point, `s` points to the minimum element.

---

## Algorithm

1. Initialize:
   - `s = 0`
   - `e = n - 1`

2. While `s < e`:
   - Calculate `mid`.
   - If `arr[mid] > arr[e]`:
     - `s = mid + 1`
   - Else:
     - `e = mid`

3. Return `arr[s]`.

Complexity

Time Complexity: O(log n)
Space Complexity: O(1)

Key Learning

This problem is solved using Binary Search on a rotated sorted array.