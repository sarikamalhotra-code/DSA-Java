🔍 Search in Rotated Sorted Array II
📌 Problem

Given a rotated sorted array nums that may contain duplicate elements, and an integer k, determine whether k exists in the array.

Return true if k is present, otherwise return false.

Example
Input:
nums = [2, 5, 6, 0, 0, 1, 2]
k = 0

Output:
true

Input:
nums = [2, 5, 6, 0, 0, 1, 2]
k = 3

Output:
false

💡 Approach

We use Binary Search with an additional condition to handle duplicates.

Find mid.

If nums[mid] == k, return true.

Check if nums[s], nums[mid], and nums[e] are equal.

If all three are equal, we cannot determine which half is sorted, so move:
s++
e--

Otherwise, identify which half is sorted.

If the left half is sorted, check whether k lies within its range.

Otherwise, the right half is sorted, so check its range.

Continue until the target is found or the search space becomes empty.

If the loop ends, return false.

🔑 Important Duplicate Case

The main challenge is when:

nums[s] == nums[mid] == nums[e]

In this situation, we cannot determine which side is sorted.

So we shrink the search space:

s++
e--

This is the major difference between Rotated Sorted Array I and II.

🧠 Key Takeaway

In the presence of duplicates, the sorted half may not always be identifiable. When the start, middle, and end elements are equal, shrink both boundaries before continuing binary search.

⏱️ Complexity

Average Time: O(log n)
Worst-case Time: O(n) due to duplicates
Space: O(1)