class Solution {
    public int majorityElement(int[] nums) {
        int major=nums[0];
        int vote=1;
        for(int i=1;i<nums.length;i++){
            if(vote==0){
                vote++;
                major=nums[i];
            }
            else if(major==nums[i]){
                vote++;
            }
            else{
                vote--;
            }
        }
        return major;
        // Arrays.sort(nums);
        // return nums[nums.length/2];
    }
}
