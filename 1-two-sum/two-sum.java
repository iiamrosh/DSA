class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int i=0,j=1;
        int ind[]= new int[2];
        for(i=0;i<n;i++){
            for(j=1;j<n;j++){
                if(nums[i]+nums[j]==target & i!=j){
                    ind[0]=i;
                    ind[1]=j;
                }
            }
        }
        return ind;
    }
}