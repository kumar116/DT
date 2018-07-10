package com.kumarsoumya.collection;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class LinkedListTest {

  private LinkedList linkedList;

  @Before
  public void createLinkedListObject() {
    linkedList = new LinkedList();
  }

  @After
  public void destroyLinkedListObject() {
    linkedList = null;
    System.gc();
  }

  @Test
  public void insertingOneElementShouldInsertOnlyOneElement() {
    linkedList.insert('A');
    assertEquals("", "A", linkedList.traverse());
  }

  @Test
  public void insertingTwoElementsShouldInsertOnlyTwoElements() {
    linkedList.insert('B');
    linkedList.insert('A');
    assertEquals("", "AB", linkedList.traverse());
  }

  @Test
  public void insertingAtHeadShouldInsertOnlyAtHead() {
    linkedList.insert('C');
    linkedList.insert('B');
    linkedList.addToHead('A');
    assertEquals("", "ABC", linkedList.traverse());
  }

  @Test
  public void insertingAtTailShouldInsertOnlyAtTail() {
    linkedList.insert('C');
    linkedList.insert('B');
    linkedList.addToTail('A');
    assertEquals("", "BCA", linkedList.traverse());
  }

  @Test
  public void removingFromHeadShouldRemoveOnlyFromHead() {
    linkedList.insert('C');
    linkedList.insert('B');
    linkedList.insert('A');

    linkedList.remove('A');
    assertEquals("", "BC", linkedList.traverse());
  }

  @Test
  public void removingFromTailShouldRemoveOnlyFromTail() {
    linkedList.insert('C');
    linkedList.insert('B');
    linkedList.insert('A');

    linkedList.remove('C');
    assertEquals("", "AB", linkedList.traverse());
  }

  @Test
  public void removingFromMiddleShouldRemoveOnlyFromMiddle() {
    linkedList.insert('C');
    linkedList.insert('B');
    linkedList.insert('A');

    linkedList.remove('B');
    assertEquals("", "AC", linkedList.traverse());
  }

  @Test
  public void searchingForElementInTheListForElementInTheListShouldReturnTrue() {
    linkedList.insert('C');
    linkedList.insert('B');
    linkedList.insert('A');

    assertTrue("", linkedList.contains('B'));
  }

  @Test
  public void searchingForElementInTheListForElementNotInTheListShouldReturnFalse() {
    linkedList.insert('C');
    linkedList.insert('B');
    linkedList.insert('A');

    assertFalse("", linkedList.contains('D'));
  }

  @Test
  public void coutingForElementsInTheListShouldReturnCorrectCount() {
    linkedList.insert('C');
    linkedList.insert('B');
    linkedList.insert('A');

    assertEquals("", 3, linkedList.size);
  }

  @Test
  public void traversingLinkedListShouldPrintListInCorrectOrder() {
    linkedList.insert('A');
    linkedList.insert('B');
    linkedList.insert('C');

    assertEquals("", "CBA", linkedList.traverse());
  }

  @Test
  public void poppingFromHeadShouldRemoveAndReturnTheElementFromHead() {
    linkedList.insert('C');
    linkedList.insert('B');
    linkedList.insert('A');

    assertEquals("", 'A', linkedList.popFromHead());
    assertEquals("", "BC", linkedList.traverse());
  }

  @Test
  public void poppingFromTailShouldRemoveAndReturnTheElementFromTail() {
    linkedList.insert('C');
    linkedList.insert('B');
    linkedList.insert('A');

    assertEquals("", 'C', linkedList.popFromTail());
    assertEquals("", "AB", linkedList.traverse());
  }
}
