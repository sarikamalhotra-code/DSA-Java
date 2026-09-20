# Single Element in a Sorted Array

## Problem
Given a sorted array where every element appears exactly twice except one element that appears only once, find the single element.

### Example
`[1,1,2,2,3,4,4,5,5]`

**Output:** `3`

## Approach
- Before the single element, pairs start at **even indices**.
- After the single element, this pattern breaks.
- Make `mid` even.
- If `arr[mid] == arr[mid + 1]`, the single element is on the **right**.
- Otherwise, it is on the **left or at mid**.

## Complexity
- Time: **O(log n)**
- Space: **O(1)**
