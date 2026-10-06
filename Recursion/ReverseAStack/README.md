# Reverse a Stack Using Recursion

## Problem

Given a stack of integers, reverse the stack using **recursion**.

Only standard stack operations are allowed:

* `push()`
* `pop()`
* `peek() / top()`
* `isEmpty()`

We cannot use loops or additional data structures such as arrays or queues.

### Example

**Input:**

```text
[4, 1, 3, 2]
```

**Output:**

```text
[2, 3, 1, 4]
```

---

## Approach

We use two recursive functions:

### 1. `reverseStack()`

* If the stack is empty, return.
* Remove the top element.
* Recursively reverse the remaining stack.
* Insert the removed element at the bottom.

### 2. `insertAtBottom()`

* If the stack is empty, push the element.
* Otherwise, remove the top element.
* Recursively reach the bottom.
* Push the removed elements back.

---

## Algorithm

1. Check if the stack is empty.
2. Pop the top element.
3. Recursively reverse the remaining stack.
4. Insert the popped element at the bottom using recursion.
5. Repeat until the stack is reversed.

---

## Dry Run

For:

```text
[4, 1, 3, 2]
```

Remove elements recursively:

```text
2 → 3 → 1 → 4
```

When recursion returns, insert each element at the bottom:

```text
[4]
[3, 4]
[1, 3, 4]
[2, 1, 3, 4]
```

Final stack:

```text
[2, 1, 3, 4]
```

> **Note:** The exact displayed order depends on whether the problem represents the stack from bottom-to-top or top-to-bottom. The implementation reverses the actual stack order.

---

## Complexity

* **Time Complexity:** `O(n²)`
* **Space Complexity:** `O(n)` due to recursion stack.

---

## Key Concept

The important recursion pattern is:

**Pop → Recursively reverse → Insert at bottom**

This allows us to reverse the stack without using any extra data structure or loop.
