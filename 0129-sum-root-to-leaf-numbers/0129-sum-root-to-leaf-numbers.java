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
    public int sumNumbers(TreeNode root) {
        return preorder(root,0);

        
    }
    private int preorder(TreeNode curr, int num){
        if(curr==null ) return 0;
        num =num*10+curr.val;
        if(curr.left==null&& curr.right==null) return num;
        return preorder(curr.left, num)+ preorder(curr.right, num);
    }
}