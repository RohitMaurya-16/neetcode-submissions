class Solution {
    public boolean hasDuplicate(int[] nums) {
        int count=0;
       int a = nums.length;
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<a;j++)
            {
                if(nums[i]==nums[j])
                {
                    count++;
                }

            }
        }
        if(count>a)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}