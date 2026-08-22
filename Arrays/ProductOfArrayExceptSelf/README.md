# Product of Array Except Self

## 📌 Problem

Given an integer array `nums`, return an array `answer` such that:

`answer[i]` is equal to the product of all elements of `nums` except `nums[i]`.

### Example

Input:
[1, 2, 3, 4]

Output:

[24, 12, 8, 6]
Explanation
For index 0: 2 × 3 × 4 = 24
For index 1: 1 × 3 × 4 = 12
For index 2: 1 × 2 × 4 = 8
For index 3: 1 × 2 × 3 = 6

💡 Approach

We solve this problem using Prefix (Left) Product and Suffix (Right) Product.

Step 1: Left Product

Traverse from left to right.

For every index, store the product of all elements to its left in result[i].

Example:

nums   = [1, 2, 3, 4]
result = [1, 1, 2, 6]
Step 2: Right Product

Traverse from right to left.

Maintain a product variable containing the product of elements to the right.

Multiply it with result[i].

Final result:

[24, 12, 8, 6]