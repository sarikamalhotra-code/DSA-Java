# Find Pivot Index

## Problem
Find the pivot index where the sum of elements on the left is equal to the sum of elements on the right.

## Approach
1. Calculate the total sum of the array.
2. Traverse the array while maintaining the left sum.
3. Calculate the right sum using:
   rightSum = totalSum - leftSum - nums[i]
4. If left sum equals right sum, return the current index.
5. If no pivot index exists, return -1.

## Time Complexity
O(n)

## Space Complexity
O(1)