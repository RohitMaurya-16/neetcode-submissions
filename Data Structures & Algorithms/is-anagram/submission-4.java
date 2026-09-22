class Solution {
    public boolean isAnagram(String s, String t) {
        char[] ch=s.toCharArray();
        char[] ch1=t.toCharArray();
        Arrays.sort(ch);
        Arrays.sort(ch1);
        // String s1=ch.toString();
        // String s2=ch.toString();
        return new String(ch).equals(new String(ch1));
    }
} 
