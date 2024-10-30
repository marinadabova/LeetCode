/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    TreeNode binaryS(int[] nums, int start, int end) {
        if (start > end) {
            return null;
        }
        int mid = start + (end - start) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = binaryS(nums, start, mid - 1);
        root.right = binaryS(nums, mid + 1, end);

        return root;
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        int size = nums.length;
        TreeNode root = binaryS(nums, 0, size - 1);
        return root;
    }
}
