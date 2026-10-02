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

class Solution {
    public TreeNode invertTree(TreeNode root) {
        if(root==null)return null;
         Queue<TreeNode> q = new LinkedList<>();
         q.offer(root);
         while(!q.isEmpty())
         {
            int n=q.size();
            ArrayList<TreeNode> list= new ArrayList<>();

            for(int i=0;i<n;i++)
            {
                TreeNode curr=q.poll();

                if(curr.left!=null)
                {
                    q.offer(curr.left);
                    list.add(curr.left);
                }

                if(curr.right!=null)
                {
                    q.offer(curr.right);
                    list.add(curr.right);
                }

                TreeNode temp=curr.left;
                curr.left=curr.right;
                curr.right=temp;
            }
            Collections.reverse(list);
            
         }
return root;

    }
}
