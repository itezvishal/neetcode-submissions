class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product=1;
        int zero=0;
        for(int n:nums){
            if(n==0){
                zero++;
            }else{
            product*=n;
            }
        }



        System.out.println(product);
        int[] ans=new int[nums.length];

        if(zero>=2){
            return ans;
        }
        if(zero>0){
            for(int i=0;i<nums.length;i++){
                if(nums[i]!=0){
                    ans[i]=0;
                }else{
                    ans[i]=product;
                }
            }
            return ans;
        }

        for(int i=0;i<nums.length;i++){
            ans[i]=product/nums[i];
        }
        return ans;



        
    }
}  
