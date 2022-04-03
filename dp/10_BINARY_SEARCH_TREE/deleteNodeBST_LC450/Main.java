
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
    public int max(TreeNode node){
        TreeNode curr = node;
        while(curr.right != null)
            curr = curr.right;
            return curr.val;
        
    }
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null){
            return null;
        }
       if(root.val > key){
           root.left = deleteNode(root.left, key); // Recursive call is made to root.left
       } else if (root.val < key){
           root.right = deleteNode(root.right, key);  // Recursive call is made to root.right
       }  else if(root.left != null && root.right != null){  // Case 1 - Both child present ( L & R)
           int lmax = max(root.left);
           root.val = lmax;
           root.left = deleteNode(root.left, lmax);
           return root;
           
       } else if( root.left != null){  // Case 2 - One Child present (left)
           return root.left;
           
       } else if( root.right != null){ // Case 3- Onse child ( right)
           return root.right;
           
       } else {   // Zero child 
           return null;
       }
        return root;
    }
}
