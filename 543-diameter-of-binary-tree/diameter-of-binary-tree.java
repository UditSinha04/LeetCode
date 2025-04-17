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
    int d = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return d;
    }

    public int height(TreeNode root){
        if(root == null) return 0;

        int LH = height(root.left);
        int RH = height(root.right);
        
        d = Math.max(d, LH+RH);
        return Math.max(LH,RH)+1;
    }
}