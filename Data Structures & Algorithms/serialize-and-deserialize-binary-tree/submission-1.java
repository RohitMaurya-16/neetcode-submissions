/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

public class Codec {
    private String comma=",";
    private String hash="#";
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        
        StringBuilder sb= new StringBuilder();
        serial(root,sb);

        return sb.toString();
    }

    private void serial(TreeNode node, StringBuilder sb)
    {
        if(node==null)
        {
            sb.append(hash).append(comma);
            return;
        }

        sb.append(node.val).append(comma);
        serial(node.left,sb);
        serial(node.right,sb);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        
        if(data==null || data.isEmpty())return null;

        String arr[]= data.split(",");

        Queue<String> q= new LinkedList<>(Arrays.asList(arr));

        return dserial(q);
    }

    private TreeNode dserial(Queue<String> q)
    {
        if(q.isEmpty())return null;

        String curr=q.poll();

        if(curr.equals("#"))
        {
            return null;
        }

        TreeNode node =new TreeNode(Integer.parseInt(curr));
        node.left=dserial(q);
        node.right= dserial(q);

        return node;

    }
}
