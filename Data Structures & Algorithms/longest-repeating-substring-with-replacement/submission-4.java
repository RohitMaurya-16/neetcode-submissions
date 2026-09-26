class Solution {
    public int characterReplacement(String s, int k) {
        int freq[]= new int[26];
        int windowMax=0;
        int left=0;
        int maxFrq=0;
        for(int right=0;right<s.length();right++)
        {
            freq[s.charAt(right)-'A']++;
            
            maxFrq=Math.max(maxFrq, freq[s.charAt(right)-'A']);
           int window=right-left+1;
            if(window-maxFrq>k)
            {
                freq[s.charAt(left)-'A']--;
                left++;
            }
              window=right-left+1;
                windowMax=Math.max(windowMax,window);
        }
        return windowMax;
    }
}
