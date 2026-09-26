class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
     Map<String,List<String>> list= new HashMap<>();

     for(String s:strs)
     {
        char ch[]=s.toCharArray();
        Arrays.sort(ch);
        String a= new String(ch);
        list.computeIfAbsent(a,k->new ArrayList<>()).add(s);
     }
     return new ArrayList<>(list.values());
    }
}
