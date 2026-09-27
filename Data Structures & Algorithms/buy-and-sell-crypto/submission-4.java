class Solution {
    public int maxProfit(int[] price) {
       int n=price.length;
       int min=price[0];
       int profit=0;

       for(int i=0;i<n;i++)
       {
        if(min>price[i])
        {
            min=price[i];
        }
        
        if(price[i]-min >profit) profit=price[i]-min;
       }

       if(profit>0)return profit;

       return 0;
     
    } 
}
