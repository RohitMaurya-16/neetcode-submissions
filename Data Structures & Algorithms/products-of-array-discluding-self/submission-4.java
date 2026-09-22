class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int arr[]= new int[n];
        int k=1;
        int count=0;
        for(int i=0;i<n;i++)
        {
         if(nums[i]!=0)
         {
            k*=nums[i];
         }
         if(nums[i]==0)
         {
            count++;
         }
        }
       
       int a=k;

       for(int i=0;i<n;i++)
       {
        if(count>1)
        {
            arr[i]=0;
        }
         else if(count==1)
         {
            if(nums[i]==0)
            {
                arr[i]=a;
            }
            else
            {
                arr[i]=0;
            }
         }
        else
        {
            arr[i]=a/nums[i];
        }
        a=k;
        }

       return arr;
    }
}  
