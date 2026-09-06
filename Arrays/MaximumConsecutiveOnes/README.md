# Max Consecutive Ones

## Problem

Given a binary array `nums`, return the maximum number of consecutive `1`s in the array.

### Example

Input:
[1, 1, 0, 1, 1, 1]

Output:

3

Explanation:
The longest consecutive sequence of 1s is [1, 1, 1], which has length 3.

Approach

We use two variables:

cnt → stores the current count of consecutive 1s.
maxi → stores the maximum count found so far.

Algorithm

Traverse the array.
If the current element is 1, increment cnt.
Update maxi with the maximum of maxi and cnt.
If the current element is 0, reset cnt to 0.
Return maxi. 

Complexity

Time Complexity: O(n)
Space Complexity: O(1)