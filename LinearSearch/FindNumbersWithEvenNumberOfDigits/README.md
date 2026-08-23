# Find Numbers with Even Number of Digits

**LeetCode 1295 – Find Numbers with Even Number of Digits**

## Problem

Given an array of integers `nums`, return how many numbers contain an **even number of digits**.

---

## Example

### Input

```text
nums = [12, 345, 2, 6, 7896]
```

### Output

```text
2
```

### Explanation

* `12` → 2 digits → Even ✅
* `345` → 3 digits → Odd ❌
* `2` → 1 digit → Odd ❌
* `6` → 1 digit → Odd ❌
* `7896` → 4 digits → Even ✅

Therefore, the answer is `2`.

---

## Approach

Use **Array Traversal** to check every element.

1. Traverse the array using a `for` loop.
2. Take each number one by one.
3. Count its digits using a `while` loop.
4. Divide the number by `10` to remove its last digit.
5. If the digit count is even, increase `count`.
6. Return the final count.

---

## Algorithm

1. Initialize `count = 0`.
2. Traverse the array.
3. Store the current element in `num`.
4. Initialize `digits = 0`.
5. While `num > 0`:

   * Divide `num` by `10`.
   * Increment `digits`.
6. Check `digits % 2 == 0`.
7. If true, increment `count`.
8. Return `count`.

---

## Complexity

* **Time Complexity:** `O(n × d)`
* **Space Complexity:** `O(1)`

Where `n` is the number of elements and `d` is the number of digits.

---

## Concepts Practiced

* Arrays
* Linear Search
* Array Traversal
* `for` Loop
* `while` Loop
* Digit Counting
* Modulo Operator `%`
* Integer Division `/`
* Basic Problem Solving
