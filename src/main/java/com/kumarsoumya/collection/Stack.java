package com.kumarsoumya.collection;

public class Stack<T extends Comparable<T>> extends LinkedList<T> {

  public boolean push(T data) {
    if (data == null) {
      return false;
    }
    addToHead(data);
    return true;
  }

  public T pop() {
    Node<T> node = popFromHead();
    return (this.isEmpty()) ? null : node.data;
  }

  public T peek() {
    return (this.isEmpty()) ? null : head.data;
  }

}
