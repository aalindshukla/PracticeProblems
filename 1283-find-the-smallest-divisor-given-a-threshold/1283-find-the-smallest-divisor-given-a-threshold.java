class Solution {

    // To get the sum of Divisior.
    public int sumofDiv(int[] nums, int mid){
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            sum += Math.ceil((double)nums[i] / (double)mid);
        }
        return sum;
    }

    // To find the maximum integer from the array

    public int maximum(int [] nums){
        int maxi = Integer.MIN_VALUE;
        for(int i =0;i<nums.length;i++){
            maxi = Math.max(maxi,nums[i]);
        }
        return maxi;
    }

    public int smallestDivisor(int[] nums, int threshold) {
        int low = 1, high = maximum(nums), ans = -1;
        while(low<=high){
            int mid = (low + high ) / 2;

            if(sumofDiv(nums,mid) <= threshold){
                ans = mid;
                high = mid -1;
            }
            else{
                low = mid + 1;
            }
        }
        return ans;
    }
}