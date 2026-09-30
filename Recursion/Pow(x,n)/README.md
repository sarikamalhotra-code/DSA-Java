# Recursion - Pow(x, n)

## Problem Statement

Given a floating-point number `x` and an integer `n`, calculate `x` raised to the power `n`.

In other words:

`x^n`

The solution should also handle negative values of `n`.

### Examples

- Input: `x = 2`, `n = 5` → Output: `32.0`
- Input: `x = 2`, `n = -2` → Output: `0.25`
- Input: `x = 3`, `n = 0` → Output: `1.0`

---

## Approach

I solved this problem using **Recursion** and **Binary Exponentiation**.

Instead of multiplying `x` `n` times, I divide the power by `2` in every recursive call.

### Recursive Idea

For an even power:

```text
x^n = x^(n/2) × x^(n/2)

For an odd power:

x^n = x^(n/2) × x^(n/2) × x

Steps

Convert n to long to safely handle Integer.MIN_VALUE.
If n is negative, work with its positive value.
Recursively calculate the power for n / 2.
If n is even, multiply the half result by itself.
If n is odd, multiply the half result by itself and also multiply by x.
For negative n, return the reciprocal of the result.

Base Case

The recursion stops when:

if (n == 0) {
    return 1.0;
}

Because:

x^0 = 1
Example

For:

x = 2
n = 5

The recursive calls are:

power(2, 5)
      ↓
power(2, 2)
      ↓
power(2, 1)
      ↓
power(2, 0)

Then the functions return and build the answer:

power(2, 0) = 1
power(2, 1) = 2
power(2, 2) = 4
power(2, 5) = 32

Complexity

Time Complexity: O(log n)
Space Complexity: O(log n) because of the recursive call stack.

Key Learning

This problem helped me understand:

Base case
Recursive call
Recursion stack
Returning values from recursion
Binary Exponentiation
Handling negative powers