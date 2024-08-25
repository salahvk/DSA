package dsa_everything.tree.properties;

import dsa_everything.tree.construction.TreeNode;

public class Depth {
    // function to calculate depth of a tree
    TreeNode root;

    static int depth(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int left = depth(node.left);
        int right = depth(node.right);

        return Math.max(left, right) + 1;
    }
}
