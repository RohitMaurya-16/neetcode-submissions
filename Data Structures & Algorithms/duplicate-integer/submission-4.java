class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> map= new HashSet<>();

        for(int x:nums)
        {
            if(map.contains(x))
            {
                return true;
            }
            map.add(x);
        }
  return false;
  
    }
}