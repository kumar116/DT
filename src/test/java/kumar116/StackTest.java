package kumar116;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import static org.junit.Assert.*;

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
  public void poppingFromStackShouldPopElementFromStack() {
    stack.push('B');
    stack.push('A');

    assertEquals("", 'A', stack.pop());
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
