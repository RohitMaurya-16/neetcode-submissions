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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
         
     if(root==null)return false;

     if(isSameTree(root, subRoot))return true;
     return (isSubtree(root.left,subRoot)|| isSubtree(root.right,subRoot));         

    }

    public boolean isSameTree(TreeNode fatherNode,TreeNode sonNode)
    {
        Queue<TreeNode> father = new LinkedList<>();
        Queue<TreeNode> son = new LinkedList<>();

        father.offer(fatherNode);
        son.offer(sonNode);

        while(!father.isEmpty() && !son.isEmpty())
        {
            TreeNode fnode=father.poll();
            TreeNode snode=son.poll();

            if(fnode==null && snode==null)continue;
            if(fnode==null || snode==null ||fnode.val!=snode.val)return false;

            father.offer(fnode.left);
            son.offer(snode.left);

            father.offer(fnode.right);
            son.offer(snode.right);
        }

        return father.isEmpty()&& son.isEmpty();
    }
}
