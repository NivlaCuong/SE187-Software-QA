package mutation;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class BinarySearchTreeTest {
    BinarySearchTree<Integer> bst = new BinarySearchTree<>();

    @Before
    public void setUp() throws Exception {

        bst.add(5);
        bst.add(3);
        bst.add(2);
        bst.add(6);
        bst.add(1);
        bst.add(10);
        bst.add(7);
        BinaryTree.print(bst, "BST");
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void search() {
        boolean found = bst.search(2);
        assertTrue(found);
    }

    @Test
    public void add() {

    }

    @Test
    public void delete() {
    }
}