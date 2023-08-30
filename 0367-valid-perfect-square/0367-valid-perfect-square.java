class Solution {
    public boolean isPerfectSquare(int num) {
        if(Math.floor(Math.sqrt(num)) == Math.ceil(Math.sqrt(num))){
            return true;
        }
        else{
            return false;
        }
    }
}