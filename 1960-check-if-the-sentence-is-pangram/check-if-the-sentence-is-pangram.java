class Solution {
    public boolean checkIfPangram(String sentence) {
        Set<Character> set=new HashSet<>();
        for(char i=97;i<=122;i++){
            set.add(i);
        }
        for(int i=0;i<sentence.length();i++){
            if(set.contains(sentence.charAt(i))){
                set.remove(sentence.charAt(i));
                

            }
        }
        return (set.size()==0)?true:false;
    }
}