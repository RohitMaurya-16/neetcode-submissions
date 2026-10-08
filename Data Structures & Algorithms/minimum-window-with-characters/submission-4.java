class Solution {
    public String minWindow(String s, String t) {
       
    int arrT[]= new int[256];
    int arrS[]= new int[256];

    for(char ch:t.toCharArray())
    {
        arrT[ch]++;
    }

    int left=0;
    int min=Integer.MAX_VALUE;
    int start=0;

    for(int right=0;right<s.length();right++)
    {
        arrS[s.charAt(right)]++;

        while(contains(arrT, arrS))
        {
           if(min>right-left+1)
           {
            min=right-left+1;
            start=left;
           }
           
           arrS[s.charAt(left++)]--;
        }

    }

    return min==Integer.MAX_VALUE?"":s.substring(start,start+min);
 }

    private boolean contains(int arrT[], int arrS[])
    {
        for(int i=0;i<256;i++)
        {
            if(arrT[i]>arrS[i])return false;
        }

        return true;
    }
}
