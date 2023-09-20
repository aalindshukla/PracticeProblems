class Solution {
    public int hammingDistance(int x, int y) {
        int and = x ^ y;
        String s = Integer.toBinaryString(and);
        int n = s.length();
        int count = 0;
        for(int i=0;i<n;i++){
            if(s.charAt(i) == '1'){
                count++;
            }
        }
        return count; 
    }
}