//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

class GFG {
  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    while (T-- > 0) {
      int n = sc.nextInt();
      int a[] = new int[n];
      for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
      }
      int k = sc.nextInt();
      Solution obj = new Solution();
      double ans = obj.findSmallestMaxDist(a,k);
      System.out.printf("%.2f",ans);
      System.out.println();
    }
  }
}


// } Driver Code Ends


//User function Template for Java

class Solution {
    public static int noOfGasStationsBetween(int[] arr, double dist) {
    int cnt = 0, n = arr.length;

    for (int i = 0; i < n - 1; i++) {
      double stationsInBetween = (arr[i + 1] - arr[i]) / dist;
      cnt += stationsInBetween;
    }

    return cnt;
  }
    
    
  public static double findSmallestMaxDist(int stations[],int K) {
      
    int n = stations.length;
    double maxi = Integer.MIN_VALUE;
    for (int i = 0; i < n - 1; i++) 
    maxi = Math.max(maxi, (double) (stations[i + 1] - stations[i]));

    double low = 0, high = maxi, diff = 1e-6; // 10^-6
    while(high - low > diff) {
        double mid = low + (high - low) / 2;
        if(noOfGasStationsBetween(stations, mid) <= K)
            high=mid;
        else    
            low=mid;
    }
    
    return high;
      
  }
}
     