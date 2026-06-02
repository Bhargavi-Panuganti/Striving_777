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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> tree=new ArrayList<>();
        trace(root,tree);
        return tree;
    }

    public void trace(TreeNode root, List<Integer> tree)
    {
        if(root==null) return;

        trace(root.left,tree);
        tree.add(root.val);
        trace(root.right,tree);
    }
}