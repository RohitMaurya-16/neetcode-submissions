class Solution {
    public int[] productExceptSelf(int[] nums) {
      int a=nums.length;
      int arr[]=new int[a];
      for(int i=0;i<a;i++){
        int pro=1;
        for(int j=0;j<a;j++){
            if(j!=i){
                pro*=nums[j];
            }
        }
        arr[i]=pro;
      }
      return arr;
    }
}  
