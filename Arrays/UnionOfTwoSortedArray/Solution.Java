import java.util.*;

class Solution {
    public int[] unionArray(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        for (int x : nums1)
            set.add(x);
        for (int x : nums2)
            set.add(x);
        int[] ans = new int[set.size()];
        int i = 0;

        for (int x : set)
            ans[i++] = x;

        Arrays.sort(ans);

        return ans;
    }
}