package mutation;

/**
 * A class implementing a BST.
 */
public class BinarySearchTree<T extends Comparable<T>> extends BinaryTree<T> {
	
	/* Constructs an empty BST. */
	BinarySearchTree() {
		super();
	}

	/* Constructs a BST with root MYROOT. */
	public BinarySearchTree(TreeNode root) {
		super(root);
	}
	
	/** Returns true if and only if KEY is in the BST. */
	boolean search(T key) {
		return searchHelper(key, root);
	}

	private boolean searchHelper(T key, TreeNode cur) {
		if (cur == null) {
			return false;
		}
		if (key == cur.item) {
			return true;
		}
		if (cur.item.compareTo(key) > 0 && cur.left != null) {
			return searchHelper(key,cur.left);
		} else if (cur.item.compareTo(key) < 0 && cur.right != null) {
			return searchHelper(key, cur.right);
		}
		return false;
	}

	
	/** Adds a node for KEY iff it isn't in the BST already. */
	void add(T key) {
		if (root == null) {
			root = new TreeNode(key);
		}
		addHelper(key,root);
	}

	private void addHelper(T key, TreeNode cur) {
		if (!search(key)) {
			if (cur.item.compareTo(key) > 0 && cur.left == null) {
				cur.left = new TreeNode(key);
			}
			else if (cur.item.compareTo(key) > 0 && cur.left != null) {
				addHelper(key,cur.left);
			}
			else if (cur.item.compareTo(key) < 0 && cur.right == null) {
				cur.right = new TreeNode(key);
			}
			else if (cur.item.compareTo(key) < 0 && cur.right != null) {
				addHelper(key,cur.right);
			}

		}
	}
	
	/** Deletes the node with KEY. */
	T delete(T key) {
		TreeNode parent = null;
		TreeNode curr = root;
		TreeNode delNode = null;
		TreeNode replacement = null;
		boolean rightSide = false;
		
		while (curr != null && !curr.item.equals(key)) {
			if (((Comparable<T>) curr.item).compareTo(key) > 0) {
				parent = curr;
				curr = curr.left;
				rightSide = false;
			} else {
				parent = curr;
				curr = curr.right;
				rightSide = true;
			}
		}
		delNode = curr;
		if (curr == null) {
			return null;
		}
		
		if (delNode.right == null) {
			if (root == delNode) {
				root = root.left;
			} else {
				if (rightSide) {
					parent.right = delNode.left;
				} else {
					parent.left = delNode.left;
				}
			}
		} else {
			curr = delNode.right;
			replacement = curr.left;
			if (replacement == null) {
				replacement = curr;
			} else {
				while (replacement.left != null) {
					curr = replacement;
					replacement = replacement.left;
				}
				curr.left = replacement.right;
				replacement.right = delNode.right;
			}
			replacement.left = delNode.left;
			if (root == delNode) {
				root = replacement;
			} else {
				if (rightSide) {
					parent.right = replacement;
				} else {
					parent.left = replacement;
				}
			}
		}
		return delNode.item;
	}
}