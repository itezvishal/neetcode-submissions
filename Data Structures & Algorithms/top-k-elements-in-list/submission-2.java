class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        int[] ans = new int[k];

        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<Map.Entry<Integer, Integer>> list =
                new ArrayList<>(map.entrySet());

        // Sort by frequency descending
        list.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        Iterator<Map.Entry<Integer, Integer>> itr =
                list.iterator();

        int index = 0;

        while (itr.hasNext() && index < k) {
            Map.Entry<Integer, Integer> entry = itr.next();
            ans[index++] = entry.getKey();
        }

        return ans;
    }
}
