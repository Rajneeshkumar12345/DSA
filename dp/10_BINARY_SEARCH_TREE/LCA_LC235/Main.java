
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }    
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode curr = root;
        while(curr != null){
            if(p.val < curr.val && q.val < curr.val){ // dono se small hai search in left
                curr = curr.left;
            } else if(p.val > curr.val && q.val > curr.val){  // dono se long hai search in right
                curr = curr.right;
            }
            else {
                return curr;  // Dono ke beech me hoga 
            }
        }
        return null; 
    }
}
