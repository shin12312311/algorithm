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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> returnList = new ArrayList();
        Stack<TreeNode> tempStack = new Stack<>();
        
        if(root == null){
            return returnList;
        }
        
        tempStack.push(root);
        
        while(!tempStack.isEmpty()){
            TreeNode tempNode = tempStack.pop();
            returnList.add(tempNode.val);
            
            if(tempNode.right != null){
                tempStack.push(tempNode.right);
            }    
            if(tempNode.left != null){
                tempStack.push(tempNode.left);
            }
        }
        
        return returnList;
    }
}
