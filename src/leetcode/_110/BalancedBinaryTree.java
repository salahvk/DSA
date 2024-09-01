package leetcode._110;

import dsa_everything.tree.construction.TreeNode;

//  If we are doing recursion from top to down it will take o(n^2) instead do bottom up which take O(n)
public class BalancedBinaryTree {
    public boolean isBalanced(TreeNode root) {
        return dfs(root)[0] == 1;
    }

    int[] dfs(TreeNode root) {
        if (root == null) {
            return new int[] { 1, 0 };
        }
        int[] left = dfs(root.left);
        int[] right = dfs(root.right);
        boolean isBalanced = (left[0] == 1 && right[0] == 1) && Math.abs(left[1] - right[1]) <= 1;
        int height = 1 + Math.max(left[1], right[1]);
        return new int[] { isBalanced ? 1 : 0, height };
    }

}
