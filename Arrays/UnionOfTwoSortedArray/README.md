# 🔗 Union of Two Sorted Arrays

This repository contains a Java solution for finding the union of two sorted arrays.

## 📌 Problem

Given two sorted arrays, return an array containing all **unique elements** from both arrays in ascending order.

## 💡 Approach

- Use a `HashSet` to store elements from both arrays.
- HashSet automatically removes duplicates.
- Convert the HashSet into an array.
- Sort the final array.

## 💻 Example

### Input

```text
nums1 = [1, 2, 3, 4, 5]
nums2 = [1, 2, 7]

Output

[1, 2, 3, 4, 5, 7]

⏱️ Complexity
Time Complexity: O((n + m) + k log k)
Space Complexity: O(n + m)

🛠️ Language
Java