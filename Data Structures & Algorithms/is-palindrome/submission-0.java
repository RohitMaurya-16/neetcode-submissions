class Solution {
    public boolean isPalindrome(String s) {
        String a="";
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(Character.isLetterOrDigit(ch))
            {
                a+=ch;
            }
        }

        int left=0;
        int right=a.length()-1;
        a=a.toLowerCase();
        while(left<right)
        {
            if(a.charAt(left)!=a.charAt(right))
            {return false;}
            left++;
            right--;
            
        }
        return true;
    }
}
