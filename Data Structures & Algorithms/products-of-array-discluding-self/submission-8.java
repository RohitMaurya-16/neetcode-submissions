class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prod=1;
        int count=0;
        for(int x:nums)
        {
            if(x!=0)
            {
                prod*=x;
            }

            if(x==0)
            {
                count++;
            }
        }

        int k=prod;
        int arr[]= new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            if(count==1)
            {
                if(nums[i]==0)
                {
                    arr[i]=k;
                }
                else
                {
                    arr[i]=0;
                }
            }

            if(count>1)
            {
                arr[i]=0;
            }

            if(count<1)
            {
                arr[i]=k/nums[i];
                k=prod;
            }
        }

        return arr;
    }
}  
