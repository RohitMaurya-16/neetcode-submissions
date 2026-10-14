

class Solution {

    public static class TrieNode
    {
        TrieNode children[]=new TrieNode[26];
        String word;
    }

    public TrieNode root;

    List<String> result;
    
    public List<String> findWords(char[][] board, String[] words) {
        
        root=new TrieNode();

        result= new ArrayList<>();

        for(String word :words)
        {
            insert(word);
        }

        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[0].length;j++)
            {
                search(board,i,j,root);
            }
        }
        
        return result;
    }


    private void insert(String word)
    {
        TrieNode  current=root;

        for(char ch:word.toCharArray())
        {
            int index=ch-'a';

            if(current.children[index]==null)
            {
                current.children[index]= new TrieNode();
            }
            current=current.children[index];
        }
        current.word=word;
    }

    private void search(char[][] board, int r,int c,TrieNode node)
    {

        if (r < 0 || c < 0 ||
            r >= board.length || c >= board[0].length ||
            board[r][c] == '#') {
            return;
        }

        char ch=board[r][c];
        // board[r][c]='#';
        int idx=ch-'a';

        TrieNode nd= node.children[idx];

        if(nd==null)
        {
            return;
        }

        if(nd.word!=null)
        {
            result.add(nd.word);
            nd.word=null;
        }

        board[r][c]='#';

         search(board, r+1, c, nd);
          search(board,r-1,c,nd);
           search(board,r,c+1,nd);
            search(board,r,c-1,nd);

            board[r][c]=ch;
    }
}