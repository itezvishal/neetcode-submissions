class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> m=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            if(m.containsKey(target-nums[i])){
                return new int[]{m.get(target-nums[i]),i+1};
            }
            m.put(nums[i],i+1);
        }

        return new int[]{};

    }
}
