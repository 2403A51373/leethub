class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null || nums.length == 0) {    return null;    }
        return constructBST(nums, 0, nums.length - 1);
    }
    public TreeNode constructBST(int[] nums, int l, int r) {
        if (l > r) {   return null;    }
        int m = l + (r - l) / 2;
        TreeNode root = new TreeNode(nums[m]);
        root.left = constructBST(nums, l, m - 1);
        root.right = constructBST(nums, m + 1, r);
        return root;
    }
}
