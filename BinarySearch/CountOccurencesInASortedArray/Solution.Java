class Solution {
    public int countOccurrences(int[] arr, int target) {

        int n = arr.length;
        int s = 0;
        int e = n - 1;
        int first = -1;

        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (arr[mid] >= target) {
                if (arr[mid] == target) {
                    first = mid;
                }
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        if (first == -1) {
            return 0;
        }
        s = 0;
        e = n - 1;
        int last = -1;

        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (arr[mid] <= target) {
                if (arr[mid] == target) {
                    last = mid;
                }
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }

        return last - first + 1;
    }
}