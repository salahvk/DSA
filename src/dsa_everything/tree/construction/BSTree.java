package dsa_everything.tree.construction;

class BSTNode {
    int data;
    BSTNode left, right;

    BSTNode(int data) {
        this.data = data;
    }
}

class BSTree {

    BSTNode root;

    void insert(int data) {
        root = insertRec(root, data);
    }

    private BSTNode insertRec(BSTNode root, int data) {
        if (root == null) {
            root = new BSTNode(data);
            return root;
        }
        if (root.data < data) {
            root.right = insertRec(root.right, data);
        } else if (root.data > data) {
            root.left = insertRec(root.left, data);
        }
        return root;
    }

    boolean search(int key) {
        return searchRec(root, key);
    }

    private boolean searchRec(BSTNode root, int key) {
        if (root == null)
            return false;
        if (root.data == key)
            return true;
        if(key < root.data)return searchRec(root.left, key);
        return searchRec(root.right, key);
    }

    public static void main(String[] args) {
        // Create an instance of the BSTree
        BSTree bst = new BSTree();

        // Insert elements into the BST
        bst.insert(50);
        bst.insert(30);
        bst.insert(20);
        bst.insert(40);
        bst.insert(70);
        bst.insert(60);
        bst.insert(80);

        // Search for elements
        System.out.println("Is 40 present in the BST? " + bst.search(40)); // Output: true
        System.out.println("Is 90 present in the BST? " + bst.search(90)); // Output: false

    }

   

}
