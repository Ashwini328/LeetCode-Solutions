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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> list1=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        if(root==null)
            return list1;
        q.offer(root);
        while(!q.isEmpty()){
            
            List<Integer> list2=new ArrayList<>();
            int size=q.size();
            for(int i=0;i<size;i++){
                TreeNode curr=q.poll();
                list2.add(curr.val);
                if(curr.left!=null)
                    q.offer(curr.left);
                if(curr.right!=null)
                    q.offer(curr.right);
            }
            list1.add(list2);
        }
         Collections.reverse(list1);
        return list1;
    }
}