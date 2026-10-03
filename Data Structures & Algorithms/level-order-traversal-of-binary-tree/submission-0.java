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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> m=new ArrayList<>();

Queue<TreeNode> q=new LinkedList<>();
if(root==null)return m;
q.offer(root);      // You can use .offer() in palace of .add();

while(!q.isEmpty())
{
    int n=q.size();
    List<Integer> list=new ArrayList<>();
    for(int i=0;i<n;i++)
    {
     TreeNode node=q.poll(); 
      
     list.add(node.val);

     if(node.left!=null) 
     {
        q.offer(node.left);
     }

     if(node.right!=null) 
     {
        q.offer(node.right);
     }
     
    }
    m.add(list);
}
  return m;
    }
}
