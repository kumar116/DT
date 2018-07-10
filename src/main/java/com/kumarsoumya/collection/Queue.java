package com.kumarsoumya.collection;

public class Queue<T> extends LinkedList<T> {

  public void push(T data) {
    addToHead(data);
  }

  public T pop() {
    return popFromTail();
  }

  public T peek() {
    return (tail != null) ? tail.data : null;
  }

  public boolean isEmpty() {
    return size == 0;
  }
}
