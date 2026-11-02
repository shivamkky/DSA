class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        int n=popped.length;
        int j=0;
        int k=-1;
        for(int i=0;i<n;i++){
            pushed[++k]=pushed[i];
            while(k>-1 && pushed[k]==popped[j]){
                k--;
                j++;
            }
        }
        return k==-1;
    }
}