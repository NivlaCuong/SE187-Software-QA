package mutation;

/**
 * A Generic Binary Tree Class.
 */
class BinaryTree<T> {

    /* The root node of the tree. */
    TreeNode root;

    /* Constructs an empty binary tree. */
    BinaryTree() {
        root = null;
    }

    /* Constructs a binary tree with root T. */
    BinaryTree(TreeNode t) {
        root = t;
    }

    /* Represents a node in the binary tree. */
    protected class TreeNode {

        T item;
        TreeNode left;
        TreeNode right;

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
            System.out.print(item + " ");
            if (right != null) {
                right.printInorder();
            }
        }
    }
}
