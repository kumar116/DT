package com.kumarsoumya.collection;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BinarySearchTreeTest {

  private Integer[] datas = {4, 2, 5, 3, 1};

  @Test
  public void testInorder() {
    BinarySearchTree<Integer> tree = new BinarySearchTree<Integer>();
    assertEquals("Empty Binary Search Tree should return nothing.", "", tree.inorder());

    for(Integer data: datas) {
      tree.insert(data);
    }

    assertEquals("", "12345", tree.inorder());
  }

  @Test
  public void testPreorder() {
    BinarySearchTree<Integer> tree = new BinarySearchTree<Integer>();
    for(Integer data: datas) {
      tree.insert(data);
    }

    assertEquals("", "42135", tree.preorder());
  }

  @Test
  public void testPostorder() {
    BinarySearchTree<Integer> tree = new BinarySearchTree<Integer>();
    for(Integer data: datas) {
      tree.insert(data);
    }

    assertEquals("", "13254", tree.postorder());
  }

  @Test
  public void testMinimum() {
    BinarySearchTree<Integer> tree = new BinarySearchTree<Integer>();
    for(Integer data: datas) {
      tree.insert(data);
    }

    assertEquals("", new Integer(1), tree.minimum());
  }

  @Test
  public void testMaximum() {
    BinarySearchTree<Integer> tree = new BinarySearchTree<Integer>();
    for(Integer data: datas) {
      tree.insert(data);
    }

    assertEquals("", new Integer(5), tree.maximum());
  }

  @Test
  public void testDelete() {
    BinarySearchTree<Integer> tree = new BinarySearchTree<Integer>();
    for(Integer data: datas) {
      tree.insert(data);
    }

    tree.delete(5);
    assertEquals("", "1234", tree.inorder());
  }

}
