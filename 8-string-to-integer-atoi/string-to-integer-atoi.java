class Solution {
    public int myAtoi(String s) {
        int atoi=0;
        s=s.strip();
        if(s.length()==0){
            return 0;
        }
        int sign=1;
        int i=0;
        if (s.charAt(0) == '-') {
            sign = -1;
            i++;
        } else if (s.charAt(0) == '+') {
            i++;
        }
        for(;i<s.length();i++){
            if (s.charAt(i)>='0' && s.charAt(i)<='9'){
                int digit = s.charAt(i) - '0';

                if (atoi > Integer.MAX_VALUE / 10 ||
                    (atoi == Integer.MAX_VALUE / 10 && digit > 7)) {
                    return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                }
                    atoi = atoi * 10 + (s.charAt(i) - '0');
            }else{
                break;
            }
        }
        return atoi*sign;
        
    }
}