package com.kumarsoumya.collection;

public class BinarySearchTree<T extends Comparable<T>> {

  private Node<T> head;

  protected class Node<E> {
    public E data;
    public Node<E> left;
    public Node<E> right;

    public Node(E data) {
      this.data = data;
    }
  }

  public boolean insert(T data) {
    if (data == null) {
      return false;
    }
    head = insert(head, data);
    return true;
  }

  private Node<T> insert(Node<T> head, T data) {
    if (null == head) {
      head = new Node<T>(data);
    } else {
      T value = head.data;
      if (value.compareTo(data) >= 0) {
        head.left = insert(head.left, data);
      } else {
        head.right = insert(head.right, data);
      }
    }
    return head;
  }

  public void delete(T data) {
    head = delete(head, data);
  }

  private Node<T> delete(Node<T> head, T data) {
    if (null == head) {
      return head;
    }

    T value = head.data;
    if (value.compareTo(data) < 0) {
      head.right = delete(head.right, data);
    } else if (value.compareTo(data) > 0) {
      head.left = delete(head.left, data);
    } else if (value.compareTo(data) == 0) {
      if (null == head.left) {
        return head.right;
      } else if (null == head.right) {
        return head.left;
      } else {
        T tmpData = this.successor(head.right);
        head.data = tmpData;
        head.right = delete(head.right, tmpData);
      }
    }
    return head;
  }

  public String inorder() {
    StringBuilder valueOf = new StringBuilder();
    inorder(head, valueOf);
    return valueOf.toString();
  }

  private void inorder(Node<T> head, StringBuilder valueOf) {
    if (head == null) {
      return;
    }
    this.inorder(head.left, valueOf);
    valueOf.append(String.valueOf(head.data));
    this.inorder(head.right, valueOf);
  }

  public String preorder() {
    StringBuilder valueOf = new StringBuilder();
    preorder(head, valueOf);
    return valueOf.toString();
  }

  private void preorder(Node<T> head, StringBuilder valueOf) {
    if (head == null) {
      return;
    }

    valueOf.append(String.valueOf(head.data));
    preorder(head.left, valueOf);
    preorder(head.right, valueOf);
  }

  public String postorder() {
    StringBuilder valueOf = new StringBuilder();
    postorder(head, valueOf);
    return valueOf.toString();
  }

  private void postorder(Node<T> head, StringBuilder valueOf) {
    if (head == null) {
      return;
    }

    postorder(head.left, valueOf);
    postorder(head.right, valueOf);
    valueOf.append(String.valueOf(head.data));
  }

  public T minimum() {
    if (head == null) {
      return null;
    }
    return minimum(head);
  }

  private T minimum(Node<T> head) {
    if (head.left == null) {
      return head.data;
    }
    return minimum(head.left);
  }

  public T maximum() {
    if (head == null) {
      return null;
    }
    return maximum(head);
  }

  private T maximum(Node<T> head) {
    if (head.right == null) {
      return head.data;
    }
    return maximum(head.right);
  }

  public T search(T data) {
    return search(head, data);
  }

  private T search(Node<T> head, T data) {
    if (head == null) {
      return null;
    } else {
      T value = head.data;
      if (value.compareTo(data) == 0) {
        return head.data;
      } else if (value.compareTo(data) < 0) {
        return search(head.right, data);
      } else {
        return search(head.left, data);
      }
    }
  }

  private T successor(Node<T> head) {
    if (null != head.left && null != head.right) {
      return head.data;
    }
    return successor(head.left);
  }

}
