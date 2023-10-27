class Solution {
    public int maxele(int[][]mat,int n,int m,int mid){
        int maxval = Integer.MIN_VALUE;
        int index = -1;
        for(int i=0;i<n;i++){
            if(mat[i][mid] > maxval){
                maxval = mat[i][mid];
                index = i;
            }
        }
        return index;
    }

    public int[] findPeakGrid(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int low = 0, high = m-1;
        while(low <= high){
            int mid = (low + high) / 2;
            int row = maxele(mat,n,m,mid);

            int left = mid - 1 > 0 ? mat[row][mid-1] : -1;
            int right = mid + 1 < m ? mat[row][mid+1] : -1;

            if(mat[row][mid] > right && mat[row][mid] >left){
                return new int[]{row,mid};
            }
            else if(mat[row][mid] < left){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return new int[]{-1,-1};
    }
}