class Solution {
    public boolean isPowerOfTwo(int n) {
        int yes=0;
        int no=0;
        while(n>0){
            int last=n&1;
            n=n>>1;
            if(last==0){
                no++;
            }else{
                yes++;
            }
        }
        return yes==1;
        
    }
}