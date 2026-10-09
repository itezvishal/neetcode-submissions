class Solution {
    public void sortColors(int[] nums) {
        // Sorting
        // Arrays.sort(nums);

        // Counting


        // Dutch Flag Algorithm
        int low=0,mid=0,high=nums.length-1;

        while(mid<=high){
            if (nums[mid]==0){
                swap(nums,low++,mid++);
            }else if(nums[mid]==1){
                mid++;
            }else if(nums[mid]==2){
                swap(nums,high--,mid);
            }
        }

    }

    private void swap(int[] nums,int a, int b){
        int temp=nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }


}