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
    private int result = 0;
    public int sumNumbers(TreeNode root) {
        makeSumTraverse(root,0);
        return result;
    }
    private void makeSumTraverse(TreeNode root,int temp){
        if(root==null){
            return;
        }
        temp=temp*10+root.val;
        if(root.left==null && root.right==null){
            result+=temp;
        }
        makeSumTraverse(root.left,temp);
        makeSumTraverse(root.right,temp);
    }
}