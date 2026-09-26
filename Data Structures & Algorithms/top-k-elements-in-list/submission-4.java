class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
       Map<Integer, Integer> map= new HashMap<>();

       for(int x:nums)
       {
        map.merge(x,1, Integer::sum);
       }

       PriorityQueue<int[]> q= new PriorityQueue<>((a,b)->b[1]-a[1]);
       
       for(Map.Entry<Integer, Integer> entry:map.entrySet())
       {
        q.offer(new int[]{entry.getKey(), entry.getValue()});
       }

       int arr[]= new int[k];
       for(int i=0;i<k;i++)
       {
        arr[i]=q.poll()[0];
       }
      return arr;
    }
}
