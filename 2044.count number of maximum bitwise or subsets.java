class Solution {
    int max = 0, count = 0;

    public int countMaxOrSubsets(int[] nums) {
        for (int num : nums) {
            max |= num;
        }
        dfs(nums, 0, 0);
        return count;
    }

    private void dfs(int[] nums, int index, int orValue) {
        if (index == nums.length) {
            if (orValue == max) count++;
            return;
        }
        dfs(nums, index + 1, orValue | nums[index]);
        dfs(nums, index + 1, orValue);
    }
}
