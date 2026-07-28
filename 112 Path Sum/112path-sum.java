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
    public boolean check(TreeNode root,int currSum,int targetSum){
        if(root==null)
            return false;
        if(root.left==null && root.right==null){
            if((currSum+=root.val)==targetSum)
                return true;
            
        }
        currSum+=root.val;
        return check(root.left,currSum,targetSum) || check(root.right,currSum,targetSum);
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        
        int currSum=0;
        if(check(root,currSum,targetSum))
            return true;
        return false;
    }
}