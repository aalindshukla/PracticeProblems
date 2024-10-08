//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().split(" ");

            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str[i]);
            }

            int[] ans = new Solve().findTwoElement(a, n);
            System.out.println(ans[0] + " " + ans[1]);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solve {
    int[] findTwoElement(int arr[], int n) {
        int[] hasharr = new int[n+1];
        int [] ans = new int[2];
        
        for(int i=0;i<=n;i++){
            hasharr[i] = 0;
        }
        
        for(int i =0;i<n;i++){
            hasharr[arr[i]]++;
        }
        
        for(int j=1;j<=n;j++){
            if(hasharr[j] == 2){
                ans[0] = j;
            }
            if(hasharr[j] == 0){
                ans[1] = j;
            }
        }
        
        return ans;
    }
}