class Solution {
    public int maxScore(String s) {
        int totalOne = 0;
        for (char ch : s.toCharArray()) {
            if (ch=='1') totalOne++;
        }

        int left0 = 0;
        int right1 = totalOne;
        if (s.charAt(0)=='0') {
            left0++;
        } else {
            right1--;
        }

        int ans = left0 + right1;

        for (int i=1; i<s.length()-1; i++) {
            if (s.charAt(i)=='0') {
                left0++;
            } else {
                right1--;
            }
            ans = Math.max(ans, left0 + right1);
            // System.out.println(left0 + " : " + right1 + " : " + ans);
        }

        return ans;
    }
}
