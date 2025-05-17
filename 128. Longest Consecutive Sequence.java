class Solution {
    public int longestConsecutive(int[] nums) {
        int count=0;
        int temp=Integer.MIN_VALUE;
        int longest=1;
        if(nums.length==0){
            return 0;
        }
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]-1==temp){
                count += 1;
                temp=nums[i];
            }
            else if(nums[i]!=temp){
                count=1;
                temp=nums[i];
            }
            longest = Math.max(longest,count);
        }
        return longest;
    }
}
