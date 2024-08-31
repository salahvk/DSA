package leetcode._543;

import dsa_everything.tree.construction.TreeNode;

class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
        int[] res = new int[1];
        dfs(root, res);
        return res[0];
    }

    int dfs(TreeNode root, int[] res) {
        if (root == null)
            return 0;

        int left = dfs(root.left,res);
        int right = dfs(root.right,res);
        res[0] = Math.max(res[0], left + right);
        return Math.max(left, right) + 1;
    }
}