package revision.Tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

import dsa_everything.tree.construction.TreeNode;

public class LevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        Deque<TreeNode> q = new ArrayDeque<>();
        if (root != null) {
            q.add(root);
        }
        while (!q.isEmpty()) {
            List<Integer> response = new ArrayList<>();
            for (int i = 0, length = q.size(); i < length; i++) {
                TreeNode node = q.poll();
                response.add(node.data);
                if (node.left != null) {
                    q.add(node.left);
                }
                if (node.right != null) {
                    q.add(node.right);
                }
            }
            res.add(response);
        }
        return res;
    }
}
