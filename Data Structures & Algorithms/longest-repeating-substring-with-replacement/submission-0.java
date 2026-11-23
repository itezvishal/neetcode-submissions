class Solution {
    public int characterReplacement(String s, int k) {

        int left = 0;
        int maxFreq = 0;
        int maxLength = 0;

        int[] freq = new int[26];

        for (int right = 0; right < s.length(); right++) {

            char ch = s.charAt(right);

            freq[ch - 'A']++;

            maxFreq = Math.max(maxFreq, freq[ch - 'A']);

            int windowLength = right - left + 1;

            int replacements = windowLength - maxFreq;

            while (replacements > k) {

                freq[s.charAt(left) - 'A']--;

                left++;

                windowLength = right - left + 1;

                replacements = windowLength - maxFreq;
            }

            maxLength = Math.max(maxLength, windowLength);
        }

        return maxLength;
    }
}