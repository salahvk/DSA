package leetcode._208;

public class Solution {

    PrefixTreeNode root;

    class PrefixTreeNode {
        char val;
        PrefixTreeNode[] children;
        boolean isWord;

        PrefixTreeNode(char val) {
            this.val = val;
            this.children = new PrefixTreeNode[26];
            this.isWord = false;
        }
    }

    void insert(String word) {
        PrefixTreeNode current = root;
        for (char x : word.toCharArray()) {
            if (current.children[x - 'a'] == null) {
                current.children[x - 'a'] = new PrefixTreeNode(x);
            } else {
                current = current.children[x - 'a'];
            }
        }
    }

    boolean search(String word) {
        PrefixTreeNode res = getLast(word);
        return (res != null && res.isWord);
    }

    PrefixTreeNode getLast(String word) {
        PrefixTreeNode current = root;

        for (char x : word.toCharArray()) {
            if (current.children[x - 'a'] == null) {
                return null;
            }
            current = current.children[x - 'a'];
        }
        return current;
    }

    public static void main(String[] args) {
        PrefixTree pt = new PrefixTree();
        pt.insert("salah");
        System.out.println(pt.search("salah"));
      }
}
