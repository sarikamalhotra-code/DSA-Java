# Build Array from Permutation

## Problem

Given a zero-based permutation `nums`, build an array `ans` where:

`ans[i] = nums[nums[i]]`

for every valid index `i`.

Return the resulting array.

---

## Example

Input:

```text
nums = [0,2,1,5,3,4]

Output:

[0,1,2,4,5,3]

Approach

Create a new array result with the same length as nums.
Traverse the array from index 0 to the last index.
For every index i, find nums[i].
Use that value as an index to access nums[nums[i]].
Store the result at result[i].
Return the result array.

Algorithm

Create a new array result of size nums.length.
Start from index 0.
Calculate nums[nums[i]].
Store it in result[i].
Continue until the end of the array.
Return result.

Time Complexity
O(n)
Space Complexity
O(n)