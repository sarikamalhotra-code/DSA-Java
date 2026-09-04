🚀 Move Zeros to End

Solved Move Zeros to End using the Two Pointer Approach in Java.

🧠 Approach

Use two pointers i and j.
i traverses the array.
j keeps track of the position where the next non-zero element should go.
Swap non-zero elements with the element at j.
This moves all zeros to the end while maintaining the relative order of non-zero elements.

⏱️ Complexity
Time: O(n)
Space: O(1)

💻 Language
Java

📌 Example

Input:

[0, 20, 0, -20, 0, 20]

Output:

[20, -20, 20, 0, 0, 0]
