class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list= new ArrayList<>();
        int n=nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n-2;i++)
        {
            if(i>0)
            {
                if(i<n && nums[i]==nums[i-1])
                {
                    continue;
                }
            }

            if(i<n && nums[i]>0)
            {
                break;
            }
         for(int left=i+1, right=n-1;left<right;)
         {
            int sum=nums[i]+nums[left]+nums[right];

            if(sum==0)
            {
                list.add(List.of(nums[i], nums[left],nums[right]));
                left++;
                right--;

                while(left<right && nums[left]==nums[left-1])
                {
                    left++;
                }
                while(left<right && nums[right]==nums[right+1])
                {
                    right--;
                }
            }

            else if(sum<0)
            {
                left++;
            }
            else
            {
                right--;
            }

            
         }
            
        }

        return list;
    }
}
