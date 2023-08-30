class Solution {
    public int lengthOfLastWord(String s) {
        int index = 0;
        String str = "";
        for(int i = s.length()-1;i>=0;i--){
            str += s.charAt(i);
        }
        str = str.trim();

        if(str.length() == 1){
            return 1;
        }
        for(int i= 0;i<str.length();i++){
            if(str.charAt(i) == ' '){
                index = i;
                break;
            }
            else{
                index = str.length();
            }
        }
        return index; 
    }
}