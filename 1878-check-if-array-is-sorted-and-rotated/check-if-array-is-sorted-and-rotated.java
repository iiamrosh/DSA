class Solution{
    public boolean check(int[] nums){
        int count= 0; //keep counts of violations
        int n =  nums.length; //Finds the length of the array.
        
        for (int i=0; i<n;i++){
            if (nums[i]>nums[(i+1)%n]){ //the % gives an remainder that if it becomes 0 i.e its the last element 
                count++;
            }
        }

        return count <= 1;
    }

}