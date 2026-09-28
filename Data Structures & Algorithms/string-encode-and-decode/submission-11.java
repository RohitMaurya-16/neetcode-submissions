class Solution {

    public String encode(List<String> strs) {
        if(strs==null || strs.isEmpty())return "";

         ArrayList<String> list= new ArrayList<>();

         for(String s:strs)
         {
            list.add(String.valueOf(s.length()));
            list.add(",");
         }

         list.add("#");

         for(String s:strs)
         {
            list.add(s);
         }

         return String.join("",list);
    }
    public List<String> decode(String str)
    {
        List<String> list= new ArrayList<>();

        if(str==null || str.isEmpty())return list;
         
        int index=str.indexOf("#");

        String cut=str.substring(0,index);
        String nums[]=cut.split(",");
        
        int start=index+1;

        for(String num:nums)
        {
            if(!num.isEmpty())
            {
                int n=Integer.parseInt(num);

                list.add(str.substring(start,start+n));
                start+=n;
            }
        }
        return list;
    }

}