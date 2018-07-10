package com.kumarsoumya.collection;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class StackTest {

  private Stack stack;

  @Before
  public void createStackObject() {
    stack = new Stack();
  }

  @After
  public void destroyStackObject() {
    stack = null;
    System.gc();
  }

  @Test
  public void peekingFromStackShouldShowElementFromStack() {
    stack.push('B');
    stack.push('A');

    assertEquals("", 'A', stack.peek());
    assertEquals("", 2, stack.size);
  }

  @Test
  public void peekingFromAnEmptyStackShouldShowANullValue() {
    assertEquals("", null, stack.peek());
  }

  @Test
  public void poppingFromStackShouldPopElementFromStack() {
    stack.push('B');
    stack.push('A');

    assertEquals("", 'A', stack.pop());
    assertEquals("", 1, stack.size);
  }

  @Test
  public void poppingFromAnEmptyStackShouldPopANullValue() {
    assertEquals("", null, stack.pop());
  }

  @Test
  public void pushingElementInStackShouldPushElement() {
    stack.push('B');
    stack.push('A');

    assertEquals("", "AB", stack.traverse());
  }

  @Test
  public void emptyStackShouldReturnTrueOnIsEmpty() {
    assertTrue("", stack.isEmpty());
  }

  @Test
  public void nonEmptyStackShouldReturnFalseOnIsEmpty() {
    stack.push('A');
    assertFalse("", stack.isEmpty());
  }
}
