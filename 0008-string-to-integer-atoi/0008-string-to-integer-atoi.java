class Solution {
    public int myAtoi(String s) {
        s = s.strip();
        if (s.isEmpty())
        return 0;
    
        int sign = s.charAt(0) == '-' ? -1 : 1;
        if (s.charAt(0) == '+' || s.charAt(0) == '-'){
            s = s.substring(1);
        }
        long ans = 0;
        for(char c: s.toCharArray()){
            if(!Character.isDigit(c)){
                break;
            }
            ans = ans * 10 + (c - '0');
            if(sign * ans <= Integer.MIN_VALUE){
                return Integer.MIN_VALUE;
            }
            else if(sign * ans >= Integer.MAX_VALUE){
                return Integer.MAX_VALUE;
            }
        }
        return sign * (int)ans;
    }
}