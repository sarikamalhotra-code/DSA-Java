# Reverse String

## Problem

Write a function that reverses a string.

The input string is given as an array of characters `s`.

You must modify the input array in-place with O(1) extra memory.

---

## Example

Input:

```text
s = ["h","e","l","l","o"]

Output:

["o","l","l","e","h"]

Approach

Use the Two Pointer Technique.
Set left pointer at the beginning of the array.
Set right pointer at the end of the array.
Swap the characters at left and right.
Move left forward.
Move right backward.
Continue until left and right meet.

Algorithm

Initialize left = 0.
Initialize right = s.length - 1.
Run a loop while left < right.
Swap s[left] and s[right] using a temporary variable.
Increment left.
Decrement right.
Stop when the two pointers meet.
