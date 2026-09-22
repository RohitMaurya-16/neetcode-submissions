class Solution {
    public int[] twoSum(int[] nums, int target) {
    int arr[]=new int[2];
    int a=nums.length;
     for(int i=0;i<a;i++)
     {
        for(int j=0;j<a;j++)
        {
            if((nums[i]+nums[j]==target) &&(i!=j))
            {
                 return new int[]{i, j};
            }
            
     }   
    }
    return arr;
    }
}
