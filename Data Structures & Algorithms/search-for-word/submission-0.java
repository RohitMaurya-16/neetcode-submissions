class Solution {
    public boolean exist(char[][] board, String word) {
        
        char arr[]= word.toCharArray();

        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[0].length;j++)
            {
                if(arr[0]==board[i][j] && exist(board, arr, i, j, 0))return true;
            }
        }

        return false;
    }

    private boolean exist(char[][] b, char[] s, int i, int j, int index)
    {

        if(i<0 || i>=b.length || j<0 || j>=b[0].length || b[i][j]=='#' || b[i][j]!=s[index] )return false;

        if(index==s.length-1)return true;
        
        char ch=b[i][j];
        b[i][j]='#';

       boolean res= exist(b,s,i+1,j,index+1)||
        exist(b,s,i-1,j,index+1)||
        exist(b,s,i,j+1,index+1)||
        exist(b,s,i,j-1,index+1);

        b[i][j]=ch;

        return res;
    }
}
