🔍 Search in Rotated Sorted Array I

📌 Problem

Given a rotated sorted array nums and an integer k, search for k in the array.

Return the index of k if it exists, otherwise return -1.

Example
Input:
nums = [4,5,6,7,0,1,2]
k = 0

Output:
4
Input:
nums = [4,5,6,7,0,1,2]
k = 3

Output:
-1

💡 Approach

We use Binary Search.

At every step:

Calculate mid.

If nums[mid] == k, return mid.

Check which half of the array is sorted.

If the left half is sorted:

Check whether k lies inside the left half.

If yes, move e to mid - 1.

Otherwise, move s to mid + 1.

Otherwise, the right half is sorted:

Check whether k lies inside the right half.

If yes, move s to mid + 1.

Otherwise, move e to mid - 1.

If the loop ends, return -1.

⏱️ Complexity

Time: O(log n)
Space: O(1)

🧠 Key Takeaway
In a rotated sorted array, at least one half is always sorted. Identify the sorted half and check whether the target lies inside it before deciding which side to search.