class Solution {
    public int[] getFloorAndCeil(int[] nums, int x) {
        int n = nums.length;
        int s = 0;
        int e = n - 1;
        int floor = -1;
        int ceil = -1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (nums[mid] == x) {
                floor = nums[mid];
                ceil = nums[mid];
                break;
            }
            else if (nums[mid] < x) {
                floor = nums[mid];
                s = mid + 1;
            }
            else {
                ceil = nums[mid];
                e = mid - 1;
            }
        }
        return new int[]{floor, ceil};
    }
}