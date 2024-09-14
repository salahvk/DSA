package leetcode._235;

import dsa_everything.tree.construction.TreeNode;

public class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        while (true) {
            if (p.data  > root.data && q.data > root.data) {
                root = root.right;
            }else if (p.data  < root.data && q.data < root.data) {
                root = root.left;
            }else{
                return root;
            }
        }
    }
}
