class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }

        int leftSum = 0;
        for (int i=0; i<n; i++) {
            int rightSum = totalSum - leftSum;
            leftSum += nums[i];
            nums[i] = Math.abs(leftSum - rightSum);
        }

        return nums;
    }
}
