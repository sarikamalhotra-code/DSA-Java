Single Number

Problem

Given an array of integers, every element appears twice except for one element. Find the element that appears only once.

Example
Input:  [1, 3, 10, 3, 5, 1, 5]
Output: 10
Approach — XOR

We use the XOR (^) operator because:

a ^ a = 0
a ^ 0 = a
XOR is commutative and associative.

So, all elements that appear twice cancel each other out, and the remaining element is the answer.

Complexity

Time Complexity: O(n)
Space Complexity: O(1)

Key Concept

1 ^ 1 = 0
5 ^ 5 = 0
0 ^ 10 = 10

Therefore, the element appearing only once remains.