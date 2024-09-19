package leetcode._208;

class PrefixTree {
    
    PrefixTreeNode root;

    public PrefixTree() {
        root = new PrefixTreeNode('\0'); 
    }

    class PrefixTreeNode {

        private char value;
        private boolean isWord;
        private PrefixTreeNode[] children;

        public PrefixTreeNode(char val) {
            this.value = val;
            this.isWord = false;
            this.children = new PrefixTreeNode[26];
        }
    }

    public void insert(String word) {
        PrefixTreeNode curr = root;
        for (char x : word.toCharArray()) {
            if (curr.children[x - 'a'] == null) {
                curr.children[x - 'a'] = new PrefixTreeNode(x);
            }
            curr = curr.children[x - 'a'];
        }
        curr.isWord = true;
    }

    public boolean search(String word) {
        PrefixTreeNode res = getLast(word);
        return (res != null && res.isWord);
    }

    //helper method
    private PrefixTreeNode getLast(String word) {
        PrefixTreeNode curr = root;
        for (char x : word.toCharArray()) {
            if (curr.children[x - 'a'] == null) {
                return null;
            }

            curr = curr.children[x - 'a'];
        }
        return curr;
    }

    public boolean startsWith(String prefix) {
        PrefixTreeNode res = getLast(prefix);
        if (res == null) return false;
        return true;
    }

  public static void main(String[] args) {
    PrefixTree pt = new PrefixTree();
    pt.insert("salah");
    System.out.println(pt.search("sala"));
  }
}

