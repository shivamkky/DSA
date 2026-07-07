class Solution {
    public boolean isPowerOfFour(int n) {
        if(n<=0)
        return false;
        int pow_2=(int)(n&(n-1));
        int count=0;
        while(n>0){
            int set=n&1;
            n=n>>1;
            if(set==0)
            count++;
            else
            break;
        }
        return pow_2==0 && count%2==0;
        }

        
    }
