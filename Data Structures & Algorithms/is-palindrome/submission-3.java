class Solution {
    public boolean isPalindrome(String s) {
        

        String str="";

        for(int i=0;i<s.length();i++)
        {
            char x= s.charAt(i);
            if(Character.isLetterOrDigit(x))
            {
                str+=x;
            }
        }

        int left=0;
        int right=str.length()-1;
        str=str.toLowerCase();
        while(left<right)
        {
            if(str.charAt(left)!=str.charAt(right))return false;

            left++;
            right--;
        }

        return true;
    }
}
