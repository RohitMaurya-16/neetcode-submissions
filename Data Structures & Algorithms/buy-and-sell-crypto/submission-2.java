class Solution {
    public int maxProfit(int[] prices) {
        
        int max=0;
        for(int i=0;i<prices.length;i++)
        {
            int left=i+1;
            while(left<prices.length)
            {
                if(prices[i]>prices[left])
                {
                    left++;
                }
                else
                {
                    int curr=prices[left]-prices[i];
                    max=Math.max(curr, max);
                    left++;
                }
            }

        }
        return max;
    }
}
