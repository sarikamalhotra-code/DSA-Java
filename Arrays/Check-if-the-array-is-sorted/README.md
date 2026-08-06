# Check if the Array is Sorted

## Problem

Given an `ArrayList<Integer> nums`, determine whether the array is sorted in **non-decreasing order**.

Return:

- `true` if the array is sorted.
- `false` otherwise.

---

## Approach

- Traverse the array from the first element to the second-last element.
- Compare each element with its next element.
- If the current element is greater than the next element, the array is not sorted, so return `false`.
- If the loop completes without finding any such pair, return `true`.

---

## Algorithm

1. Start from index `0`.
2. Compare `nums[i]` with `nums[i + 1]`.
3. If `nums[i] > nums[i + 1]`, return `false`.
4. Continue until the end of the array.
5. Return `true` if no unsorted pair is found.

---

## Time Complexity

- **O(n)**

## Space Complexity

- **O(1)**
