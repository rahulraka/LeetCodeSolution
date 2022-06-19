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
    List<Integer> c=new ArrayList<Integer>();
    public boolean check(TreeNode root){
        if(root!=null){
           if(root.left!=null) check(root.left);
            c.add(root.val);
            if(root.right!=null) check(root.right);
        }
        return true;
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        check(root);
        return c;
    }
    
}