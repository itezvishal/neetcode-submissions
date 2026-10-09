class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        int l = strs.length;
        String ans = "";

        for (int i = 0; i < strs[0].length(); i++) {
            for (int j = 0; j < l; j++) {
                if (i == strs[j].length() ||
                    strs[0].charAt(i) != strs[j].charAt(i)) {
                    return ans;
                }
            }
            ans += strs[0].charAt(i);
        }

        return ans;
    }
}
