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
    List<Integer> helper=new ArrayList();
    public List<Integer> preorderTraversal(TreeNode root) {
        result(root);
        return helper;
        
    }
    public void result(TreeNode root){
        if(root==null) return;
        helper.add(root.val);
        result(root.left);
        result(root.right);
    }
}