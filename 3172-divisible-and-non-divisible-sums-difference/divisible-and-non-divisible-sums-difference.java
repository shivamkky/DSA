class Solution {
    public int differenceOfSums(int n, int m) {
        int i=1;
        int j=1;
        int num1=0;
        int num2=0;
        while(i>=1&&i<=n){
          if(i%m!=0){
            num1+=i;
          }
          i++;
        }
        while(j>=1&&j<=n){
            if(j%m==0){
                num2+=j;
            }
            j++;
        }
        return num1-num2;
        
    }
}