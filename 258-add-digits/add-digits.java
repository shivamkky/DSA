class Solution {
    public int addDigits(int num) {
        int sum=0;
        if(num <=0)
        return 0;
        while(num>0){
            int first=num/10;
            int second=num%10;
            sum=first+second;
           if (sum >= 0 && sum <= 9)
            return sum;
            num=sum;

        }
        return num;
        
    }
}