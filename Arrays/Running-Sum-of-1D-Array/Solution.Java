class Solution {
    public int[] runningSum(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                ans[0] = nums[0];
            } else {
                ans[i] = ans[i - 1] + nums[i];
            }
        }
        return ans;
    }
}