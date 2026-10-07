class Solution {
    public int findLucky(int[] arr) {
        int res=0;
        int [] freq=new int[501];
        for(int i:arr){
            freq[i]++;
        }
        for(int i=0;i<501;i++){
            if(freq[i]!=0 && freq[i]==i){
                res=i;
            }
        }
        return res>0?res:-1;
    }
}