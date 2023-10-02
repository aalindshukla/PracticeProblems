class Solution {
    public static void reverseArray(int arr[], int n){
    int p1 = 0,p2 = n-1;
    while(p1<p2){
        swap(arr,p1,p2);
        p1++;p2--;
    }
}

public static void swap(int arr[], int i, int j){
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
}

public static void swapmat(int arr[][],int i, int j){
    int temp = arr[i][j];
    arr[i][j] = arr[j][i];
    arr[j][i] = temp;
}

    public void rotate(int[][] matrix) {
        int n = matrix.length;

        // Transposing the matrix

        for(int i=0;i<=n-2;i++){
            for(int j=i+1;j<=n-1;j++){
                swapmat(matrix,i,j);
            }
        }
        // Reversing each rows of the transposed matrix (to get 90)

        for(int i=0;i<n;i++){
            reverseArray(matrix[i],n);
        } 
    }
}