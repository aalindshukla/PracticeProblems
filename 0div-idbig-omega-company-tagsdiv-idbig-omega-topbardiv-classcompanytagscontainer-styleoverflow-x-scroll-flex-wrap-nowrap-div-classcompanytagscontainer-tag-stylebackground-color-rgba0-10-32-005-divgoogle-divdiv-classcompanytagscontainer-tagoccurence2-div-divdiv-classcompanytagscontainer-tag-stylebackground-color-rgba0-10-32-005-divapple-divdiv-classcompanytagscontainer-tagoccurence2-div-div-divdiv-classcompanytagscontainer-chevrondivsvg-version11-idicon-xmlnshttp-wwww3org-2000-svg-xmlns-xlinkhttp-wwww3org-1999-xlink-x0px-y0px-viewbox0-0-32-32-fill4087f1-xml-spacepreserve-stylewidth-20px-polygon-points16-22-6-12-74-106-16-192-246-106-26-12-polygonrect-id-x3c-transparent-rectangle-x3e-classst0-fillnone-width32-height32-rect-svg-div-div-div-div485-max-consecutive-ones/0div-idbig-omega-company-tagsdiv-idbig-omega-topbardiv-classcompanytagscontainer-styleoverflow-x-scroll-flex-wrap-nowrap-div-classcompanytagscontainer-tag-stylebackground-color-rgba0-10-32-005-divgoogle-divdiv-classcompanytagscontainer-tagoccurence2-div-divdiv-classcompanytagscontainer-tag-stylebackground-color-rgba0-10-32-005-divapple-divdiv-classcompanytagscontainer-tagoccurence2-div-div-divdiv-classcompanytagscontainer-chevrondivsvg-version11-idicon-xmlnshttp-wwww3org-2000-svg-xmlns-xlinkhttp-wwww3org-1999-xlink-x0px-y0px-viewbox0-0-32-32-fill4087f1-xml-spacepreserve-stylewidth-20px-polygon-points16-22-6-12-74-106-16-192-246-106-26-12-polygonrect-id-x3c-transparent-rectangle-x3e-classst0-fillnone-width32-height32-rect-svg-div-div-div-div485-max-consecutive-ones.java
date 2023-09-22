class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int i=0;
        int max = 0;
        int count = 0;
        while(i<nums.length){
            if(nums[i] == 1){
                count++;
            }
            else{
                count = 0;
            }
            max = Math.max(max,count);
            i++;
        }

        return max;
        
    }
}