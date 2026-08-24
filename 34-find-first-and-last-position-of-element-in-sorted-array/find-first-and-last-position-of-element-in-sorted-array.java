class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] positions = {-1,-1};
        int start = search(nums, target, true);
        int end = search(nums,target, false);

        positions[0] = start;
        positions[1] = end;

        return positions;
        
    }
    int search(int[] nums, int target, boolean findStartIndex){
        int start = 0;
        int end = nums.length-1;
        int ans = -1;     

        while(start<=end){
            int mid = start + (end-start)/2;
            if(target>nums[mid]){
                start = mid+1;
            }
            else if(target<nums[mid]){
                end = mid-1;
            }
            else{
                //potential ans found
                ans = mid;
                if(findStartIndex){
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }
        }

        return ans;
    }
    
}