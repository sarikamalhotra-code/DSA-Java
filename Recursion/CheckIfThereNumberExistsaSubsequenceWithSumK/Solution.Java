class Solution {
    public boolean checkSubsequenceSum(int[] nums, int k) {
        return solve(0, nums, k);
    }
    public boolean solve(int index, int[] nums, int k) {
        if (k == 0) {
            return true;
        }
        if (index == nums.length) {
            return false;
        }
        if (nums[index] <= k) {
            if (solve(index + 1, nums, k - nums[index])) {
                return true;
            }
        }
        return solve(index + 1, nums, k);
    }
}