//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int t=sc.nextInt();
		
		while(t-->0)
		{
		    int n=sc.nextInt();
		    int a[]=new int[n];
		    
		    for(int i=0;i<n;i++)
		    {
		        a[i]=sc.nextInt();
		    }
		    int m=sc.nextInt();
		    Solution ob = new Solution();
		    System.out.println(ob.findPages(a,n,m));
		}
	}
}
// } Driver Code Ends


//User function Template for Java

class Solution 
{
    static int maxi(int[]arr){
        Arrays.sort(arr);
        return arr[arr.length - 1];
    }
    static int sum(int[]arr){
        int s = 0;
        for(int i=0;i<arr.length;i++){
            s += arr[i];
        }
        return s;
    }
    
    // Function to check whether i students which can hold maximum allowed pages
    
       static boolean ispossible(int A[],int N,int M,int mid)
    {
        int studentcount=1;
        int pagesum=0;
        for(int i=0;i<N;i++)
        {
            if(pagesum+A[i]<=mid)
            {
            pagesum=pagesum+A[i];
            }
            else
            {
                studentcount++;
                if(studentcount >M || A[i]>mid)
                {
                    return false;
                }
                pagesum=A[i];
            }
        }
        return true;
        
    }
    
    public static int findPages(int[]A,int N,int M)
    {
        if(M>N){
            return -1;
        }
        int low = 0;
       // int low = maxi(A);
        int high = sum(A);
        int ans = -1;
        while(low <= high){
            int mid = low + (high - low)/2;
            boolean ns = ispossible(A,A.length,M,mid);
            if(ns == true){
                ans = mid;
                high = mid - 1;
                
            }
            else{
                low = mid + 1;
            }
        }
        return ans;
    }
};