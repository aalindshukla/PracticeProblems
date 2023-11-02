class Solution {
    
    // Function to return beauty of every substring (stored as array)
    
    public int beauty(int[] arr){
        int n = arr.length;
        int maxi = -1;
        int mini = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            maxi = Math.max(maxi,arr[i]);
            if(arr[i] >=1){
                mini = Math.min(mini,arr[i]);
            }
        }
        return maxi - mini;
   }

    public int beautySum(String s) {
        int res = 0;
        for(int i=0;i<s.length();i++){
            int[] arr = new int[26];
            for(int j=i;j<s.length();j++){
                arr[s.charAt(j) - 'a']++;
                res = res + beauty(arr);
            }
        }
        return res;
    }
}