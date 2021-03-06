package mutation;

/**
 * A Generic Binary Tree Class.
 */
class BinaryTree<T> {

    /* The root node of the tree. */
    TreeNode root;
    private StringBuilder strInorder = new StringBuilder();
    private StringBuilder strPreorder = new StringBuilder();

    /* Constructs an empty binary tree. */
    BinaryTree() {
        root = null;
    }

    /* Constructs a binary tree with root T. */
    BinaryTree(TreeNode t) {
        root = t;
    }

    /** Represents a node in the binary tree. */
    protected class TreeNode {

        T item;
        TreeNode left;
        TreeNode right;

        /**
         * Constructor with only one key
         * @param item
         */
        TreeNode(T item) {
            this.item = item;
            left = right = null;
        }

        public TreeNode(T item, TreeNode left, TreeNode right) {
            this.item = item;
            this.left = left;
            this.right = right;
        }

        /* Use for testing. */
        private void printPreorder() {
            System.out.print(item + " ");
            strPreorder.append(item);
            if (left != null) {
                left.printPreorder();
            }
            if (right != null) {
                right.printPreorder();
            }
        }

        /* Use for testing. */
        private void printInorder() {
            if (left != null) {
                left.printInorder();
            }
            strInorder.append(item);
            System.out.print(item + " ");
            if (right != null) {
                right.printInorder();
            }
        }
    }

    /** Print the values in the tree in preorder: root value first,
     * then values in the left subtree (in preorder), then values
     * in the right subtree (in preorder). */
    void printPreorder() {
        if (root == null) {
            System.out.println("(empty tree)");
        } else {
            root.printPreorder();
            System.out.println();
        }
    }

    /**
     *
     * @return the StringBuilder of the tree Preorder
     */
    StringBuilder getPreorderString() {
        return strPreorder;
    }

    /**
     * @return the StringBuilder of the tree Inorder
     */
    StringBuilder getInorderString() {
        return strInorder;
    }

    /** Print the values in the tree in inorder: values in the left
     * subtree first (in inorder), then the root value, then values
     * in the right subtree (in inorder). */
    void printInorder() {
        if (root == null) {
            System.out.println("(empty tree)");
        } else {
            root.printInorder();
            System.out.println();
        }
    }

    /* Used for testing. */
    static void print(BinaryTree<?> t, String description) {
        System.out.println(description + " in preorder");
        t.printPreorder();
        System.out.println(description + " in inorder");
        t.printInorder();
        System.out.println();
    }

}
