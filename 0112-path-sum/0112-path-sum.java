class Solution {
    boolean checker = false;
    public void find(TreeNode root, int t, int s) {
        if (root == null) {    return;    }
        s = s + root.val;   
        if (root.left == null && root.right == null && s == t) {
            checker = true;
            return;
        } 
        find(root.left, t, s);
        find(root.right, t, s);
    }

    public boolean hasPathSum(TreeNode root, int t) {
        find(root, t, 0);
        return checker;
    }
}
