class Solution {
    public int countKDifference(int[] nums, int k) {
        int res=0;
        int [] ca=new int[101];
        for(int i:nums){
            ca[i]++;
        }
        for(int i=0;i<101-k;i++){
            res+=ca[i]*ca[i+k];
        }
       
        return res;
    }
}