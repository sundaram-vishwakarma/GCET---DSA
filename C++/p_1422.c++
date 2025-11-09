class Solution {
public:
    int maxScore(string s) {
        int totalOne = 0;
        
        // Count total number of '1's in the string
        for (char ch : s) {
            if (ch == '1') totalOne++;
        }

        int left0 = 0;
        int right1 = totalOne;
        
        // Initial adjustment for the first character
        if (s[0] == '0') {
            left0++;
        } else {
            right1--;
        }

        int ans = left0 + right1;

        // Traverse from the second character to the second last character
        for (int i = 1; i < s.length() - 1; i++) {
            if (s[i] == '0') {
                left0++;
            } else {
                right1--;
            }
            ans = max(ans, left0 + right1);
        }

        return ans;
    }
};
