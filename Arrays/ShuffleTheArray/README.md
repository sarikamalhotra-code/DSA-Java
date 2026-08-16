# Shuffle the Array

## Problem

Given an array `nums` consisting of `2n` elements in the form:

`[x1, x2, ..., xn, y1, y2, ..., yn]`

Return the array in the form:

`[x1, y1, x2, y2, ..., xn, yn]`.

---

## Example

Input:

```text
nums = [2,5,1,3,4,7]
n = 3

Output:

[2,3,5,4,1,7]

Approach

Create a new array result of size 2 * n.
Traverse the first n elements of the array.
Place nums[i] at index 2 * i.
Place nums[n + i] at index 2 * i + 1.
Return the result array.

Algorithm

Create a new array of size 2 * n.
Start a loop from index 0 to n - 1.
Store nums[i] at result[2 * i].
Store nums[n + i] at result[2 * i + 1].
Return the resulting array.

Time Complexity
O(n)
Space Complexity
O(n)