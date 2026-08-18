# LeetCode 771 - Jewels and Stones

## Problem
Given two strings `jewels` and `stones`, count how many characters in `stones` are also present in `jewels`.

## Example

Input:
- jewels = "aA"
- stones = "aAAbbbb"

Output:
```text
3

Approach
Traverse through every character of stones.
Check whether the current character exists in jewels.
If it exists, increment the count.
Return the final count.
Concepts Practiced
Strings in Java
charAt()
length()
contains()
String.valueOf()
String traversal
Counting
Complexity
Time Complexity: O(n × m)
Space Complexity: O(1)
