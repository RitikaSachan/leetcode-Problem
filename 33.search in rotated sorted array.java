class Solution {
    public int search(int[] nums, int target) {
        int si=0;
        int ei=nums.length-1;
        while(si<=ei){
         int mid=(si+ei)/2;
         if(nums[mid]==target){
            return mid;
         }
         else if(nums[si]<=nums[mid]){
            if(nums[si]<=target && target<nums[mid]){
                ei=mid-1;
            }
            else{
                si=mid+1;
            }
         }
         else{
            if(nums[ei]>=target && nums[mid]<target){
                si=mid+1;
            }
            else{
                ei=mid-1;
            }
        }
     }
        return -1;
    }
}
