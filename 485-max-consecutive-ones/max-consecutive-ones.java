class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int left=0;
        int ans=-1;
        int window=0;
        for(int right=0;right<nums.length;right++){
            // "add" element nums[right] to window
            window+=nums[right];


            //while condition not met
              // do some logic to remove left from window and left++
              while(right-left+1 !=window){
                window -=nums[left];
                left++;
              }


            // update the answer
            ans=Math.max(ans,right-left+1);
        }
        return ans;
        
    }
}