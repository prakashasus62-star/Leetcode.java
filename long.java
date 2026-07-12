class Solution {
    public int lengthOfLIS(int[] nums) {
        int size=nums.length,mLen=1;
        int []dp=new int[size];
        Arrays.fill(dp,1);
        for(int i=1;i<size;i++){
            for(int j=0;j<i;j++){
                if(nums[i]>nums[j]){
                    dp[i]=Math.max(dp[i],dp[j]+1);
                    mLen=Math.max(mLen,dp[i]);
                }
            }
        }
        
    return mLen;
    }
}