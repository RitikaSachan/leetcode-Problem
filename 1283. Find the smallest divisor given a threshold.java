class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        if (nums.length > threshold) {
            return -1;
        }
        int low = 1;
        int high = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            high = Math.max(high, nums[i]);
        }

        while (low <= high) {
            int mid = (low + high) / 2;
            int divisor = divisorSum(nums, mid);

            if (divisor <= threshold) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }

        }
        return low;

    }

    public int divisorSum(int[] arr, int d) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += Math.ceil((double) (arr[i]) / (double) (d));
        }
        return sum;
    }

}
