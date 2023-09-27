class Solution {
    public int majorityElement(int[] nums) {

        // Moore's Voting Algorithm (Most Optimal O(N))

        int count = 0;
        int el = 0;
        for(int i=0;i<nums.length;i++){
            if(count ==0){
                count = 1;
                el = nums[i];
            }
            else if(nums[i] == el){
                count++;
            }
            else{
                count--;
            }
        }
        int c = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == el){
                c++;
            }
        }
            if(c > (nums.length / 2)){
                return el;
            }
        return -1;  
    }
}