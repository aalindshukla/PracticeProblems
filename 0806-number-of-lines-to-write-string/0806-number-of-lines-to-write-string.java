class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        String apl = "abcdefghijklmnopqrstuvwxyz";
        int sum = 0;
        int count = 0;
        int line[] = new int[2];

        for(int i = 0;i<s.length();i++){
           int ind = apl.indexOf(s.charAt(i));
           sum += widths[ind];

           if(sum >  100){
               count++;
               sum = widths[apl.indexOf(s.charAt(i))];
           }
           else{
               continue;
           }
        }
        line[0] = count+1;
        line[1] = sum;
        return line;
    }
}