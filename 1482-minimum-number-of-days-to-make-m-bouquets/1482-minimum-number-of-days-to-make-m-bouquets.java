class Solution {
    public boolean ispossible(int[] arr, int day, int m, int k){
        int n = arr.length;
        int numbouq = 0;
        int count = 0;
        for(int i=0;i<n;i++){
            if(arr[i] <= day){
                count++;
            }
            else{
                numbouq += (count/k);
                count = 0;
            }
        }
        numbouq += (count/k);
        if(numbouq >= m){
            return true;
        }
        else{
            return false;
        }
    }

    public int minDays(int[] bloomDay, int m, int k) {
        long val = (long) m * k;
        int n = bloomDay.length;
        if(val > n) return -1;
        int mini = Integer.MAX_VALUE, maxi = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            mini = Math.min(mini,bloomDay[i]);
            maxi = Math.max(maxi,bloomDay[i]);
        }
        int low = mini, high = maxi;
        while(low <= high){
            int mid = (low + high) / 2;
            if(ispossible(bloomDay,mid,m,k)){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return low;
    }
}