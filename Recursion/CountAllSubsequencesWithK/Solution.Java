class Solution {
    public int countSubsequenceWithTargetSum(int[] nums, int k) {
        //your code goes here
        return solve(0, nums, k);
    }
    public int solve(int index, int[] nums, int k){
        if(k==0){
            return 1;
        }
        if(index == nums.length){
            return 0;
        }
         int notPick = solve(index + 1, nums, k);
        int pick = 0;
        if (nums[index] <= k) {
            pick = solve(index + 1, nums, k - nums[index]);
        }
        return pick + notPick;
    }
}