package leetcode._230;

import java.util.Stack;

import dsa_everything.tree.construction.TreeNode;

class Solution {
    public int kthSmallest(TreeNode root, int k) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode curr = root;

        while (!stack.isEmpty() || curr != null) {
            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }
            curr = stack.pop();
            k--;
            if(k == 0){
                return curr.data;
            }
            curr = curr.right;
        }
        return -1;
    }
}