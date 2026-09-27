class Solution {

    public String encode(List<String> strs) {
        if (strs == null || strs.isEmpty()) return "";

        List<String> list = new ArrayList<>();

        for (String s : strs) {
            list.add(String.valueOf(s.length()));
            list.add(",");
        }

        list.add("#");

        for (String s : strs) {
            list.add(s);
        }

        return String.join("", list);
    }

    public List<String> decode(String str) {
        List<String> list= new ArrayList<>();
        if(str==null || str.isEmpty()) return list;

        int idx=str.indexOf("#");

        String s=str.substring(0,idx);

        String nums[]=s.split(",");
        
        int suru=idx+1;

        for(String num:nums)
        {
            if(!num.isEmpty())
            {
                int pos= Integer.parseInt(num);

                list.add(str.substring(suru,suru+pos));
                suru+=pos;
            }
        }

        return list;
    }
}