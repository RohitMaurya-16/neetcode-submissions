class Solution {
    public String minWindow(String s, String t) {
        int arrS[]= new int[256];
        int arrT[]= new int[256];

        for(char ch:t.toCharArray())
        {
            arrT[ch]++;
        }

        int left=0;
        int minLen=Integer.MAX_VALUE;
        int start=0;

        for(int right=0;right<s.length();right++)
        {
            arrS[s.charAt(right)]++;

            while(contains(arrS,arrT))
            {
                if(minLen>right-left+1)
                {
                    minLen=right-left+1;
                    start=left;
                }
               arrS[s.charAt(left++)]--;
            }
            

            
        }

        return minLen==Integer.MAX_VALUE?"": s.substring(start, start+minLen);
    }

    private boolean contains(int mapS[], int mapT[])
    {
        for(int i=0;i<256;i++)
        {
            if(mapT[i]>mapS[i])return false;

        }
        return true;
    }
}
