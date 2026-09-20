# Find Out How Many Times the Array Is Rotated 🔄

## Problem Statement

Given an array sorted in ascending order with distinct elements, the array
has been rotated an unknown number of times.

Find out how many times the array has been rotated.

---

## Example

Input:
[4, 5, 6, 7, 0, 1, 2, 3]

Output:
4

Explanation:

The original sorted array is:

[0, 1, 2, 3, 4, 5, 6, 7]

After rotating it 4 times:

[4, 5, 6, 7, 0, 1, 2, 3]

The minimum element `0` is at index `4`.

Therefore, the array has been rotated `4` times.

---

## Key Observation 💡

The number of rotations is equal to the **index of the minimum element**.

For example:

[3, 4, 5, 1, 2]

Minimum element = `1`

Index of `1` = `3`

Therefore:

Answer = `3`

---

## Approach

We use **Binary Search** to find the index of the minimum element.

### Logic

Compare the middle element with the last element.

### Case 1

If:

```java
nums.get(mid) > nums.get(e)

The minimum element lies on the right side.

So:

s = mid + 1;
Case 2

Otherwise:

e = mid;

The minimum can be at mid or somewhere on the left side.

We continue until:

s == e

At this point, s is the index of the minimum element.

Since the index of the minimum element represents the number of rotations, return s.

Algorithm

Initialize s = 0.

Initialize e = n - 1.

Run binary search while s < e.

Calculate mid.

If nums[mid] > nums[e]:

Move s to mid + 1.

Otherwise:

Move e to mid.

When s == e, return s.

Complexity Analysis
Time Complexity
O(log N)

Binary search reduces the search space by approximately half in every iteration.

Space Complexity
O(1)

No extra data structure is used.