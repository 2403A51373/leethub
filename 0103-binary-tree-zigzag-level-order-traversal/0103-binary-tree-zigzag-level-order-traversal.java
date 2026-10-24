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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> l = new ArrayList<>();
        if(root == null){   return l;   }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int track = 0;
        while(!q.isEmpty()){
            int n = q.size();
            List<Integer> ll = new ArrayList<>();
            //boolean flip = false;
            for(int i = 0 ; i < n ; i++){
                TreeNode cur = q.peek();
                if(cur.left!=null){ q.add(cur.left);}
                if(cur.right!=null){ q.add(cur.right);}
                if(track%2==1){
                    ll.add(0,cur.val);
                }
                else{
                    ll.add(cur.val);
                }
                q.remove();
            }
            track++;
            l.add(ll);
        }
        return l;
    }
}