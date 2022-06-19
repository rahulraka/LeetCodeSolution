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
        List<List<Integer>> out=new ArrayList();
       if(root == null) return out;
        Queue<TreeNode> q=new LinkedList();
        q.add(root);
        
        while(!q.isEmpty()){
            List<Integer> in=new ArrayList<Integer>();
            int size=q.size();
            for(int i =0;i<size;i++){
                // System.out.println(q.size());
                TreeNode curr=q.remove();
                // System.out.println(q.size());
                in.add(curr.val);
                if(curr.left!=null) q.add(curr.left);
                if(curr.right!=null) q.add(curr.right);
            }
            out.add(in);
        }
        return out;
        
        
    }
}