# Best Time to Buy and Sell Stock

LeetCode 121 - Best Time to Buy and Sell Stock

## Problem

Given an array of stock prices, find the maximum profit that can be achieved
by buying on one day and selling on a later day.

## Example

Input:
[7, 1, 5, 3, 6, 4]

Output:
5

Buy at 1 and sell at 6.

## Approach

Traverse the array once.

- Keep track of the minimum price seen so far.
- Calculate the profit using the current price.
- Update the maximum profit.

## Complexity

Time Complexity: O(n)

Space Complexity: O(1)