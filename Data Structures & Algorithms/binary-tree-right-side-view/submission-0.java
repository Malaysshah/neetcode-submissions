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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> answer=new ArrayList<>();
        if(root==null)
            return answer;
        Queue<TreeNode> qu=new LinkedList<>();
        qu.add(root);
        while(!qu.isEmpty())
        {
            int size=qu.size();
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
                if(i==size-1)
                {
                    answer.add(curr.val);
                }
            }
        }
        return answer;
    }
}
