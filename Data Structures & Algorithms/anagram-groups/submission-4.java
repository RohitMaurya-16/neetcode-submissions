class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
     Map<String, List<String>> map= new HashMap<>();

     for(String s:strs)
     {
        char ch[]=s.toCharArray();
        Arrays.sort(ch);
        String s1=new String(ch);

        map.computeIfAbsent(s1,k->new ArrayList<>()).add(s);
     }

     return  new ArrayList<>(map.values());
    }
}
