class Solution {
    public int characterReplacement(String s, int k) {
        int f[]= new int[26];
        int maxf=0;
        int maxWindow=0;
        int window=0;
        int left=0;
        for(int i=0;i<s.length();i++)
        {
            f[s.charAt(i)-'A']++;
            maxf=Math.max(maxf,f[s.charAt(i)-'A']);
            window=i-left+1;

            if(window-maxf>k)
            {
                f[s.charAt(left)-'A']--;
                left++;
            }
            window=i-left+1;
            maxWindow=Math.max(window,maxWindow);
        }

        return maxWindow;
    }
}
