class Solution {
    public boolean isPalindrome(int x) {
        String num = Integer.toString(x);
        String rev = "";
        for(int i = num.length()-1;i>=0;i--){
            rev = rev + num.charAt(i);
        }
        if(rev.equals(num)){
            return true;
        }
        else{
            return false;
        } 
    }
}