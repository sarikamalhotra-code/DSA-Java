# LeetCode 28 - Find the Index of the First Occurrence in a String

## Problem

Given two strings `haystack` and `needle`, return the index of the first occurrence of `needle` in `haystack`.

If `needle` is not part of `haystack`, return `-1`.

## Example 1

### Input
haystack = "sadbutsad"
needle = "sad"

Output
0

Explanation
The string "sad" occurs at index 0 and 6.
The first occurrence is at index 0.

Example 2
Input
haystack = "leetcode"
needle = "leeto"

Output
-1

Explanation

"leeto" does not occur in "leetcode".

Approach

We use Linear Search to find the first occurrence of needle.

Traverse haystack from left to right.
For every possible starting index, compare the characters of needle.
If all characters match, return the current index.
If no match is found, return -1.

Complexity

Time Complexity: O(n × m)
Space Complexity: O(1)

Where:

n = length of haystack
m = length of needle

Concepts Practiced

Strings
Linear Search
String Traversal
charAt()
Nested Loop
Pattern Matching
Time & Space Complexity