class Solution {
    public int maximumWealth(int[][] accounts) {
      int[] totals = addNums(accounts);
        int max = 0;
        for (int i = 0; i < totals.length; i++) {
            if (totals[i]>max){
                max = totals[i];
            }
        }
        System.out.println(max);
        return max;
    }
    
    int[] addNums(int[][] accounts){
        int[] totalsArray = new int[accounts.length];
        for (int row = 0; row < accounts.length; row++) {
            int total=0;
            for (int col = 0; col < accounts[row].length; col++) {
                total += accounts[row][col];
            }
            totalsArray[row] = total ;
        }
        System.out.println(Arrays.toString(totalsArray));
        return totalsArray;
    } 
}