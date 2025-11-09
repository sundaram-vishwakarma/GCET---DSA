class Solution {
    List<String> result;

    private void binaryString(int n, String ans) {
        if (n == 0) {
            result.add(ans);
            return;
        }

        if (ans.length()==0 || ans.charAt(ans.length()-1)=='1') {
            binaryString(n-1, ans + "0");
        }

        binaryString(n-1, ans + "1");
    }
    
    public List<String> validStrings(int n) {
        result = new ArrayList<>();
        binaryString(n, "");
        return result;
    }
}
