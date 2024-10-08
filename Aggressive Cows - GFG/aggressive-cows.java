//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t;
        t = sc.nextInt();
        while (t-- > 0) {

            int n;
            n = sc.nextInt();

            int k;
            k = sc.nextInt();

            int[] v = new int[n];
            for (int i = 0; i < n; i++) v[i] = sc.nextInt();

            Solution obj = new Solution();
            int res = obj.solve(n, k, v);

            System.out.println(res);
        }
    }
}

// } Driver Code Ends


// User function Template for Java
class Solution {
    public static int solve(int n, int k, int[] stalls) {
        Arrays.sort(stalls);
        int ans=-1;
        int min=Integer.MAX_VALUE,  max=Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            min=Math.min(min,stalls[i]);
            max=Math.max(max,stalls[i]);
        }

 //SETTING SEARCH SPACE

        int low = 0;
        int high = max-min;
        int mid=0;        
        while(low<=high){
            mid = low+(high-low)/2;          
            if(isValidDistance(stalls, n, k, mid)){      //if valid, search in right to maximise 
                ans=mid;
                low = mid+1;
            }
            else
                high = mid-1;                     //if not valid, then greater value       
                }
        return ans;
    }
    
    static boolean isValidDistance(int[] stalls, int n, int cow, int mid){
        int cowCount=1, position = stalls[0];
        for(int i=1; i<n; i++){
            if(stalls[i]-position >= mid){
                cowCount++;
                if(cowCount == cow)
                    return true;
                position = stalls[i];      //placement of new cow
            }
        }
        return false;
    }
}