class Solution {
    public int maxArea(int[] nums) {
       int left=0;
       int right=nums.length-1;

       int max=0;

       while(left<right)
       {
        max=Math.max(max, Math.min(nums[left],nums[right])*(right-left));

        if(nums[left]<nums[right])
        {
            left++;
        }
        else
        {
            right--;
        }
       }

       return max;
    }
}
