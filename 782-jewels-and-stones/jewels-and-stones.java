class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int res=0;
        Set<Character> set=new HashSet<>();
        for(char s:jewels.toCharArray()){
            set.add(s);
        }
        for(char s:stones.toCharArray()){
            if(set.contains(s)){
                res++;
            }
        }








        return res;
        
    }
}