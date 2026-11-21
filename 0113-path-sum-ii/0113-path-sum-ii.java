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
    List<List<Integer>> al = new ArrayList<>();
    List<Integer> ls = new ArrayList<>();
    public void find(TreeNode root, int t, int s) {
        if (root == null) {    return;    }  
        s = s + root.val;
        ls.add(root.val);
        if (root.left == null && root.right == null && s == t) {
            al.add(new ArrayList<>(ls));
        }
        find(root.left, t, s);
        find(root.right, t, s);
        ls.remove(ls.size() - 1);
    }
    public List<List<Integer>> pathSum(TreeNode root, int t) {
        find(root, t, 0);
        return al;
    }
}
