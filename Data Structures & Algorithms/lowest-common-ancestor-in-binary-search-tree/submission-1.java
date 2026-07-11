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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(p.val>q.val)
        {
            return fun(root,q,p);
        }
        else
        {
            return fun(root,p,q);
        }
    }

    public TreeNode fun(TreeNode root, TreeNode p, TreeNode q) {
        if(root.val>=p.val && root.val<=q.val)
            return root;
        else if(root.val>p.val && root.val>q.val)
        {
            return fun(root.left,p,q);
        }
        else
        {
            return fun(root.right,p,q);
        }
    }

}
