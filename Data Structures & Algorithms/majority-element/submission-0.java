class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> ans=new HashMap<>();

        for(int i:nums){
            ans.put(i,ans.getOrDefault(i,0)+1);
        }

        // loop thrpoough map and value > n/2 return key
        int n=nums.length;
        for(Map.Entry<Integer,Integer> entry:ans.entrySet()){
            if(entry.getValue()> n/2){
                return entry.getKey();
            }
        }

        return -1;
        
    }
}