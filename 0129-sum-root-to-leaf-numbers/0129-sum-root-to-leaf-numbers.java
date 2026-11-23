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
    int s = 0;
    public void find(TreeNode root  , int n){
        if(root == null){return;}
        n  = n * 10 + root.val ;
        if(root.left == null && root.right == null){
            s = s + n;
            return;
        }
        find(root.left  , n);
        find(root.right, n);
    }
    public int sumNumbers(TreeNode root) {
        find(root  , 0);
        return s;
    }
}

