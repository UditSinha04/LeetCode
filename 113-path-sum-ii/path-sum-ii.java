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
    static List<List<Integer>> result = new ArrayList();
    static int [] arr= new int[1000];
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        result.clear();
        pathsumhelper( root, 0, targetSum);
        return result;
    }
    static void pathsumhelper(TreeNode root, int  i , int sum){
        if(root==null) return ;
        arr[i]=root.val;
        if(root.left==null && root.right==null){
            int sum2 =0;
            for(int j=0; j<=i; j++) sum2= sum2+arr[j];
            List<Integer> list = new ArrayList();
            if(sum2==sum){
                for(int j=0; j<=i;j++) list.add(arr[j]);
                result.add(list);  
            }
        }
        pathsumhelper(root.left,i+1,sum);
        pathsumhelper(root.right,i+1,sum);
    }
}