class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        double div = dividend / divisor;
        if(div < 0){
            return (int)Math.ceil(div);
        }
        else{
            return (int)Math.floor(div);
        }       
    }
}