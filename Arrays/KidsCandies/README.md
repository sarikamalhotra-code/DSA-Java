# Kids With the Greatest Number of Candies

LeetCode 1431

## Problem

Given an array of candies and an integer `extraCandies`, check for each kid whether they can have the greatest number of candies after receiving all the extra candies.

## Approach

1. Find the maximum number of candies in the array.
2. Add `extraCandies` to each kid's candies.
3. Check if the new number of candies is greater than or equal to the maximum.
4. Store the result as `true` or `false`.

## Example

Input:
candies = [2,3,5,1,3]
extraCandies = 3

Output:
[true,true,true,false,true]

## Complexity

Time Complexity: O(n)

Space Complexity: O(n)