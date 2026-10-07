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
    public int kthSmallest(TreeNode root, int k) {
        Queue<TreeNode> q= new LinkedList<>();
        
        PriorityQueue<Integer> result= new PriorityQueue<>();
        q.offer(root);
        int max=0;
        while(!q.isEmpty())
        {   
            int n=q.size();
            for(int i=0;i<n;i++)
            {
                TreeNode curr=q.poll();
                result.add(curr.val);
                if(curr.left!=null)
                {
                    q.offer(curr.left);
                }

                if(curr.right!=null)
                {
                    q.offer(curr.right);
                }
            }
        }

        for(int i=0;i<k;i++)
        {
            max=result.poll();
        }

        return max;
    }
}