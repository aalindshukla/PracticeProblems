class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^A-Za-z0-9]","");
        String rev = "";
        for(int i=s.length()-1;i>=0;i--){
            rev += s.charAt(i);
        }
        System.out.println(rev);
        if(s.equalsIgnoreCase(rev)){
            return true;
        }
        return false;
    }
}