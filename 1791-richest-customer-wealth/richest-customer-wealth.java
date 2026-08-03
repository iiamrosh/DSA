class Solution {
    public int maximumWealth(int[][] accounts) {
      int ans = Integer.MIN_VALUE;
        int[] totalsArray = new int[accounts.length];
        for (int row = 0; row < accounts.length; row++) {
            int total=0;
            for (int col = 0; col < accounts[row].length; col++) {
                total += accounts[row][col];
            }
            if (total>ans){
                ans=total;
            }
        }
        return ans;
    }
}