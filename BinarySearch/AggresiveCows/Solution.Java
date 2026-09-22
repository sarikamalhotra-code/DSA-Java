import java.util.Arrays;

class Solution {
    public int aggressiveCows(int[] nums, int k) {
        Arrays.sort(nums);

        int s = 1, e = nums[nums.length - 1] - nums[0], ans = 0;

        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (canPlace(nums, k, mid)) {
                ans = mid;
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return ans;
    }

    public boolean canPlace(int[] nums, int k, int dist) {
        int count = 1, last = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] - last >= dist) {
                count++;
                last = nums[i];
            }
        }
        return count >= k;
    }
}