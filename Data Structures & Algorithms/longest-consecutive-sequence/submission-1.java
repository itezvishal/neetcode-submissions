

class Solution {
    public int longestConsecutive(int[] nums) {

        if (nums.length == 0) return 0;

        Arrays.sort(nums);

        int ic = 1;
        int ans = 1;

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] == nums[i - 1]) {
                continue;
            }

            if (nums[i] == nums[i - 1] + 1) {
                ic++;
            } else {
                ans = Math.max(ans, ic);
                ic = 1;
            }
        }

        return Math.max(ans, ic);
    }
}
