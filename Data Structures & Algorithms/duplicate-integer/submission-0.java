class Solution {
    public boolean hasDuplicate(int[] nums) {
        int total=0;
        for(int i:nums){
            total+=i;
        }
        int l=nums.length;
        int ans= ((l*(l+1))/2 )-total;
        return ans!=0 ? true : false;
    }
}