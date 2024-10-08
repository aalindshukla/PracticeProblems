class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean inc = true;
        boolean dec = true;
        int n = nums.length;
        for(int i=1;i<n;i++){
            if(nums[i] < nums[i-1]){
                inc = false;
            }
            else if(nums[i] > nums[i-1]){
                dec = false;
            }
        }
        return inc || dec;
    }
}