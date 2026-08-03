class Solution {
    public int largestElement(int[] nums) {
        int maxValue = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > maxValue) {
                maxValue = nums[i];
            }
        }

        return maxValue;
    }
}