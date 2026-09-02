# Remove Duplicates from Sorted Array

### Problem
Remove duplicates from a sorted array in-place so that each unique element appears only once.

### Approach
Used the **Two Pointer** approach.

- `i` keeps track of the position of the last unique element.
- `j` traverses the array.
- If `nums[j]` is different from `nums[i]`, move `i` forward and update `nums[i]`.

### Time Complexity
O(n)

### Space Complexity
O(1)

### Language
Java