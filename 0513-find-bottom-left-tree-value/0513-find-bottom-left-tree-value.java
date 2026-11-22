class Solution {
    public int findBottomLeftValue(TreeNode root) {
        List<List<Integer>> ll = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            int n = q.size();
            List<Integer> al = new ArrayList<>(); 
            for (int i = 0; i < n; i++) {
                TreeNode c = q.poll();
                if (c.left != null) {
                    q.add(c.left);
                }
                if (c.right != null) {
                    q.add(c.right);
                }
                al.add(c.val);
            }
            ll.add(al);
        }
        return ll.get(ll.size() - 1).get(0);
    }
}
