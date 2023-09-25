class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;

        // Right Rotation by D units means left rotation be n-D units.

        int[] temp = new int[n-k];

        // Assigning values to the temprory variable.
        for(int i=0;i<n-k;i++){
            temp[i] = nums[i];
        }

        // Moving other values to the left
        for(int i=n-k;i<n;i++){
            nums[i-(n-k)] = nums[i];
        }

        //Remaining values to the right
        for(int i=k;i<n;i++){
            nums[i] = temp[i-k];
        }
        
    }
}