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
    public boolean isBalanced(TreeNode root) {
        if(root == null){return true;}
        int l = BB(root.left);
        int r = BB(root.right);
        if(Math.abs(l-r) > 1 ){ return false;}
        return isBalanced(root.right) && isBalanced(root.left);
    }
    public int BB(TreeNode root){
        if(root == null){return 0;}
        /*if(root.left != null){     return 1 + BB(root.left);    }
        if(root.right != null){     return 1 + BB(root.right);    }
        return 1 + BB(root.left) + BB(root.left);
        */
        return 1 + Math.max(BB(root.left) , BB(root.right));
    }
}