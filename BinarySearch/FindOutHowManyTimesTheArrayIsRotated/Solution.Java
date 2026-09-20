class Solution {
    public int findKRotation(ArrayList<Integer> nums) {
        int n = nums.size();
        int s = 0;
        int e = n - 1;
        while(s < e){
            int mid = s + (e - s)/2;
            if(nums.get(mid) > nums.get(e)){
                s = mid + 1;
            }
            else{
                e = mid;
            }
        }
        return s;
    }
}