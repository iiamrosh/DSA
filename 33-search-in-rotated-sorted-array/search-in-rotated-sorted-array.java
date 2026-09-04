class Solution {
    public int search(int[] nums, int target) {
        int pivot_index = pivot(nums); // will return the peak value

        if (pivot_index == -1){
            return binarySearch(nums, target, 0, nums.length-1);
        }
        if (nums[pivot_index] == target){
            return pivot_index;
        }
        if(target >= nums[0]){
            return binarySearch(nums, target, 0, pivot_index-1);
        }
        return binarySearch(nums, target, pivot_index+1, nums.length-1);
        
        
    }
     int binarySearch(int[] nums,int target, int start, int end){
        while(start<=end){
            int mid = start + (end - start)/2;
            //this has 3 cases
            if(target>nums[mid]){
                start = mid+1;
            }
            else if(target<nums[mid]){
                end = mid-1;
            }
            else{
                //ans found
                return mid;
            }
        }
        return -1;
    }

     int pivot(int[] nums){
        int start = 0;
        int end = nums.length -1;
        while(start<=end){
            int mid = start + (end-start)/2;
            // there are 4 cases when finding pivot
            if (mid < end && nums[mid] > nums[mid+1]){
                return mid;
            }
            if (mid > start && nums[mid] < nums[mid-1]){
                return mid - 1;
            }

            if(nums[mid] <= nums[start]){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return -1;
    }
}