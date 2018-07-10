package com.kumarsoumya.collection;

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
    assertEquals("", "", binarySearchTree.inorder());
    binarySearchTree.insert(4);
    binarySearchTree.insert(2);
    binarySearchTree.insert(5);
    binarySearchTree.insert(3);
    binarySearchTree.insert(1);
    assertEquals("", "12345", binarySearchTree.inorder());
  }

  @Test
  public void preorderTraversalShouldBeCorrect() {
    assertEquals("", "", binarySearchTree.preorder());
    binarySearchTree.insert(4);
    binarySearchTree.insert(2);
    binarySearchTree.insert(5);
    binarySearchTree.insert(3);
    binarySearchTree.insert(1);
    assertEquals("", "42135", binarySearchTree.preorder());
  }

  @Test
  public void postorderTraversalShouldBeCorrect() {
    assertEquals("", "", binarySearchTree.postorder());
    binarySearchTree.insert(4);
    binarySearchTree.insert(2);
    binarySearchTree.insert(5);
    binarySearchTree.insert(3);
    binarySearchTree.insert(1);
    assertEquals("", "13254", binarySearchTree.postorder());
  }

  @Test
  public void minimumShouldReturnTheMinimumValue() {
    assertEquals("", null, binarySearchTree.minimum());
    binarySearchTree.insert(4);
    binarySearchTree.insert(2);
    binarySearchTree.insert(5);
    binarySearchTree.insert(3);
    binarySearchTree.insert(1);
    assertEquals("", "1", binarySearchTree.minimum().toString());
  }

  @Test
  public void maximumShouldReturnTheMaximumValue() {
    assertEquals("", null, binarySearchTree.maximum());
    binarySearchTree.insert(4);
    binarySearchTree.insert(2);
    binarySearchTree.insert(5);
    binarySearchTree.insert(3);
    binarySearchTree.insert(1);
    assertEquals("", "5", binarySearchTree.maximum().toString());
  }

  @Test
  public void deletingAnElementFromBinarySearchTreeShouldDeleteTheElement() {
    binarySearchTree.insert(4);
    binarySearchTree.insert(2);
    binarySearchTree.insert(5);
    binarySearchTree.insert(3);
    binarySearchTree.insert(1);
    binarySearchTree.delete(5);
    assertEquals("", "1234", binarySearchTree.inorder());
  }
}
