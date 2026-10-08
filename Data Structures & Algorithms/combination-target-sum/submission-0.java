class Solution {
    List<List<Integer>> res;
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        res= new ArrayList<>();

        List<Integer> curr= new ArrayList<>();
        
        cs(nums, target, curr, 0);
        return res;
    }

    private void cs(int nums[], int t, List<Integer> curr, int i)
    {


        if(t<0 || i>=nums.length)
        {
            return;
        }
        
        if(t==0)
        {
            res.add(new ArrayList<>(curr));
            return;
        }
        
        curr.add(nums[i]);
        cs(nums, t-nums[i],curr,i);

        curr.remove(curr.size()-1);

        cs(nums,t,curr,i+1);
    }
}






