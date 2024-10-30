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
    public boolean isSymmetric(TreeNode root) {
        if(root==null){
            return true;
        }
        Stack<TreeNode> s= new Stack<TreeNode>();
        s.push(root.left);
        s.push(root.right);

        while(!s.isEmpty()){
            TreeNode n1=s.pop();
            TreeNode n2=s.pop();
            if(n1==null &&n2 ==null){
                continue;
            }
            if(n1==null ||n2==null ||n1.val!=n2.val){
                return false;
            }
            s.push(n1.left);
            s.push(n2.right);
            s.push(n1.right);
            s.push(n2.left);
        }
        return true;
    }
}
