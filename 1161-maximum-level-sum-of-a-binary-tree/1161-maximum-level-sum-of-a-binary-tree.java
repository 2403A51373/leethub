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
    public int maxLevelSum(TreeNode root) {
        int max = Integer.MIN_VALUE;
        if(root == null){   return max;}
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int level=0;
        int ans=0;
        while(!q.isEmpty()){
            int n = q.size();
            level++;
            //ArrayList<Integer> l = new ArrayList<>();
            int sum = 0;
            for(int i = 0 ; i < n ; i ++){
                TreeNode cur = q.peek();
                if(cur.left!=null){ q.add(cur.left);}
                if(cur.right!=null){ q.add(cur.right);}
                sum = sum + cur.val;
                q.remove();
            }
            if(max < sum){
                max = sum;
                ans=level;
            }
        }
        return ans;
    }
}