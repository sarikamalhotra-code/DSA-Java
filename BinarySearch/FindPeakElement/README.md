# Find Peak Element 🔍

## Problem Statement

Given an array `arr` of integers, find the index of any **peak element**.

A peak element is an element that is greater than both of its neighbors.

For boundary elements:
- The left element of `arr[0]` is considered `-∞`.
- The right element of `arr[n-1]` is considered `-∞`.

If there are multiple peak elements, we can return the index of any one of them.

---

## Example 1

Input:

```text
[1, 2, 3, 4, 5, 6, 7, 8, 5, 1]

Output:

7

Explanation:

arr[7] = 8 is greater than both its neighbors 7 and 5.

Therefore, index 7 is a peak.

Example 2

Input:

[1, 2, 1, 3, 5, 6, 4]

Possible Output:

1

Explanation:

There are two peak elements:

Index 1 → value 2
Index 5 → value 6

We can return either index.

Approach

We use Binary Search.

Instead of checking every element, we compare the middle element with the next element.

Case 1: Increasing Slope

If:

arr[mid] < arr[mid + 1]

the array is increasing at mid.

Therefore, a peak must exist on the right side.

So:

s = mid + 1;
Case 2: Decreasing Slope

Otherwise:

arr[mid] > arr[mid + 1]

We are on a decreasing slope.

A peak can be mid itself or somewhere on the left.

So:

e = mid;

We continue until:

s == e

At that point, s is the index of a peak element.

Algorithm

1.Initialize s = 0.
2.Initialize e = n - 1.
3.Run binary search while s < e.
4.Calculate mid.
5.Compare arr[mid] with arr[mid + 1].
6.If arr[mid] < arr[mid + 1]:
  Move s to mid + 1.

7.Otherwise:
Move e to mid.
8.Return s.

Complexity Analysis

Time Complexity
O(log N)

Binary Search reduces the search space by half in every iteration.

Space Complexity
O(1)

No extra data structure is used.