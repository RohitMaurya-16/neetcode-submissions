class TrieNode
{
    TrieNode children[];
    boolean isEnd;

    public TrieNode()
    {
       children=new TrieNode[26];
       isEnd=false;
    }
}

class PrefixTree {
       
       private TrieNode root;

    public PrefixTree() {
          
          root=new TrieNode();
    }

    public void insert(String word) {
        
        TrieNode node=root;

        for(char ch: word.toCharArray())
        {
            int idx=ch-'a';

            if(node.children[idx]==null)
            {
                node.children[idx]=new TrieNode();
            }

            node=node.children[idx];
        }

        node.isEnd=true;
    }

    public boolean search(String word) {
       TrieNode node = searchNode(word);
       return node!=null && node.isEnd;
    }

    public boolean startsWith(String prefix)
    {
        TrieNode node= searchNode(prefix);

        return searchNode(prefix)!=null;
    }

    public TrieNode searchNode (String prefix) {
        
        TrieNode node=root;

        for(char ch:prefix.toCharArray())
        {
            int idx=ch-'a';
            if(node.children[idx]==null)
            {
                return null;
            }

            node=node.children[idx];
        }

        return node;
    }
}
