class Solution {
    public int differenceOfSums(int n, int m) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();

        int sum1 = 0,sum2 = 0;
        for(int i=1;i<=n;i++){
            if(i % m != 0){
                list1.add(i);
            }
            else{
                list2.add(i);
            }
        }
        for(int num : list2){
            sum2 += num;
        }

        for(int num : list1){
            sum1 += num;
        }

        return sum1 - sum2;
    }
}