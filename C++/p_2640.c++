class Solution {
public:
    vector<long long> findPrefixScore(vector<int>& nums) {
        int n = nums.size();
        vector<long long> res(n);
        
        res[0] = 2LL * nums[0];  // use 2LL to ensure 64-bit arithmetic
        int maxVal = nums[0];
        
        for (int i = 1; i < n; ++i) {
            maxVal = max(maxVal, nums[i]);
            res[i] = res[i - 1] + nums[i] + maxVal;
        }
        
        return res;
    }
};
