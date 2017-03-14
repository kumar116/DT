package kumar116;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import static org.junit.Assert.*;

public class QueueTest {
  
  private Queue queue;

  @Before
  public void createQueueObject() {
    queue = new Queue();
  }

  @After
  public void destroyStackObject() {
    queue = null;
    System.gc();
  }

  @Test
  public void poppingFromQueueShouldPopElementFromEndOfQueue() {
    queue.push('B');
    queue.push('A');

    assertEquals("", 'B', queue.pop());
  }

  @Test
  public void poppingFromAnEmptyQueueShouldPopANullValue() {
    assertEquals("", null, queue.pop());
  }  

  @Test
  public void pushingElementInQueueShouldPushElement() {
    queue.push('B');
    queue.push('A');

    assertEquals("", "AB", queue.traverse());
  }

  @Test
  public void emptyQueueShouldReturnTrueOnIsEmpty() {
    assertTrue("", queue.isEmpty()); 
  }

  @Test
  public void nonEmptyQueueShouldReturnFalseOnIsEmpty() {
    queue.push('A');
    assertFalse("", queue.isEmpty());
  }

}
