class Solution {
    public String reverseWords(String s) {
        String[] str = s.trim().split("\\s+");
        String revstr = "";
        int len = str.length;
        for(int i=len-1;i>=0;i--){
            revstr =  revstr +" " + str[i];
        }
        return revstr.trim();
    }
}