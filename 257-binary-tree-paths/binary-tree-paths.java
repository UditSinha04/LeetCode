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

public class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> paths = new ArrayList<>();
        if (root != null) {
            dfs(root, "", paths); 
        }
        return paths;
    }

    private void dfs(TreeNode root, String path, List<String> paths) {
        if (root == null) return;

        path += Integer.toString(root.val);

        if (root.left == null && root.right == null) {
            paths.add(path);
        } else {
            path += "->";
            dfs(root.left, path, paths);
            dfs(root.right, path, paths);
        }
    }
}
