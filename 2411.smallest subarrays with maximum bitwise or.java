class Solution {
    public int[] smallestSubarrays(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int[] lastSeen = new int[32];

        for (int i = n - 1; i >= 0; i--) {
            for (int bit = 0; bit < 32; bit++) {
                if ((nums[i] & (1 << bit)) > 0) {
                    lastSeen[bit] = i;
                }
            }

            int maxPos = i;
            for (int bit = 0; bit < 32; bit++) {
                maxPos = Math.max(maxPos, lastSeen[bit]);
            }
            result[i] = maxPos - i + 1;
        }

        return result;
    }
}
