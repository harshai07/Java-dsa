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
    public TreeNode invertTree(TreeNode root) {
        //base condtion 
        if(root==null) return null;
        //intialize a stack with root 
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        //while stack is not empty 
        while(!stack.isEmpty()){
            TreeNode node = stack.pop(); //pop node 
            TreeNode temp = node.left; //swap it's left and right pointers 
            node.left= node.right;
            node.right= temp;
            if (node.left!= null) stack.push(node.left); //if the left child exist pusht it to stack 
            if(node.right!=null ) stack.push(node.right); //if the right child exist pusht it to stack 
        }
        return root;
    }
}