public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> res = new HashMap<>();
        System.out.println("Input words: " + Arrays.toString(strs));

        for (String s : strs) {
            System.out.println("\nProcessing word: " + s);

            int[] count = new int[26];

            for (char c : s.toCharArray()) {
                count[c - 'a']++;
                System.out.println("  Counting letter: " + c);
            }

            String key = Arrays.toString(count);
            System.out.println("  Key (letter count): " + key);

            res.putIfAbsent(key, new ArrayList<>());
            System.out.println("  Adding word to group with key");

            res.get(key).add(s);
            System.out.println("  Current group: " + res.get(key));
        }

        System.out.println("\nFinal grouped anagrams:");
        System.out.println(res.values());

        return new ArrayList<>(res.values());
    }
}
