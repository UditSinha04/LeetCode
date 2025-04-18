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
    public int longestZigZag(TreeNode root) {
        return dfs(root, -1, 0);
    }

    private int dfs(TreeNode node, int direction, int length) {
        if (node == null) {
            return length - 1;
        }

        int left = dfs(node.left, 0, direction == 1 ? length + 1 : 1);
        int right = dfs(node.right, 1, direction == 0 ? length + 1 : 1);

        return Math.max(left, right);
    }
}
