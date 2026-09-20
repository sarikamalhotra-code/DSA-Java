class Solution {
    public int findMin(ArrayList<Integer> arr) {
        int n = arr.size();
        int s = 0;
        int e = n - 1;
        while(s < e){
            int mid = s + (e - s)/2;
            if(arr.get(mid) > arr.get(e)){
                s = mid + 1;
            }else{
                e = mid;
            }
        }
        return arr.get(s);
    }
}
