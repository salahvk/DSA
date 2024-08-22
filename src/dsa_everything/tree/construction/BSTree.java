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
        if (key < root.data)
            return searchRec(root.left, key);
        return searchRec(root.right, key);
    }

    public void delete(int key) {
        root = deleteRec(root, key);
    }

    private BSTNode deleteRec(BSTNode root, int key) {
        if (root.data > key) {
            root.left = deleteRec(root.left, key);
        } else if (root.data < key) {
            root.right = deleteRec(root.right, key);
        } else {
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;

            root.data = minValue(root.right);
            root.right = deleteRec(root.right, root.data);
        }
        return root;
    }

    private int minValue(BSTNode root) {
        int minValue = root.data;
        while (root.left != null) {
            minValue = root.left.data;
            root = root.left;
        }
        return minValue;
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
        bst.insert(41);
        bst.insert(42);
        bst.insert(35);

        // Search for elements
        System.out.println("Is 40 present in the BST? " + bst.search(40));
        System.out.println("Is 90 present in the BST? " + bst.search(90));

        // Delete an element
        System.out.println("Deleting 40...");
        bst.delete(40);

        System.out.println("Is 40 present in the BST? " + bst.search(40)); // Output: false

        // In-Order Traversal (For displaying the BST)
        System.out.print("In-Order Traversal of the BST: ");
        // inOrderTraversal(bst.root); // Expected Output: 30 40 50 60 70 80

    }

}
