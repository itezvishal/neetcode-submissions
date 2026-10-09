class Solution {
    public boolean hasDuplicate(int[] nums) {
        // it will work only for 0 to n;
        
        // int total=0;
        // for(int i:nums){
        //     total+=i;
        // }
        // int l=nums.length;
        // int ans= ((l*(l+1))/2 )-total;
        // return ans!=0 ? true : false;


    HashSet<Integer> seen=new HashSet<>();

    for(int num:nums){
        if(seen.contains(num)){
            return true;
        }
        seen.add(num);
    }

    return false;



    }
}