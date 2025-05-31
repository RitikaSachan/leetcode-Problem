class Solution {
    public int maxProduct(int[] nums) {
        // int max=Integer.MIN_VALUE;
        int max=nums[0];
        int n=nums.length;
        for(int i=0;i<n;i++){
            int current = 1;
            for(int j=i;j<n;j++){
                current=current*nums[j];
                max=Math.max(current,max);
            }
        }
            return max;
    }
}
