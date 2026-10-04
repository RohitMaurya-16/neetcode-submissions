class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prod=1;
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                count++;
            }
            else
            {
            prod*=nums[i];
            }
        }

        int arr[]= new int[nums.length];
        int curr=prod;
        for(int i=0;i<nums.length;i++)
        {
            if(count>1)
            {
                nums[i]=0;
            }

            else if(count==1)
            {
                 if(nums[i]==0)
                 {
                    arr[i]=prod;
                 }
                 else
                 {
                    arr[i]=0;
                 }
            }

            else
            {
                arr[i]=curr/nums[i];
                curr=prod;
            }
        }

        return arr;
    }
}  
