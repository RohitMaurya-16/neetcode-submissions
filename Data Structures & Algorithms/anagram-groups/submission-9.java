class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
     Map<String, List<String>> map=new HashMap<>();

     for(String x:strs)
        {
            char ch[]=x.toCharArray();
            Arrays.sort(ch);
            String s= new String(ch);

            map.computeIfAbsent(s,k->new ArrayList<>()).add(x);
        }

        return new ArrayList<>(map.values());
    }
}
