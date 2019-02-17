package mutation;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Test 3 main functions of Binary Search Tree includes
 *      + Search
 *      + Add
 *      + Delete
 */
public class BinarySearchTreeTest {
    private BinarySearchTree<Integer> intBST;
    private BinarySearchTree<String> stringBST;
    private BinarySearchTree<Integer> emptyBST;

    private Object NullPointerException;

    /**
     * Setup the Binary Search Tree. Add many elements
     * @throws Exception
     */
    @Before
    public void setUp() throws Exception {
        /* Initialize all the testing Trees */
        intBST = new BinarySearchTree<>();
        stringBST = new BinarySearchTree<>();
        emptyBST = new BinarySearchTree<>();
        NullPointerException = null;

        /* Add initial integers for intBST Tree */
        intBST.add(5);
        intBST.add(3);
        intBST.add(2);
        intBST.add(6);
        intBST.add(1);
        intBST.add(10);
        intBST.add(7);
        intBST.add(8);

        /* Add initial String for stringBST Tree */
        stringBST.add("C");
        stringBST.add("A");
        stringBST.add("E");
        stringBST.add("B");
        stringBST.add("D");
    }

    /**
     * Test to check if search function passes all the cases
     */
    @Test
    public void search()  {
        System.out.print("@Test 2: Testing search() function \n");
        BinaryTree.print(intBST, "Integer BST");

        // [TRUE] Test for a regular cases
        assertTrue(intBST.search(8));
        assertTrue(intBST.search(3));
        assertTrue(intBST.search(5));
        assertTrue(intBST.search(7));

        // [TRUE] Test to find the largest element
        assertTrue(intBST.search(10));

        // [TRUE] Test to find the smallest element
        assertTrue(intBST.search(1));

        // [FALSE] Test search for element that is not in the list
        assertFalse(intBST.search(13));
        assertFalse(intBST.search(-1));

        // [FALSE] Test search when tree is empty
        assertFalse(emptyBST.search(0));

        // [TRUE] Test if the element is the first one.
        emptyBST.add(1);
        assertTrue(emptyBST.search(1));

    }

    /**
     * Test if the key is added into the tree.
     * If the tree is empty, it'll create a new tree,
     * else it will added to the right if key is bigger than the current node
     * else it will added to the left.
     */
    @Test
    public void add() {
        System.out.print("@Test 3: Testing add() function \n");

        System.out.println("Test if the tree is added character correctly");
        BinaryTree.print(stringBST, "String BST");

        // Test to see if the tree is in Preorder
        assertEquals(stringBST.getPreorderString().toString(), "CABED");

        // Test to see if the tree is in Intorder
        assertEquals(stringBST.getInorderString().toString(), "ABCDE");


        // Test if the tree can add negative number
        System.out.println("After inserting negative number");
        intBST.add(-1);
        intBST.add(-92);
        intBST.add(-12);
        intBST.add(-2);
        BinaryTree.print(intBST, "Integer BST");

        System.out.println();
    }

    /**
     * Test delete method works correctly
     */
    @Test
    public void delete() {
        System.out.print("@Test 1: Testing delete() function \n");
        BinaryTree.print(stringBST, "String BST");

        // [NULL] Test if the key is not in the tree for deleting
        assertNull(intBST.delete(-1));
        assertNull(intBST.delete(1000));

        /*
         * [return "A"] and delete A out of the tree
         * Test if the key is deleted.
         * If it's deleted, it will return the value
         * else return NULL
         */
        assertEquals("A", stringBST.delete("A"));
        System.out.println("After deleting A: ");
        BinaryTree.print(stringBST, "String BST");

        // [NULL] Test to delete the key that is not in the tree
        System.out.println("After testing deleting A again, this will return NULL \n");
        assertNull(stringBST.delete("A"));

    }
}