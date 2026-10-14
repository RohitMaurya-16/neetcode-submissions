class TrieNode
{
    TrieNode children[]=new TrieNode[26];
    boolean isEnd=false;
}

class WordDictionary {

private TrieNode root;
    public WordDictionary() {

        root=new TrieNode();

    }

    public void addWord(String word) {

        TrieNode current=root;

        for(char ch: word.toCharArray())
        {
            int idx=ch-'a';

            if(current.children[idx]==null)
            {
                current.children[idx]=new TrieNode();
            }

            current=current.children[idx];
        }

        current.isEnd=true;

    }

    public boolean search(String word) {
        return dfs(root, word,0);
    }

    private boolean dfs(TrieNode root, String word, int index)
    {

        if(index==word.length())
        {
            return root.isEnd;
        }

        char ch=word.charAt(index);

        if(ch=='.')
        {
            for(TrieNode tr:root.children)
            {
                if(tr!=null && dfs(tr,word,index+1))
                {
                    return true;
                }
            }

            return false;
        }

        int idx=ch-'a';

        TrieNode node=root.children[idx];

        if(node==null)
        {
            return false;
        }

        return dfs(node, word,index+1);
    }
}
