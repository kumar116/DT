package kumar116;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BinarySearchTreeTest {

  private BinarySearchTree<Integer> binarySearchTree;

  @Before
  public void createBinarySearchTree() {
    binarySearchTree = new BinarySearchTree<Integer>();
  }

  @After
  public void destroyBinarySearchTree() {
    binarySearchTree = null;
    System.gc();
  }

  @Test
  public void inorderTraversalShouldBeCorrect() {
    binarySearchTree.insert(4);
    binarySearchTree.insert(2);
    binarySearchTree.insert(5);
    binarySearchTree.insert(3);
    binarySearchTree.insert(1);
    assertEquals("", "12345", binarySearchTree.inorder());
  }

  @Test
  public void preorderTraversalShouldBeCorrect() {
    binarySearchTree.insert(4);
    binarySearchTree.insert(2);
    binarySearchTree.insert(5);
    binarySearchTree.insert(3);
    binarySearchTree.insert(1);
    assertEquals("", "42135", binarySearchTree.preorder());
  }

  @Test
  public void postorderTraversalShouldBeCorrect() {
    binarySearchTree.insert(4);
    binarySearchTree.insert(2);
    binarySearchTree.insert(5);
    binarySearchTree.insert(3);
    binarySearchTree.insert(1);
    assertEquals("", "13254", binarySearchTree.postorder());
  }

  @Test
  public void minimumShouldReturnTheMinimumValue() {
    binarySearchTree.insert(4);
    binarySearchTree.insert(2);
    binarySearchTree.insert(5);
    binarySearchTree.insert(3);
    binarySearchTree.insert(1);
    assertEquals("", "1", binarySearchTree.minimum().toString());
  }

  @Test
  public void maximumShouldReturnTheMaximumValue() {
    binarySearchTree.insert(4);
    binarySearchTree.insert(2);
    binarySearchTree.insert(5);
    binarySearchTree.insert(3);
    binarySearchTree.insert(1);
    assertEquals("", "5", binarySearchTree.maximum().toString());
  }
}
