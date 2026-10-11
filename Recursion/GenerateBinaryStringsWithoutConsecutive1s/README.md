# Generate Binary Strings Without Consecutive 1s

## Problem Statement
Given an integer `n`, generate all binary strings of length `n` that do not contain consecutive `1`s. Return the strings in lexicographically increasing order.

## Example

**Input:**
```text
n = 3

Output:

["000", "001", "010", "100", "101"]

Explanation:
All binary strings have length 3 and do not contain consecutive 1s.

Approach: Recursion & Backtracking

- Add 0 to the current string.
- Add 1 only if the previous character is not 1.
- When the string length becomes n, add it to the result.
- Generate strings in lexicographically increasing order.

Complexity Analysis

Time Complexity: O(n × 2ⁿ)
Auxiliary Space Complexity: O(n), excluding the output list.

Key Learnings

- Recursion
- Backtracking
- String Manipulation
- Binary Strings
- Lexicographical Ordering