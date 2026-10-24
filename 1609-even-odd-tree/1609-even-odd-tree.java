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
    public boolean isEvenOddTree(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        int level = 0;
        q.add(root);
        while(!q.isEmpty()){
            int n = q.size();
            int prev;
            if(level%2==1){    prev = Integer.MAX_VALUE;    }
            else{    prev = Integer.MIN_VALUE;    }
            for(int i = 0; i < n ; i++){
                TreeNode cur = q.peek();
                if(cur.left!=null){ q.add(cur.left);}
                if(cur.right!=null){ q.add(cur.right);}
                if(level%2==1){
                    if(cur.val%2==1 || prev <= cur.val){    return false;    }
                }
                else{
                    if(cur.val%2==0 || prev >= cur.val){    return false;    }
                }
                prev = cur.val;
                q.remove();
            }
            level++;
        }
        return true;
    }
}