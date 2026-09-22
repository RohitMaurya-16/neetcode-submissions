class Solution {
    public int[] twoSum(int[] nums, int target) {
        List<Integer> list= new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            int k=target-nums[i];

            if(list.contains(k))
            {
                return new int[]{list.indexOf(k),i};
            }

            list.add(nums[i]);
        }

        return new int[]{};
    }
}
