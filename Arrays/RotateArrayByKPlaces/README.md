🚀 Left Rotate Array by K Places

Solved Left Rotate Array by K Places using the Temporary Array Approach in Java.

🧠 Approach

Store the first k elements in a temporary array.
Shift the remaining elements k positions to the left.
Place the stored elements at the end of the array.
Use k % n to handle cases where k is greater than the array length.

⏱️ Complexity

Time: O(n)
Space: O(k)

💻 Language
Java

📌 Example

Input:

nums = [1, 2, 3, 4, 5]
k = 2

Output:

[3, 4, 5, 1, 2]