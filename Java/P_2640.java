class Solution {
    public long[] findPrefixScore(int[] nums) {
        
        long[] res = new long[nums.length];

        res[0] = 2 * nums[0];
        
        int max = nums[0];

        for (int i=1; i<nums.length; i++) {
            max = Math.max(max, nums[i]);
            res[i] = res[i-1] + nums[i] + max;
        }

        return res;
    }
}
