class Solution {
public:
    vector<string> result;

    void binaryString(int n, string ans) {
        if (n == 0) {
            result.push_back(ans);
            return;
        }

        // Only add '0' if the last character is '1' or string is empty
        if (ans.empty() || ans.back() == '1') {
            binaryString(n - 1, ans + "0");
        }

        // Always try adding '1'
        binaryString(n - 1, ans + "1");
    }

    vector<string> validStrings(int n) {
        result.clear();
        binaryString(n, "");
        return result;
    }
};
