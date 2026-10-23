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
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> l = new ArrayList<>();
        if(root == null){ return l;}
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int max = Integer.MIN_VALUE;
            int n = q.size();
            for(int i = 0; i < n ; i++){
                TreeNode cur = q.peek();
                if(cur.left!=null){ q.add(cur.left);}
                if(cur.right!=null){ q.add(cur.right);}
                if(max < cur.val){    max = cur.val;    }
                q.remove();
            }
            l.add(max);
        }
        return l;
    }
}