## 327. Count Good Numbers

### Approach

For a good digit string:

* Digits at **even indices** have 5 choices: `0, 2, 4, 6, 8`
* Digits at **odd indices** have 4 choices: `2, 3, 5, 7`

Number of even positions:

```text
(n + 1) / 2
```

Number of odd positions:

```text
n / 2
```

Therefore:

```text
Answer = 5^(even positions) × 4^(odd positions)
```

Since `n` can be as large as `10^15`, normal exponentiation is too slow. So **Binary Exponentiation** is used to calculate powers in `O(log n)` time.

### Example

For `n = 5`:

```text
Even positions = 3
Odd positions = 2

Answer = 5³ × 4²
       = 125 × 16
       = 2000
```

### Complexity

* **Time:** `O(log n)`
* **Space:** `O(1)`

### Key Concept

**Binary Exponentiation / Fast Power + Modular Arithmetic**
