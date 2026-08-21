# Valid Anagram

LeetCode 242 - Valid Anagram

## Problem

Given two strings `s` and `t`, return `true` if `t` is an anagram of `s`.

An anagram is a word or phrase formed by rearranging the letters of another word or phrase, using all the original letters exactly once.

## Example 1

Input:

s = "anagram"
t = "nagaram"

Output:

true

## Example 2

Input:

s = "rat"
t = "car"

Output:

false

## Approach

First, check if both strings have the same length.

If their lengths are different, they cannot be anagrams.

Then:

- Convert both strings into character arrays.
- Sort both character arrays.
- Compare the sorted arrays.
- If both arrays are equal, return `true`.
- Otherwise, return `false`.

For example:

"anagram" → "aaagmnr"

"nagaram" → "aaagmnr"

Both sorted strings are the same, so they are anagrams.

## Complexity

Time Complexity: O(n log n)

Space Complexity: O(n)

## Key Concepts

- Strings
- Character Arrays
- Sorting
- Array Comparison