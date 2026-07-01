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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> answer=new ArrayList<>();
        if(root==null)
            return answer;
        Queue<TreeNode> qu=new LinkedList<>();
        qu.add(root);
        while(!qu.isEmpty())
        {
            int size=qu.size();
            List<Integer> ans=new ArrayList<>();
            for(int i=0;i<size;i++)
            {
                TreeNode curr=qu.poll();
                if(curr.left!=null)
                {
                    qu.add(curr.left);
                }
                if(curr.right!=null)
                {
                    qu.add(curr.right);
                }
                ans.add(curr.val);
            }
            answer.add(ans);
        }
        return answer;
    }
}
