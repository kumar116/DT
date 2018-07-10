package com.kumarsoumya.collection;

import static org.junit.Assert.*;

import java.lang.Character;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class QueueTest {

  private Character[] datas = {'A', 'B', 'C'};

  @Test
  public void testPeek() {
    Queue<Character> queue = new Queue<Character>();
    assertEquals("Empty Queue should return null on peek()", null, queue.peek());

    for (Character data: datas) {
      queue.push(data);
    }
    assertEquals(null, new Character('A'), queue.peek());
  }

  @Test
  public void testPop() {
    Queue<Character> queue = new Queue<Character>();
    assertEquals("Empty Queue should return null on pop()", null, queue.pop());

    for (Character data: datas) {
      queue.push(data);
    }

    assertEquals(null, new Character('A'), Character.valueOf(queue.pop()));
  }

  @Test
  public void testPush() {
    Queue<Character> queue = new Queue<Character>();
    for (Character data: datas) {
      queue.push(data);
    }

    assertEquals(null, "[C,B,A]", queue.toString());
  }

}
