class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
     Map<String,List<String>> map= new HashMap<>();

     for(String s:strs)
     {
        char ch[]=s.toCharArray();
        Arrays.sort(ch);
        String a=new String(ch);

            // map.computeIfAbsent(a,new ArrayList<>()).add(s);
            map.computeIfAbsent(a, k -> new ArrayList<>()).add(s);
     }

     return new ArrayList<>(map.values());
    }
}
