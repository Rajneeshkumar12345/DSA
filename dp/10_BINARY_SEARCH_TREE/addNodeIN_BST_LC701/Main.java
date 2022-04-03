
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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root == null){
            return new TreeNode(val); // base case : if nodes becomes null return new node with data as its vslue
        }
        if(root.val > val){
        root.left = insertIntoBST(root.left, val);
        }
        else if(root.val < val){
        root.right = insertIntoBST(root.right, val);
        }
        return root; // if data is equal to node then return as it node
    }
}
