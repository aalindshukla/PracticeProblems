class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        int i=0;
        int j=1;
        for(int k=0;k<n;k++){
            if(nums[k] > 0){
                arr[i] = nums[k];
                i += 2;
            }
            else{
                arr[j] = nums[k];
                j += 2;
            }
        }
        return arr;
    }
}