class Solution {
    public int characterReplacement(String s, int k) {

        int frq[]= new int[26];

        int maxWindow=0;
        int window=0;
        int maxFrq=0;
        int left=0;
        for(int i=0;i<s.length();i++)
        {
            frq[s.charAt(i)-'A']++;
            maxFrq=Math.max(maxFrq,frq[s.charAt(i)-'A']);

            window=i-left+1;

            if(window-maxFrq>k)
            {
                frq[s.charAt(left)-'A']--;
                left++;
            }

            window=i-left+1;

            maxWindow=Math.max(window, maxWindow);

        }
return maxWindow;
    }
}
