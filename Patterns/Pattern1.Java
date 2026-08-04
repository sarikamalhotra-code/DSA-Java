class Solution {
    public void pattern1(int n) {
        for (int row = 0; row < n; row++){
            for(int col = 0; col< n; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}