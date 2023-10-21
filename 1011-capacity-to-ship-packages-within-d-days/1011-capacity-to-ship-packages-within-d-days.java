class Solution {

    public int maximum(int[] arr){
        int maxi = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            maxi = Math.max(maxi,arr[i]);
        }
        return maxi;
    }
    public int sum(int[] arr){
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
        }
        return sum;
    }

    // Function to calulate the number of days required to ship weights in given capacity.

    public int daysReq(int [] weights, int cap){
        int days = 1, load = 0;
        for(int i=0;i<weights.length;i++){
            if(load + weights[i] > cap){
                days += 1;
                load = weights[i];
            }
            else{
                load += weights[i];
            }
        }
        return days;
    }


    public int shipWithinDays(int[] weights, int days) {
        int low = maximum(weights);
        int high = sum(weights);
        while(low <= high){
            int mid = (low + high) / 2;
            int numofdays = daysReq(weights,mid);
            if(numofdays <= days){
                high = mid -1;
            }
            else{
                low = mid +1;
            }
        }
        return low;
    }
}