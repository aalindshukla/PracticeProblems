class Solution {
    public int maxDepth(String s) {
        int depth = 0, opencnt = 0;
        for(char c : s.toCharArray()){
            if(c == '('){
                opencnt++;
            }
            else if(c ==')'){
                opencnt--;
            }
            depth = Math.max(depth,opencnt);
        }
        return depth;
    }
}