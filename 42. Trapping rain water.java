class Solution {
    public int trap(int[] height) { 
         int n = height.length;

        // left max array
        int leftMax [] = new int[n];
        leftMax[0] = height[0];
        for(int i = 1; i<n; i++) {
            leftMax[i] = Math.max(leftMax[i-1],height[i]);
        }

        //right max array
        int rightMax [] =new int[n];
        rightMax[n-1]=height[n-1];
        for(int i=n-2; i>=0; i--) {
            rightMax[i] = Math.max(rightMax[i+1], height[i]);
        }

        int trappedWater=0;

        //loop
        for(int i = 0; i<height.length; i++) {

            //Water level = min(left max boundary, right max boundary)
            int waterLevel = Math.min(leftMax[i], rightMax[i]);

            //trapped water = water level - height[i]
            trappedWater +=waterLevel-height[i];
        }
        return trappedWater;
        
    }
}
