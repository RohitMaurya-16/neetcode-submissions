class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // [-4,-1,-1,0,1,2]
        Arrays.sort(nums);
       List<List<Integer>> result= new ArrayList<>();
        for(int i=0;i<nums.length-1;i++)
        {
            int left=i+1;
            int right= nums.length-1;
            while(left<right)
            {
                if(nums[i]+nums[left]+nums[right]==0)
                {
                    List<Integer>list= new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[left]);
                    list.add(nums[right]);
                    left++;
                    right--;
                    if(!result.contains(list))
                    {
                        result.add(list);
                    }
                }

                 else if(nums[i]+nums[left]+nums[right]<0)
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
