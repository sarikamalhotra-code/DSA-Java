# Richest Customer Wealth

## Problem
You are given an `m x n` integer matrix `accounts` where `accounts[i][j]` represents the amount of money the `iᵗʰ` customer has in the `jᵗʰ` bank account.

Return the wealth of the richest customer.

## Approach
- Traverse each row of the matrix.
- Calculate the sum of each row.
- Keep track of the maximum row sum.
- Return the maximum wealth.

## Algorithm
1. Initialize `maxWealth = 0`.
2. Iterate through each row.
3. Calculate the sum of all elements in the current row.
4. Update `maxWealth` if the current sum is greater.
5. Return `maxWealth`.

## Time Complexity
- **O(m × n)**

## Space Complexity
- **O(1)**

## Concepts Used
- 2D Arrays
- Matrix Traversal
- Nested Loops
- Sum Calculation
- Maximum Element Tracking