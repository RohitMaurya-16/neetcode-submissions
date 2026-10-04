class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result= new ArrayList<>();
        int n=nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n-2;i++)
        {
            if(i>0)
            {
                if(i<n  && nums[i-1]==nums[i])
                {
                    continue;
                }
            }

            if(i<n && nums[i]>0)
            {
                break;
            }

            int left=i+1;
            int right=n-1;

            while(left<right)
            {
                int sum=nums[i]+nums[left]+nums[right];

                if(sum==0)
                {
                    result.add(List.of(nums[i],nums[left],nums[right]));
                    left++;
                    right--;
                    while(left<right && nums[left-1]==nums[left])
                    {
                        left++;
                    }

                    while(left<right && nums[right+1]==nums[right])
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

        return result;
    }
}
