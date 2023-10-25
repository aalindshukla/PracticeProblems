class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int[] ans = new int[2];
        int n = mat.length;
        int m = mat[0].length;
        int index = 0;
        int maxcount = 0;
        for(int i=0;i<n;i++){
            int onecount = 0;
            for(int j=0;j<m;j++){
                if(mat[i][j] == 1){
                    onecount++;
                }
            }
                if(onecount > maxcount){
                    maxcount = onecount;
                    index = i;
                }
            }
            ans[0] = index;
            ans[1] = maxcount;

            return ans;
    }   
}