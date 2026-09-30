# 786. Find Square Root of a Number

## Problem Statement

Given a non-negative integer `n`, find and return the floor value of its square root.

If `n` is a perfect square, return its exact square root.

### Examples

- Input: `n = 36` → Output: `6`
- Input: `n = 28` → Output: `5`
- Input: `n = 50` → Output: `7`

---

## Approach

I used **Binary Search** to find the square root efficiently.

Instead of checking every number from `1` to `n`, we search for the answer using binary search.

### Steps

1. Set `low = 0` and `high = n`.
2. Calculate the middle value:
   `mid = low + (high - low) / 2`
3. Check `mid * mid`:
   - If `mid² <= n`, `mid` can be an answer. Store it and search on the right side for a larger possible value.
   - If `mid² > n`, search on the left side.
4. Continue until `low > high`.
5. Return the stored answer.

### Overflow Handling

Since `n` can be large, `mid * mid` may cause integer overflow.

Therefore, I use:

```java
(long) mid * mid

to safely perform the multiplication.

Complexity
Time Complexity: O(log n)
Space Complexity: O(1)
Key Learning

This problem is a good application of Binary Search on Answer.

The important condition is:

mid² <= n

If this is true, mid can be a valid answer, so we try to find a larger value.