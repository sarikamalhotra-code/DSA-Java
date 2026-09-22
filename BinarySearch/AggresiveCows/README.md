## Aggressive Cows

## Problem

Given an array of stall positions and k cows, place all cows such that the minimum distance between any two cows is maximized.

## Approach

Sort the stall positions.
Apply Binary Search on Answer.
mid represents the minimum possible distance.
Check whether k cows can be placed with at least mid distance.
If possible → increase the distance.
If not possible → decrease the distance.

## Example
nums = [1, 2, 4, 8, 9]
k = 3

Maximum minimum distance = 3.

## Complexity

Sorting: O(n log n)
Binary Search: O(n log(maxDistance))

## Overall: O(n log n + n log(maxDistance))
Extra Space: O(1)