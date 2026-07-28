class Solution {
    public int maximumProduct(int[] nums) {
        int a = Integer.MIN_VALUE;
        int b = Integer.MIN_VALUE;
        int c = Integer.MIN_VALUE;
        

        int x=Integer.MAX_VALUE;
        int y=Integer.MAX_VALUE;
        for(int num:nums){
            int oa=a,
                ob=b,
                ox=x;

                a=Math.max(a,num);
                b=Math.max(b,Math.min(oa,num));
                c=Math.max(c,Math.min(ob,num));

                x=Math.min(x,num);
                y=Math.min(y,Math.max(ox,num));
        }
        return Math.max(a*b*c,a*x*y);
    }
}