package leetcode._98;

import dsa_everything.tree.construction.TreeNode;

public class Solution {
    // This is my solution and don't work properly
    public boolean isValidBSTMine(TreeNode root) {
        if (root == null)
            return true;
        if (root.left == null)
            return true;
        if (root.right == null)
            return true;
        if (root.left.data < root.data && root.right.data > root.data) {
            return isValidBSTMine(root.left) && isValidBSTMine(root.right);
        } else {
            return false;
        }
    }
    // I tried to modify the solution and the reason why it won't work is becuase of
    // returning null while node is false

    public boolean isValidBST(TreeNode root) {
        return valid(root, Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY);
    }

    boolean valid(TreeNode node, double left, double right) {
        if (node == null) {
            return true;
        }
        if (!(node.data > left && node.data < right)) {
            return false;
        }
        return valid(node.left,left,node.data) && valid(node.right,node.data,right);
    }

    // This is the valid solution
}
