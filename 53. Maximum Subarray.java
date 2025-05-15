class Solution {
    public int maxSubArray(int[] nums) {
        int currentsum=0;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            currentsum=Math.max(nums[i],nums[i]+currentsum);
            maxsum=Math.max(currentsum,maxsum);
        }
        return maxsum;
    }
}
